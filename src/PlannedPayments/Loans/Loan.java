/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PlannedPayments.Loans;

import PlannedPayments.PlannedPayment;
import java.math.BigDecimal;

/**
 *
 * @author Moni
 */
public class Loan extends PlannedPayment {
    private LoanType loanType;
    
    public Loan(LoanType loanType, String bankAccountIban, BigDecimal money, String name) {
        super(loanType.getReturnDate(), bankAccountIban, calculateReturnMoney(loanType, money), name);
        this.loanType = loanType;
    }
    
    private static BigDecimal calculateReturnMoney(LoanType loanType, BigDecimal money) {
        return money.add(money.multiply(loanType.INTEREST_RATE));
    }
}
