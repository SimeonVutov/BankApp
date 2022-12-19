/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bankapp;

import java.math.BigDecimal;

/**
 *
 * @author Simeon_32
 */
public class InsufficientFundsException extends Exception {
    private BigDecimal _needed;

    public BigDecimal getNeeded() {
        return _needed;
    }
    
    public InsufficientFundsException(BigDecimal needed) {
        super("Insufficient Funds");
        _needed = needed;
    }
}
