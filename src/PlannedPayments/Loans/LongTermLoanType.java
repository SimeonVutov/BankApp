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
public class LongTermLoanType extends LoanType {

    public LongTermLoanType() {
        //The interest rate is set here
        super(1);
    }
    
    @Override
    public LocalDate getReturnDate() {
        return LocalDate.now().plusYears(5);
    }

    @Override
    public String getLoanName() {
        return "Long Term Loan";
    }
}
