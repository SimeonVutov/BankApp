/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PlannedPayments.Loans;

/**
 *
 * @author Moni
 */
public class LoanLimitExceededException extends Exception {
    public LoanLimitExceededException(String errorMessage) {
        super(errorMessage);
    }
}
