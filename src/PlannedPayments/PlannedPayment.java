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
    private LocalDate paymentDate;
    private String bankAccountIban;
    private BigDecimal money;
    private String name;
    private UUID id;

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public String getBankAccountIban() {
        return bankAccountIban;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }
    
    public UUID getId() {
        return id;
    }
    
    public PlannedPayment(LocalDate paymentDate, String bankAccountIban,BigDecimal money, String name) {
        this.paymentDate = paymentDate;
        this.bankAccountIban = bankAccountIban;
        this.money = money;
        this.name = name;
        id = UUID.randomUUID();
    }
    
    // Checks if the payment overdue by comparing the payment date and the current date
    public boolean isPaymentOverdue() {
        return paymentDate.isBefore(LocalDate.now());
    }
    
    // Pays the planned payment by creating transaction
    public Transaction pay() throws IllegalArgumentException, ItemAlreadyExistsException {
        return TransactionSystem.TransactionManager.TRANSACTION_MANAGER.createTransaction(money, bankAccountIban, null);
    }
    
    // Returns string representation of the planned payment
    @Override
    public String toString() {
        return String.format("%s - %s %s", name, paymentDate.toString(), money.toString());
    }
}
