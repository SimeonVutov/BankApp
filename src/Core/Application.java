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
import PlannedPayments.Loans.Loan;
import PlannedPayments.Loans.LoanLimitExceededException;
import PlannedPayments.Loans.LoanType;
import TransactionSystem.TransactionManager;
import Users.Person;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
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
    }
    
    // Logs in the user
    public void logIn(String username, char[] password) throws InvalidUserCredentialsException {
        User user = DataSource.DATA_SOURCE.getUserByCredentials(username, password);
        _user = user;
        refreshUserInformation();
    }

    // Signs up the user
    public void signUp(Person person, String username, char[] password, String email, String phoneNumber) throws ItemAlreadyExistsException, InvalidUserCredentialsException {
        char[] pass = password.clone();
        User user = new User(person, username, password, email, phoneNumber);
        DataSource.DATA_SOURCE.addUser(user);
        logIn(username, pass);
    }
    
    // Logs out the user
    public void logOut() {
        setDefaultUserInformation();
    }
    
    // Get the up to date information from the database
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
    
    // Clear the user information
    private void setDefaultUserInformation() {
        _user = null;
        _bankAccounts = new ArrayList<>();
        _transactions = new LinkedList<>();
        _plannedPayments = new ArrayList<>();
    }
    
    // Returns the current user
    public User getUser() {
        return _user;
    }
    
    // Returns all bank accounts for the current user
    public List<BankAccount> getAllBankAccounts() {
        return _bankAccounts;
    }
    
    // Returns a bank account by given iban
    public BankAccount getBankAccountByIban(String iban) {
        for(var bankAccount : _bankAccounts) {
            if(bankAccount.getIban().equals(iban)) {
                return bankAccount;
            }
        }
        
        return null;
    }
    
    // Gets all transactions for specific bank account from the database
    public List<Transaction> getTransactionsForBankAccount(String iban) {
        return TransactionManager.TRANSACTION_MANAGER.getTransactionsByBankAccountIban(iban);
    }
    
    // Returns all transactions for the current user
    public List<Transaction> getAllTransactions() {
        return _transactions;
    }
    
    // Returns all planned payments for the current user
    public List<PlannedPayment> getAllPlannedPayments() {
        return _plannedPayments;
    }
    
    // Gets all overdue planned payments for the current user
    public List<PlannedPayment> getOverduePlannedPayments() {
        List<PlannedPayment> plannedPayments = new ArrayList<>();
        
        for(var plannedPayment : _plannedPayments) {
            if(plannedPayment.IsPaymentOverdue()) {
                plannedPayments.add(plannedPayment);
            }
        }
        
        return plannedPayments;
    }
    
    // Deletes a user from the database by ID
    public void removeUser(UUID userId) {
        DataSource.DATA_SOURCE.removeUser(userId);
    }
    
    // Creates a new bank account with specified name
    public void createBankAccount(String name) throws ItemAlreadyExistsException {
        BankAccount newBankAccount = new BankAccount(name, _user.getUserId());
        DataSource.DATA_SOURCE.addBankAccount(newBankAccount);
        _bankAccounts.add(newBankAccount);
    }
    
    // Deletes a bank account from the database
    public void removeBankAccount(BankAccount bankAccount) {
        DataSource.DATA_SOURCE.removeBankAccount(bankAccount.getIban());
        if(bankAccount.getIban().equals(bankAccount.getIban())) {
            _bankAccounts.remove(bankAccount);
        }
    }
    
    // Creates a new transation
    public void createTransaction(BigDecimal amountOfMoney, String fromBankAccountIban, String toBankAccountIban) throws IllegalArgumentException, ItemAlreadyExistsException {
        Transaction newTransaction = TransactionManager.TRANSACTION_MANAGER.createTransaction(
            amountOfMoney, fromBankAccountIban, toBankAccountIban
        );
        _transactions.add(newTransaction);
    }
    
    // Creates a new planned payment
    public void createPlannedPayment(LocalDate paymentDate, String bankAccountIban, BigDecimal money, String name) throws ItemAlreadyExistsException {
        PlannedPayment newPlannedPayment = new PlannedPayment(paymentDate, bankAccountIban, money, name);
        DataSource.DATA_SOURCE.addPlannedPayment(newPlannedPayment);
        _plannedPayments.add(newPlannedPayment);
    }
    
    // Creates a new loan
    public void createLoan(LoanType loanType, String bankAccountIban, BigDecimal money, String name) throws LoanLimitExceededException, ItemAlreadyExistsException {
        Loan loan = new Loan(loanType, bankAccountIban, money, name);
        DataSource.DATA_SOURCE.addPlannedPayment(loan);
        _plannedPayments.add(loan);
    }
    
    // Pays a given planned payment
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
    
    // Deletes planned payment by given id
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
    
    // Saves all of the data for the current user
    public void save() {
        DataSource.DATA_SOURCE.saveAllData();
    }
}
