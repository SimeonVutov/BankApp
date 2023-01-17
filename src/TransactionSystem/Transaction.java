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
    }
    
    public void Execute() {
        boolean transferMoneyRemoved = false;
        try {
            if(_type == TransactionType.Deposit) {
                BankAccount toBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(_toBankAccountIban);
                
                if(toBankAccount != null) {
                    toBankAccount.AddMoney(_money);
                    _status = TransactionStatus.Succeded;
                }
                else {
                    _status = TransactionStatus.Faild;
                }
            }
            else if(_type == TransactionType.Withdraw) {
                BankAccount fromBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(_fromBankAccountIban);
                
                if(fromBankAccount != null) {
                    fromBankAccount.RemoveMoney(_money);
                    _status = TransactionStatus.Succeded;
                }
                else {
                    _status = TransactionStatus.Faild;
                }
            }
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
                    _status = TransactionStatus.Faild;
                }
            }
        } catch (Exception e) {
            _status = TransactionStatus.Faild;
            
            //If in the transfer transaction the removal of money has passed, but the adding has failed
            //Return the removed money
            if(_type == TransactionType.Transfer && transferMoneyRemoved) {
                DataSource.DATA_SOURCE.getBankAccountByIban(_fromBankAccountIban).AddMoney(_money);
            }
        }
    }
    
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
