/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionSystem;

import Database.ItemAlreadyExistsException;
import Database.DataSource;
import java.math.BigDecimal;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Simeon_32
 */
public class TransactionManager {
    private List<Transaction> _transactions;
    private TransactionProcessor _transactionProcessor;
    
    public TransactionManager() {
        _transactions = new LinkedList<Transaction>();
        _transactionProcessor = new TransactionProcessor(Duration.ofSeconds(5));
        _transactionProcessor.Start();
    }
    
    public TransactionManager(List<Transaction> transactions) {
        _transactions = transactions;
        _transactionProcessor = new TransactionProcessor(Duration.ofSeconds(5));
        for (Transaction transaction : transactions) {
            if(transaction.getStatus() == TransactionStatus.Pending) {
                _transactionProcessor.AddTransactionToQueue(transaction);
            }
        }
        _transactionProcessor.Start();
    }
    
    public void CreateTransaction(BigDecimal money, String fromBankAccountIban, String toBankAccountIban) {
        try {
            Transaction newTransaction = new Transaction(money, fromBankAccountIban, toBankAccountIban);
            DataSource.DATA_SOURCE.addTransaction(newTransaction);
            _transactions.add(newTransaction);
            _transactionProcessor.AddTransactionToQueue(newTransaction);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
        }
    }
    
    public List<Transaction> getTransactionsByBankAccountIban(String iban) {
        List<Transaction> transactions = new LinkedList<>();
        
        for(var transaction : _transactions) {
            String fromBankAccountIban = transaction.getFromBankAccountIban();
            String toBankAccountIban = transaction.getToBankAccountIban();
            
            if(fromBankAccountIban != null && fromBankAccountIban.equals(iban)) {
                transactions.add(transaction);
            }
            else if(toBankAccountIban != null && toBankAccountIban.equals(iban)) {
                transactions.add(transaction);
            }
        }
        
        return transactions;
    }
}
