/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PlannedPayments.Loans;

import java.time.LocalDate;

/**
 *
 * @author Moni
 */
public class ShortTermLoanType extends LoanType {
    public ShortTermLoanType() {
        //The interest rate is set here
        super(5);
    }
    
    @Override
    public LocalDate getReturnDate() {
        return LocalDate.now().plusMonths(1);
    }

    @Override
    public String getLoanName() {
        return "Short Term Loan";
    }
}
