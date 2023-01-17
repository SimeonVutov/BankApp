/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.List;
import PlannedPayments.PlannedPayment;
import TransactionSystem.Transaction;
import Users.User;
import BankAccount.BankAccount;
import java.util.LinkedList;
import Database.DataSource;
import Database.InvalidUserCredentialsException;
import Database.ItemAlreadyExistsException;
import TransactionSystem.TransactionManager;
import Users.Person;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    }
    
    public void logIn(String username, char[] password) throws InvalidUserCredentialsException {
        User user = DataSource.DATA_SOURCE.getUserByCredentials(username, password);
        _user = user;
        refreshUserInformation();
    }
    
    public void signUp(Person person, String username, char[] password, String email, String phoneNumber) throws ItemAlreadyExistsException, InvalidUserCredentialsException {
        char[] pass = password.clone();
        User user = new User(person, username, password, email, phoneNumber);
        DataSource.DATA_SOURCE.addUser(user);
        System.out.println(pass.length);
        logIn(username, pass);
    }
    
    public void logOut() {
        setDefaultUserInformation();
    }
    
    public void refreshUserInformation() {
        _bankAccounts = DataSource.DATA_SOURCE.getBankAccountsForUser(_user);
        
        for(BankAccount bankAccount : _bankAccounts) {
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
        for(BankAccount bankAccount : _bankAccounts) {
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
    
    public List<PlannedPayment> getAllPlannedPayments() {
        return _plannedPayments;
    }
    
    public List<PlannedPayment> getOverduePlannedPayments() {
        List<PlannedPayment> plannedPayments = new LinkedList<>();
        
        for(PlannedPayment plannedPayment : _plannedPayments) {
            if(plannedPayment.IsPaymentOverdue()) {
                plannedPayments.add(plannedPayment);
            }
        }
        
        return plannedPayments;
    }
    
    public void removeUser(UUID userId) {
        DataSource.DATA_SOURCE.removeUser(userId);
    }
    
    public void createBankAccount(String name) throws ItemAlreadyExistsException {
        BankAccount newBankAccount = new BankAccount(name, _user.getUserId());
        DataSource.DATA_SOURCE.addBankAccount(newBankAccount);
        _bankAccounts.add(newBankAccount);
    }
    
    public void removeBankAccount(BankAccount bankAccount) {
        DataSource.DATA_SOURCE.removeBankAccount(bankAccount.getIban());
        if(bankAccount.getIban().equals(bankAccount.getIban())) {
            _bankAccounts.remove(bankAccount);
        }
    }
    
    public void createTransaction(BigDecimal amountOfMoney, String fromBankAccountIban, String toBankAccountIban) throws IllegalArgumentException, ItemAlreadyExistsException {
        Transaction newTransaction = TransactionManager.TRANSACTION_MANAGER.createTransaction(
            amountOfMoney, fromBankAccountIban, toBankAccountIban
        );
        _transactions.add(newTransaction);
    }
    
    public void createPlannedPayment(LocalDate paymentDate, String bankAccountIban, BigDecimal money, String name) throws ItemAlreadyExistsException {
        PlannedPayment newPlannedPayment = new PlannedPayment(paymentDate, bankAccountIban, money, name);
        DataSource.DATA_SOURCE.addPlannedPayment(newPlannedPayment);
        _plannedPayments.add(newPlannedPayment);
    }
    
    public void payPlannedPayment(PlannedPayment payment) {
        try {
            createTransaction(payment.getMoney(), payment.getBankAccountIban(), null);
            removePlannedPayment(payment.getId());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
        }
    }
    
    public void removePlannedPayment(UUID id) {
        DataSource.DATA_SOURCE.removePlannedPayment(id);
        
        for(PlannedPayment plannedPayment : _plannedPayments) {
            if(plannedPayment.getId().equals(id)) {
                _plannedPayments.remove(plannedPayment);
                
                //only one planned payment with this id is possible
                break;
            }
        }
    }
    
    public void save() {
        DataSource.DATA_SOURCE.saveAllData();
    }
}
