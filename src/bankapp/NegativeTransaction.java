/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author Moni
 */
public class NegativeTransaction extends Transaction{
    private BankAccount _fromBankAccount;
    
    public NegativeTransaction(double transactionMoney, BankAccount fromBankAccount) {
        super(transactionMoney);
        _fromBankAccount = fromBankAccount;
    }

    public BankAccount getFromBankAccount() {
        return _fromBankAccount;
    }
}
