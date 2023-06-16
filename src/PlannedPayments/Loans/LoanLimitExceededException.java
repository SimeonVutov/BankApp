/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PlannedPayments.Loans;

/**
 *
 * @author Moni
 */
// This error is typically thrown when a loan is created but the lend money exceeds the limit of the loan type
public class LoanLimitExceededException extends Exception {
    public LoanLimitExceededException(String errorMessage) {
        super(errorMessage);
    }
}
