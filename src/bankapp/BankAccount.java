/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

import java.util.UUID;

/**
 *
 * @author Moni
 */
public class BankAccount {
    private final String _iban;
    private double _balance;
    private TransactionHistory _transactionHistory;
    
    public BankAccount() {
        _transactionHistory = new TransactionHistory();
        _iban = UUID.randomUUID().toString();
        _balance = 0;
    }

    public String getIban() {
        return _iban;
    }

    public double getBalance() {
        return _balance;
    }

    public TransactionHistory getTransactionHistory() {
        return _transactionHistory;
    }
    
    public void DepositMoney(double amountOfMoney) {
        AddMoney(amountOfMoney);
        
        DepositTransaction depositTransaction = new DepositTransaction(amountOfMoney, this);
        _transactionHistory.AddTransaction(depositTransaction);
    }
    
    public void TransferMoney(double amountOfMoney, BankAccount toBankAccount) {
        RemoveMoney(amountOfMoney);
        
        TransferTransaction transferTransaction = new TransferTransaction(amountOfMoney, this, toBankAccount);
        _transactionHistory.AddTransaction(transferTransaction);
        
        TransferTransaction oppositeTransaction = new TransferTransaction(amountOfMoney, toBankAccount, this);
        toBankAccount.AddMoney(amountOfMoney);
        toBankAccount._transactionHistory.AddTransaction(oppositeTransaction);
    }
    
    public void WithdrawMoney(double amountOfMoney) {
        RemoveMoney(amountOfMoney);
        
        NegativeTransaction negativeTransaction = new NegativeTransaction(amountOfMoney, this);
        _transactionHistory.AddTransaction(negativeTransaction);
    }
    
    private void AddMoney(double amountOfMoney) throws IllegalArgumentException {
        if(amountOfMoney < 0) {
            throw new IllegalArgumentException("The amount of money cannot be less than zero");
        }
        _balance += amountOfMoney;
    }
    
    private void RemoveMoney(double amountOfMoney) throws IllegalArgumentException {
        if(amountOfMoney < 0) {
            throw new IllegalArgumentException("The amount of money cannot be less than zero");
        }
        _balance -= amountOfMoney;
    }
}
