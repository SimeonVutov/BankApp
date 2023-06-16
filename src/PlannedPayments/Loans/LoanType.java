/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PlannedPayments.Loans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Simeon
 */
public abstract class LoanType implements Serializable {
    protected final BigDecimal INTEREST_RATE;
    protected final BigDecimal LOAN_LIMIT;
    
    public LoanType(BigDecimal interestRate, BigDecimal loanLimit) {
        //The interestRate is converted from percentage
        INTEREST_RATE = interestRate;
        LOAN_LIMIT = loanLimit;
    }
    
    // Returns the interest rate in percentages
    public BigDecimal getInterestRate() {
        return INTEREST_RATE;
    }

    // Returns the interest rate by converting it from percetages to a decimal number
    public BigDecimal getInterestRateForCalculations() {
        return INTEREST_RATE.divide(new BigDecimal(100));
    }
    
    // Returns the loan limit
    public BigDecimal loanLimit() {
        return LOAN_LIMIT;
    }

    // Returns the return date
    public abstract LocalDate getReturnDate();
    // Returns the String representation of the specific loan
    @Override
    public abstract String toString();
}
