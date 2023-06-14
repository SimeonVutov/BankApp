/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PlannedPayments.Loans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Moni
 */
public class LongTermLoanType extends LoanType implements Serializable {
    public LongTermLoanType() {
        //The interest rate is set here
        //The loan limit is set here
        super(new BigDecimal(1), new BigDecimal(100000));
    }
    
    // The return rate for this loan is current date plus 5 years
    @Override
    public LocalDate getReturnDate() {
        return LocalDate.now().plusYears(5);
    }

    @Override
    public String toString() {
        return String.format(
                "Long Term Loan(%s%% for %s)",
                getInterestRate(),
                "5 years"
        );
    }
}
