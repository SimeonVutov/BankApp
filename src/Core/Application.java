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
import Database.ItemAlreadyExistsException;
import TransactionSystem.TransactionManager;
import Users.Person;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

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
        setDefaultUserInformation();
        
        refreshUserInformation();
    }
    
    public void logIn(String username, char[] password) throws InvalidUserCredentialsException {
        User user = DataSource.DATA_SOURCE.getUserByCredentials(username, password);
        _user = user;
        refreshUserInformation();
    }
    
    public void signUp(Person person, String username, char[] password, String email) throws ItemAlreadyExistsException, InvalidUserCredentialsException {
        User user = new User(person, username, password, email);
        DataSource.DATA_SOURCE.addUser(user);
        logIn(username, password);
    }
    
    public void logOut() {
        setDefaultUserInformation();
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
    
    private void setDefaultUserInformation() {
        _user = null;
        _bankAccounts = new LinkedList<>();
        _transactions = new LinkedList<>();
        _plannedPayments = new LinkedList<>();
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
    
    public List<Transaction> getTransactionsForBankAccount(String iban) {
        return TransactionManager.TRANSACTION_MANAGER.getTransactionsByBankAccountIban(iban);
    }
    
    public List<Transaction> getAllTransactions() {
        return _transactions;
    }
    
    public void createBankAccount(String name) throws ItemAlreadyExistsException {
        BankAccount newBankAccount = new BankAccount(name, _user.getUserId());
        DataSource.DATA_SOURCE.addBankAccount(newBankAccount);
        _bankAccounts.add(newBankAccount);
    }
    
    public void removeBankAccount(String iban) {
        DataSource.DATA_SOURCE.removeBankAccount(iban);
        for(var bankAccount : _bankAccounts) {
            if(bankAccount.getIban().equals(iban)) {
                _bankAccounts.remove(iban);
                
                //only one bankAccount with this iban is possible
                break;
            }
        }
    }
    
    public void createTransaction(String fromBankAccountIban, String toBankAccountIban) throws IllegalArgumentException, ItemAlreadyExistsException {
        TransactionManager.TRANSACTION_MANAGER.createTransaction(
                BigDecimal.ONE, fromBankAccountIban, toBankAccountIban
        );
    }
    
    public void createPlannedPayment(LocalDate paymentDate, String bankAccountIban, BigDecimal money, String name) throws ItemAlreadyExistsException {
        PlannedPayment newPlannedPayment = new PlannedPayment(paymentDate, bankAccountIban, money, name);
        DataSource.DATA_SOURCE.addPlannedPayment(newPlannedPayment);
        _plannedPayments.add(newPlannedPayment);
    }
    
    public void removePlannedPayment(UUID id) {
        DataSource.DATA_SOURCE.removePlannedPayment(id);
        
        for(var plannedPayment : _plannedPayments) {
            if(plannedPayment.getId().equals(id)) {
                _plannedPayments.remove(plannedPayment);
                
                //only one planned payment with this id is possible
                break;
            }
        }
    }
}
