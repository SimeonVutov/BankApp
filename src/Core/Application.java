/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.List;
import PlannedPayments.PlannedPayment;
import TransactionSystem.Transaction;
import Users.User;
import bankapp.BankAccount;
import java.util.LinkedList;
import Database.DataSource;
import Database.InvalidUserCredentialsException;
import TransactionSystem.TransactionManager;

/**
 *
 * @author Moni
 */
public class Application {
    private User _user;
    private List<BankAccount> _bankAccounts;
    private List<Transaction> _transactions;
    private List<PlannedPayment> _plannedPayments;
    
    public Application() {
        _user = null;
        _bankAccounts = new LinkedList<>();
        _transactions = new LinkedList<>();
        _plannedPayments = new LinkedList<>();
        
        refreshUserInformation();
    }
    
    public void logIn(String username, char[] password) throws InvalidUserCredentialsException {
        try {
            User user = DataSource.DATA_SOURCE.getUserByCredentials(username, password);
            _user = user;
            refreshUserInformation();
        } catch (InvalidUserCredentialsException e) {
            throw e;
        }
    }
    
    public void logOut() {
        _user = null;
        _bankAccounts = new LinkedList<>();
        _transactions = new LinkedList<>();
        _plannedPayments = new LinkedList<>();
    }
    
    public void refreshUserInformation() {
        _bankAccounts = DataSource.DATA_SOURCE.getBankAccountsForUser(_user);
        
        for(var bankAccount : _bankAccounts) {
            _transactions.addAll(
                    TransactionManager.TRANSACTION_MANAGER.getTransactionsByBankAccountIban(
                            bankAccount.getIban()
                    )
            );
            
            _plannedPayments.addAll(
                    DataSource.DATA_SOURCE.getPlannedPaymentsByBankAccountIban(
                            bankAccount.getIban()
                    )
            );
        }
    }
    
    public User getUser() {
        return _user;
    }
    
    public List<BankAccount> getAllBankAccounts() {
        return _bankAccounts;
    }
    
    public BankAccount getBankAccountByIban(String iban) {
        for(var bankAccount : _bankAccounts) {
            if(bankAccount.getIban().equals(iban)) {
                return bankAccount;
            }
        }
        
        return null;
    }
    
    public List<Transaction> getTransactionForBankAccount(String iban) {
        return TransactionManager.TRANSACTION_MANAGER.getTransactionsByBankAccountIban(iban);
    }
    
    public List<Transaction> getAllTransactions() {
        return _transactions;
    }
}
