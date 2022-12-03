/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;


public class DepositTransaction extends Transaction {
    private BankAccount _toBankAccount;
    
    public DepositTransaction(double transactionMoney, BankAccount toBankAccount) {
        super(transactionMoney);
        _toBankAccount = toBankAccount;
    }

    public BankAccount getToBankAccount() {
        return _toBankAccount;
    }
}
