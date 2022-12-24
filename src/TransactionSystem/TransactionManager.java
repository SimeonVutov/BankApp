/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionSystem;

import bankapp.BankAccount;
import java.math.BigDecimal;
import java.time.Duration;

/**
 *
 * @author Simeon_32
 */
public class TransactionManager {
    private TransactionProcessor _transactionProcessor;
    
    public TransactionManager() {
        _transactionProcessor = new TransactionProcessor(Duration.ofSeconds(5));
        _transactionProcessor.Start();
    }
    
    public void CreateTransaction(BigDecimal money, BankAccount fromBankAccount, BankAccount toBankAccount) {
        Transaction newTransaction = new Transaction(money, fromBankAccount, toBankAccount);
        // TODO: Save the transaction to the database if its creation is successful
        _transactionProcessor.AddTransactionToQueue(newTransaction);
    }
}
