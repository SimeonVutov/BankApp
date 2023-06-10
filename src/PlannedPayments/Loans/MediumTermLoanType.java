/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PlannedPayments.Loans;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Moni
 */
public class MediumTermLoanType extends LoanType{
    public MediumTermLoanType() {
        //The interest rate is set here
        //The loan limit is set here
        super(new BigDecimal(2.5), new BigDecimal(10000));
    }
    
    @Override
    public LocalDate getReturnDate() {
        return LocalDate.now().plusYears(1);
    }

    @Override
    public String toString() {
        return String.format(
                "Medium Term Loan(%s%% for %s)",
                getInterestRate(),
                "1 year"
        );
    }
}
