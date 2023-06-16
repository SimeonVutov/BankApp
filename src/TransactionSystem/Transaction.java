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
    private final BigDecimal money;
    private final String fromBankAccountIban;
    private final String toBankAccountIban;
    private final LocalDate transactionDate;
    private final UUID transactionId;
    private TransactionStatus status;
    private TransactionType type;

    public BigDecimal getMoney() {
        return money;
    }
    
    public String getFromBankAccountIban() {
        return fromBankAccountIban;
    }
    
    public String getToBankAccountIban() {
        return toBankAccountIban;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public UUID getTransactionId() {
        return transactionId;
    }
    
    public Transaction(BigDecimal money, String fromBankAccountIban, String toBankAccountIban) throws IllegalArgumentException {
        this.money = money;
        this.fromBankAccountIban = fromBankAccountIban;
        this.toBankAccountIban = toBankAccountIban;
        status = TransactionStatus.Pending;
        transactionDate = LocalDate.now();
        transactionId = UUID.randomUUID();
        determineTransactionType(fromBankAccountIban, toBankAccountIban);
    }
    
    // Determines the transaction type based on the information within the transaction
    private void determineTransactionType(String fromBankAccount, String toBankAccount) throws IllegalArgumentException {
        if(fromBankAccount == null && toBankAccount == null) {
            throw new IllegalArgumentException("Invalid transaction.");
        }
        else if(fromBankAccount != null && toBankAccount == null) {
            type = TransactionType.Withdraw;
        }
        else if(fromBankAccount == null && toBankAccount != null) {
            type = TransactionType.Deposit;
        }
        else if(fromBankAccount != null && toBankAccount != null) {
            type = TransactionType.Transfer;
        }
    } // Time - O(1) | Space - O(1)
    
    // Executes the transaction based on its type and updates the status of the transaction accordingly
    public void execute() {
        boolean transferMoneyRemoved = false;
        try {
            // Deposit transaction has only toBankAccount
            // This is the bank account in which the money will be added
            if(type == TransactionType.Deposit) {
                BankAccount toBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(toBankAccountIban);
                
                if(toBankAccount != null) {
                    toBankAccount.addMoney(money);
                    status = TransactionStatus.Succeded;
                }
                else {
                    status = TransactionStatus.Failed;
                }
            }
            // Withdraw transaction has only fromBankAccount
            // This is the bank account from which the money will be removed
            else if(type == TransactionType.Withdraw) {
                BankAccount fromBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(fromBankAccountIban);
                
                if(fromBankAccount != null) {
                    fromBankAccount.removeMoney(money);
                    status = TransactionStatus.Succeded;
                }
                else {
                    status = TransactionStatus.Failed;
                }
            }
            
            // Transfer has both fromBankAccount and toBankAccount
            // The money will be transfered from the first account to the second
            else if(type == TransactionType.Transfer) {
                BankAccount fromBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(fromBankAccountIban);
                BankAccount toBankAccount = DataSource.DATA_SOURCE.getBankAccountByIban(toBankAccountIban);
                
                if(fromBankAccount != null && toBankAccount != null) {
                    fromBankAccount.removeMoney(money);
                    transferMoneyRemoved = true;
                    toBankAccount.addMoney(money);
                    status = TransactionStatus.Succeded;
                }
                else {
                    status = TransactionStatus.Failed;
                }
            }
        } catch (Exception e) {
            status = TransactionStatus.Failed;
            
            //If in the transfer transaction the removal of money has passed, but the adding has failed
            //Return the removed money
            if(type == TransactionType.Transfer && transferMoneyRemoved) {
                DataSource.DATA_SOURCE.getBankAccountByIban(fromBankAccountIban).addMoney(money);
            }
        }
    }
    
    // Returns string representation of the transaction
    @Override
    public String toString() {
        if(type == TransactionType.Deposit) {
            return String.format("%s %s Amount: %s Date: %s Status: %S",
                    type,
                    toBankAccountIban,
                    money,
                    transactionDate.toString(),
                    status
            );
        }
        else if(type == TransactionType.Withdraw) {
            return String.format("%s %s Amount: %s Date: %s Status: %S",
                    type,
                    fromBankAccountIban,
                    money,
                    transactionDate.toString(),
                    status
            );
        }
        else if(type == TransactionType.Transfer) {
            return String.format("%s %s->%s Amount: %s Date: %s Status: %S",
                    type,
                    fromBankAccountIban,
                    toBankAccountIban,
                    money,
                    transactionDate.toString(),
                    status
            );
        }
        
        return "";
    }
}
