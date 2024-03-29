/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PlannedPayments.Loans;

import PlannedPayments.PlannedPayment;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Moni
 */
public class Loan extends PlannedPayment implements Serializable {
    private LoanType loanType;
    
    public Loan(LoanType loanType, String bankAccountIban, BigDecimal money, String name) throws LoanLimitExceededException {
        super(loanType.getReturnDate(), bankAccountIban, calculateReturnMoney(loanType, money), name);
        
        //This will throw error if the taken monet are greater than the loan limit
        if(money.compareTo(loanType.LOAN_LIMIT) > 0) {
            throw new LoanLimitExceededException(
                    String.format("The loan limit(%s) has been exceeded",
                          loanType.LOAN_LIMIT.toPlainString())
            );
        }
        
        this.loanType = loanType;
    }
    
    // Calculates the money that must be returned by taking into account the loanType
    private static BigDecimal calculateReturnMoney(LoanType loanType, BigDecimal money) {
        return money.add(money.multiply(loanType.getInterestRateForCalculations()));
    }

    // Returns the String representation of the loan
    @Override
    public String toString() {
        return String.format("(LOAN) %s - %s %s", getName(), getPaymentDate(), getMoney());
    }
}
