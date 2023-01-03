/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionSystem;
import bankapp.BankAccount;
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
    private final BankAccount _fromBankAccount;
    private final BankAccount _toBankAccount;
    private final LocalDate _transactionDate;
    private final UUID _transactionId;
    private TransactionStatus _status;
    private TransactionType _type;

    public BigDecimal getMoney() {
        return _money;
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
    
    public Transaction(BigDecimal money, BankAccount fromBankAccount, BankAccount toBankAccount) {
        _money = money;
        _fromBankAccount = fromBankAccount;
        _toBankAccount = toBankAccount;
        _status = TransactionStatus.Pending;
        _transactionDate = LocalDate.now();
        _transactionId = UUID.randomUUID();
        DetermineTransactionType(fromBankAccount, toBankAccount);
    }
    
    private void DetermineTransactionType(BankAccount fromBankAccount, BankAccount toBankAccount) throws IllegalArgumentException {
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
        // TODO: Add check if the BankAccount exist before adding or removing money from it
        boolean transferMoneyRemoved = false;
        try {
            if(_type == TransactionType.Deposit) {
                _toBankAccount.AddMoney(_money);
            }
            else if(_type == TransactionType.Withdraw) {
                _fromBankAccount.RemoveMoney(_money);
            }
            else if(_type == TransactionType.Transfer) {
                _fromBankAccount.RemoveMoney(_money);
                transferMoneyRemoved = true;
                _toBankAccount.AddMoney(_money);
            }
        } catch (Exception e) {
            _status = TransactionStatus.Failded;
            
            //If in the transfer transaction the removal of money has passed, but the adding has failed
            //Return the removed money
            if(_type == TransactionType.Transfer && transferMoneyRemoved) {
                _fromBankAccount.AddMoney(_money);
            }
        }
    }
}
