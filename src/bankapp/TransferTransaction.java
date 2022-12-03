/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author Moni
 */
public class TransferTransaction extends Transaction{
    private BankAccount _fromBankAccount;
    private BankAccount _toBankAccount;
    
    public TransferTransaction(double transactionMoney, BankAccount fromBankAccount, BankAccount toBankAccount) {
        super(transactionMoney);
        _fromBankAccount = fromBankAccount;
        _toBankAccount = toBankAccount;
    }

    public BankAccount getFromBankAccount() {
        return _fromBankAccount;
    }

    public BankAccount getToBankAccount() {
        return _toBankAccount;
    }
}
