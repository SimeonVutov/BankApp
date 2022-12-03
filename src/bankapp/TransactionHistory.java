/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Moni
 */
public class TransactionHistory {
    private ArrayList<Transaction> _transactions;
    
    public TransactionHistory() {
        _transactions = new ArrayList<>();
    }
    
    public Transaction getTransactionById(UUID id) {
        for(Transaction transaction : _transactions) {
            if(transaction.getId().compareTo(id) == 0) {
                return transaction;
            }
        }
        return null;
    }
    
    public void AddTransaction(Transaction transaction) {
        _transactions.add(transaction);
    }
    
    public void RemoveTransaction(Transaction transaction) {
        _transactions.remove(transaction);
    }
    
    public void ResetHistory() {
        _transactions.clear();
    }
}
