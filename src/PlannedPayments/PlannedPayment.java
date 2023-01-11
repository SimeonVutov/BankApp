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
    
    public boolean IsPaymentOverdue() {
        return _paymentDate.isAfter(LocalDate.now());
    }
    
    public void Pay() throws IllegalArgumentException, ItemAlreadyExistsException {
        TransactionSystem.TransactionManager.TRANSACTION_MANAGER.createTransaction(_money, _bankAccountIban, null);
    }
}
