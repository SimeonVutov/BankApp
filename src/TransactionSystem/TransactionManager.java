/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionSystem;

import Database.ItemAlreadyExistsException;
import Database.DataSource;
import Core.DataChangedEvent;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Simeon_32
 */
public class TransactionManager {
    public static final TransactionManager TRANSACTION_MANAGER = new TransactionManager(DataSource.DATA_SOURCE.getTransactions());
    private List<Transaction> _transactions;
    private TransactionProcessor _transactionProcessor;
    
    public DataChangedEvent getDataChangedEvent() {
        return _transactionProcessor.getDataChangedEvent();
    }
    
    private TransactionManager(List<Transaction> transactions) {
        _transactions = transactions;
        _transactionProcessor = new TransactionProcessor(5000);
        for (Transaction transaction : transactions) {
            if(transaction.getStatus() == TransactionStatus.Pending) {
                _transactionProcessor.AddTransactionToQueue(transaction);
            }
        }
        _transactionProcessor.Start();
    }
    
    public Transaction createTransaction(BigDecimal money, String fromBankAccountIban, String toBankAccountIban) throws IllegalArgumentException, ItemAlreadyExistsException {
        Transaction newTransaction = new Transaction(money, fromBankAccountIban, toBankAccountIban);
        DataSource.DATA_SOURCE.addTransaction(newTransaction);
        _transactions.add(newTransaction);
        _transactionProcessor.AddTransactionToQueue(newTransaction);
        
        return newTransaction;
    }
    
    public List<Transaction> getTransactionsByBankAccountIban(String iban) {
        List<Transaction> transactions = new LinkedList<>();
        
        for(Transaction transaction : _transactions) {
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
