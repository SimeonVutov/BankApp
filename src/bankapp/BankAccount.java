/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

import java.math.BigDecimal;
import java.util.UUID;

/**
 *
 * @author Moni
 */
public class BankAccount {
    private final String _iban;
    private BigDecimal _balance;
    private String _name;
    private UUID _userId;

    public String getIban() {
        return _iban;
    }

    public BigDecimal getBalance() {
        return _balance;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public UUID getUserId() {
        return _userId;
    }
    
    public BankAccount(String name, UUID userId) {
        _iban = IBANGenerator.Generate("BG");
        _balance = BigDecimal.ZERO;
        _name = name;
        _userId = userId;
    }
    
    private void AddMoney(BigDecimal amountOfMoney) throws IllegalArgumentException {
        if(amountOfMoney.compareTo(BigDecimal.ZERO) == -1) {
            throw new IllegalArgumentException("The amount of money cannot be less than zero");
        }
        _balance.add(amountOfMoney);
    }
    
    private void RemoveMoney(BigDecimal amountOfMoney) throws IllegalArgumentException {
        if(amountOfMoney.compareTo(BigDecimal.ZERO) == -1) {
            throw new IllegalArgumentException("The amount of money cannot be less than zero");
        }
        _balance.subtract(amountOfMoney);
    }
}
