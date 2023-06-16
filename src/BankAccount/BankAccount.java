/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

import java.math.BigDecimal;
import java.util.UUID;
import java.io.Serializable;

/**
 *
 * @author Moni
 */
public class BankAccount implements Serializable {
    private final String iban;
    private BigDecimal balance;
    private String name;
    private final UUID userId;

    public String getIban() {
        return iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public UUID getUserId() {
        return userId;
    }
    
    public BankAccount(String name, UUID userId) {
        iban = IBANGenerator.generate("BG");
        balance = BigDecimal.ZERO;
        this.name = name;
        this.userId = userId;
    }
    
    // Adds a given amount of money to the bank account
    public void addMoney(BigDecimal amountOfMoney) throws IllegalArgumentException {
        if(amountOfMoney.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("The amount of money cannot be equal or less than zero");
        }
        
        balance = balance.add(amountOfMoney);
    }
    
    // Removes a given amount of money from the bank account
    public void removeMoney(BigDecimal amountOfMoney) throws IllegalArgumentException, InsufficientFundsException {
        if(amountOfMoney.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("The amount of money cannot be equal or less than zero");
        }
        if(amountOfMoney.compareTo(balance) > 0) {
            throw new InsufficientFundsException(amountOfMoney);
        }
        
        balance = balance.subtract(amountOfMoney);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s", name, iban);
    }
}
