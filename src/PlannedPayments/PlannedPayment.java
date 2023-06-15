/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlannedPayments;

import Database.ItemAlreadyExistsException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
import TransactionSystem.Transaction;

/**
 *
 * @author Moni
 */
public class PlannedPayment implements Serializable {
    private LocalDate _paymentDate;
    private String _bankAccountIban;
    private BigDecimal _money;
    private String _name;
    private UUID _id;

    public LocalDate getPaymentDate() {
        return _paymentDate;
    }

    public String getBankAccountIban() {
        return _bankAccountIban;
    }

    public BigDecimal getMoney() {
        return _money;
    }

    public String getName() {
        return _name;
    }
    
    public UUID getId() {
        return _id;
    }
    
    public PlannedPayment(LocalDate paymentDate, String bankAccountIban,BigDecimal money, String name) {
        _paymentDate = paymentDate;
        _bankAccountIban = bankAccountIban;
        _money = money;
        _name = name;
        _id = UUID.randomUUID();
    }
    
    // Checks if the payment overdue by comparing the payment date and the current date
    public boolean IsPaymentOverdue() {
        return _paymentDate.isBefore(LocalDate.now());
    }
    
    // Pays the planned payment by creating transaction
    public Transaction Pay() throws IllegalArgumentException, ItemAlreadyExistsException {
        return TransactionSystem.TransactionManager.TRANSACTION_MANAGER.createTransaction(_money, _bankAccountIban, null);
    }
    
    // Returns string representation of the planned payment
    @Override
    public String toString() {
        return String.format("%s - %s %s", _name, _paymentDate.toString(), _money.toString());
    }
}
