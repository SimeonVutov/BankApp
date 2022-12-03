/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

import java.time.LocalDate;
import java.util.UUID;

public class Transaction {
    private final LocalDate _dateOfTransaction;
    //can be positive and negative depending on the transaction
    private final double _transactionMoney;
    private final UUID _id;

    public LocalDate getDateOfTransaction() {
        return _dateOfTransaction;
    }

    public double getTransactionMoney() {
        return _transactionMoney;
    }
    
    public UUID getId() {
        return _id;
    }
    
    public Transaction(double transactionMoney) {
        _dateOfTransaction = LocalDate.now();
        _transactionMoney = transactionMoney;
        _id = UUID.randomUUID();
    }
}
