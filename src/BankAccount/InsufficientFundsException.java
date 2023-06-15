/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BankAccount;

import java.math.BigDecimal;

/**
 *
 * @author Simeon_32
 */

// Represents an exception that is thrown when there are insufficient funds for a transaction
public class InsufficientFundsException extends Exception {
    private BigDecimal _needed;

    // Returns the amount of money that is required to fulfill the failed transaction due to insufficient funds
    public BigDecimal getNeeded() {
        return _needed;
    }
    
    public InsufficientFundsException(BigDecimal needed) {
        super("Insufficient Funds");
        _needed = needed;
    }
}
