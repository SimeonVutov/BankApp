/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionSystem;

import bankapp.BankAccount;
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
    
    public void CreateTransaction(BigDecimal money, BankAccount fromBankAccount, BankAccount toBankAccount) {
        Transaction newTransaction = new Transaction(money, fromBankAccount, toBankAccount);
        _transactions.add(newTransaction);
        // TODO: Save the transaction to the database if its creation is successful
        _transactionProcessor.AddTransactionToQueue(newTransaction);
    }
}
