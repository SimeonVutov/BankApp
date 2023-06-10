/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PlannedPayments.Loans;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

/**
 *
 * @author Simeon
 */
public abstract class LoanType {
    protected final BigDecimal INTEREST_RATE;
    protected final BigDecimal LOAN_LIMIT;
    
    public LoanType(BigDecimal interestRate, BigDecimal loanLimit) {
        //The interestRate is converted from percentage
        INTEREST_RATE = interestRate;
        LOAN_LIMIT = loanLimit;
    }
    
    public BigDecimal getInterestRate() {
        return INTEREST_RATE;
    }

    public BigDecimal getInterestRateForCalculations() {
        return INTEREST_RATE.divide(new BigDecimal(100));
    }
    
    public BigDecimal loanLimit() {
        return LOAN_LIMIT;
    }

    public abstract LocalDate getReturnDate();
    @Override
    public abstract String toString();
}
