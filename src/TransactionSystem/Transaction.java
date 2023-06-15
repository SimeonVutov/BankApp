/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionSystem;
import BankAccount.BankAccount;
import Database.DataSource;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
import java.io.Serializable;
/**
 *
 * @author Simeon_32
 */
public class Transaction implements Serializable {
    private final BigDecimal _money;
    private final String _fromBankAccountIban;
    private final String _toBankAccountIban;
    private final LocalDate _transactionDate;
    private final UUID _transactionId;
    private TransactionStatus _status;
    private TransactionType _type;

    public BigDecimal getMoney() {
        return _money;
    }
    
    public String getFromBankAccountIban() {
        return _fromBankAccountIban;
    }
    
    public String getToBankAccountIban() {
        return _toBankAccountIban;
    }

    public TransactionStatus getStatus() {
        return _status;
    }

    public TransactionType getType() {
        return _type;
    }

    public LocalDate getTransactionDate() {
        return _transactionDate;
    }

    public UUID getTransactionId() {
        return _transactionId;
    }
    
    public Transaction(BigDecimal money, String fromBankAccountIban, String toBankAccountIban) throws IllegalArgumentException {
        _money = money;
        _fromBankAccountIban = fromBankAccountIban;
        _toBankAccountIban = toBankAccountIban;
        _status = TransactionStatus.Pending;
        _transactionDate = LocalDate.now();
        _transactionId = UUID.randomUUID();
        DetermineTransactionType(fromBankAccountIban, toBankAccountIban);
    }
    
    // Determines the transaction type based on the information within the transaction
    private void DetermineTransactionType(String fromBankAccount, String toBankAccount) throws IllegalArgumentException {
        if(fromBankAccount == null && toBankAccount == null) {
            throw new IllegalArgumentException("Invalid transaction.");
        }
        else if(fromBankAccount != null && toBankAccount == null) {
            _type = TransactionType.Withdraw;
        }
        else if(fromBankAccount == null && toBankAccount != null) {
            _type = TransactionType.Deposit;
        }
        else if(fromBankAccount != null && toBankAccount != null) {
            _type = TransactionType.Transfer;
        }
    } // Time - O(1) | Space - O(1)
    
    // Executes the transaction based on its type and updates the status of the transaction accordingly
    public void Execute() {
        boolean transferMoneyRemoved = false;
        try {
            // Deposit transaction has only toBankAccount
            // This is the bank account in which the money will be added
            if(_type == TransactionType.Deposit) {
                BankAccount toBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(_toBankAccountIban);
                
                if(toBankAccount != null) {
                    toBankAccount.AddMoney(_money);
                    _status = TransactionStatus.Succeded;
                }
                else {
                    _status = TransactionStatus.Failed;
                }
            }
            // Withdraw transaction has only fromBankAccount
            // This is the bank account from which the money will be removed
            else if(_type == TransactionType.Withdraw) {
                BankAccount fromBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(_fromBankAccountIban);
                
                if(fromBankAccount != null) {
                    fromBankAccount.RemoveMoney(_money);
                    _status = TransactionStatus.Succeded;
                }
                else {
                    _status = TransactionStatus.Failed;
                }
            }
            
            // Transfer has both fromBankAccount and toBankAccount
            // The money will be transfered from the first account to the second
            else if(_type == TransactionType.Transfer) {
                BankAccount fromBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(_fromBankAccountIban);
                BankAccount toBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(_toBankAccountIban);
                
                if(fromBankAccount != null && toBankAccount != null) {
                    fromBankAccount.RemoveMoney(_money);
                    transferMoneyRemoved = true;
                    toBankAccount.AddMoney(_money);
                    _status = TransactionStatus.Succeded;
                }
                else {
                    _status = TransactionStatus.Failed;
                }
            }
        } catch (Exception e) {
            _status = TransactionStatus.Failed;
            
            //If in the transfer transaction the removal of money has passed, but the adding has failed
            //Return the removed money
            if(_type == TransactionType.Transfer && transferMoneyRemoved) {
                DataSource.DATA_SOURCE.getBankAccountByIban(_fromBankAccountIban).AddMoney(_money);
            }
        }
    }
    
    // Returns string representation of the transaction
    @Override
    public String toString() {
        if(_type == TransactionType.Deposit) {
            return String.format("%s %s Amount: %s Date: %s Status: %S",
                    _type,
                    _toBankAccountIban,
                    _money,
                    _transactionDate.toString(),
                    _status
            );
        }
        else if(_type == TransactionType.Withdraw) {
            return String.format("%s %s Amount: %s Date: %s Status: %S",
                    _type,
                    _fromBankAccountIban,
                    _money,
                    _transactionDate.toString(),
                    _status
            );
        }
        else if(_type == TransactionType.Transfer) {
            return String.format("%s %s->%s Amount: %s Date: %s Status: %S",
                    _type,
                    _fromBankAccountIban,
                    _toBankAccountIban,
                    _money,
                    _transactionDate.toString(),
                    _status
            );
        }
        
        return "";
    }
}
