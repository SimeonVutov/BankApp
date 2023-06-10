/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PlannedPayments.Loans;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Simeon
 */
public abstract class LoanType {
    protected final BigDecimal INTEREST_RATE;
    protected final BigDecimal LOAN_LIMIT;
    
    public LoanType(float interestRate, BigDecimal loanLimit) {
        //The interestRate is converted from percentage
        INTEREST_RATE = new BigDecimal(interestRate / 100);
        LOAN_LIMIT = loanLimit;
    }
    
    public BigDecimal getInterestRate() {
        return INTEREST_RATE;
    }
    
    public BigDecimal loanLimit() {
        return LOAN_LIMIT;
    }

    public abstract LocalDate getReturnDate();
    public abstract String getLoanName();
}
