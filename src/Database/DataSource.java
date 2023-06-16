/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Database;

import java.util.HashMap;
import java.util.UUID;
import Users.User;
import BankAccount.BankAccount;
import TransactionSystem.Transaction;
import PlannedPayments.PlannedPayment;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Simeon_32
 */
public class DataSource {
    private final String APPLICATION_NAME = "BankApp";
    public static final DataSource DATA_SOURCE = new DataSource();
    private HashMap<UUID, User> users;
    private FileController<User> usersFileController;
    
    private HashMap<String, BankAccount> bankAccounts;
    private FileController<BankAccount> bankAccountsFileController;
    
    private HashMap<UUID, Transaction> transactions;
    private FileController<Transaction> transactionsFileController;
    
    private HashMap<UUID, PlannedPayment> plannedPayments;
    private FileController<PlannedPayment> plannedPaymentsFileController;
    
    // Initializes the file controllers for data storage and loads all the data
    private DataSource() {
        Path tempPath = Paths.get(System.getProperty("java.io.tmpdir")).resolve(APPLICATION_NAME);

        usersFileController = new FileController(tempPath.resolve("users.txt"));
        bankAccountsFileController = new FileController<>(tempPath.resolve("bankAccounts.txt"));
        transactionsFileController = new FileController<>(tempPath.resolve("transactions.txt"));
        plannedPaymentsFileController = new FileController<>(tempPath.resolve("plannedPayments.txt"));
        
        loadAllData();
    }
    
    // Saves the new user to the database
    public void addUser(User user) throws ItemAlreadyExistsException {
        for (User currUser : users.values()) {
            if(currUser.getUsername().equals(user.getUsername())) {
                throw new ItemAlreadyExistsException("User with this username already exists");
            }
        }
        
        if(users.containsKey(user.getUserId().toString())) {
            throw new ItemAlreadyExistsException("User with this id already exists.");
        }
        else {
            users.put(user.getUserId(), user);
            usersFileController.save(users);
        }
    }
    
    // Deletes the user with the specified id
    public void removeUser(UUID userId) {
        users.remove(userId);
        usersFileController.save(users);
    }
    
    // Saves the new bank account to the database
    public void addBankAccount(BankAccount bankAccount) throws ItemAlreadyExistsException {
        if(bankAccounts.containsKey(bankAccount.getIban())) {
            throw new ItemAlreadyExistsException("Bank account with this iban already exists");
        }
        else {
            bankAccounts.put(bankAccount.getIban(), bankAccount);
            bankAccountsFileController.save(bankAccounts);
        }
    }
    
    // Deletes the bank account with the specified iban
    public void removeBankAccount(String iban) {
        bankAccounts.remove(iban);
        bankAccountsFileController.save(bankAccounts);
    }
    
    // Saves the new transaction to the database
    public void addTransaction(Transaction transaction) throws ItemAlreadyExistsException {
        if(transactions.containsKey(transaction.getTransactionId())) {
            throw new ItemAlreadyExistsException("Transaction with this id already exists");
        }
        else {
            transactions.put(transaction.getTransactionId(), transaction);
            transactionsFileController.save(transactions);
        }
    }
    
    // Delete the transaction with the specified id
    public void removeTransaction(UUID transactionId) {
        transactions.remove(transactionId);
        transactionsFileController.save(transactions);
    }
    
    // Saves the new planned payment to the database
    public void addPlannedPayment(PlannedPayment plannedPayment) throws ItemAlreadyExistsException {
        if(plannedPayments.containsKey(plannedPayment.getId())) {
            throw new ItemAlreadyExistsException("Planned payment with this id already exists.");
        }
        else {
            plannedPayments.put(plannedPayment.getId(), plannedPayment);
            plannedPaymentsFileController.save(plannedPayments);
        }
    }
    
    // Deletes a planned payment with the specified id from the database
    public void removePlannedPayment(UUID plannedPaymentId) {
        plannedPayments.remove(plannedPaymentId);
        plannedPaymentsFileController.save(plannedPayments);
    }
    
    // Returns the user with the specified id
    public User getUserById(UUID id) {
        return users.get(id);
    }
    
    // Returns the user with the specified username and password
    public User getUserByCredentials(String username, char[] password) throws InvalidUserCredentialsException {
        for(User user : users.values()) {
            if(user.getUsername().equals(username)) {
                if(user.getPassword().verify(password)) {
                    return user;
                }
            }
        }
        
        throw new InvalidUserCredentialsException("Username or password is wrong.");
    } // Time complexity - O(n) | Space complexity - O(1)
    
    // Returns the bank account with the specified iban
    public BankAccount getBankAccountByIban(String iban) {
        return bankAccounts.get(iban);
    }
    
    // Returns all bank accounts for the specified user
    public List<BankAccount> getBankAccountsForUser(User user) {
        List<BankAccount> list = new ArrayList<>();
        
        for(BankAccount bankAccount : bankAccounts.values()) {
            if(bankAccount.getUserId().equals(user.getUserId())) {
                list.add(bankAccount);
            }
        }
        
        return list;
    } // Time complexity - O(n) | Space complexity - O(n)
    
    // Returns a transaction with the specified id
    public Transaction getTransactionById(UUID id) {
        return transactions.get(id);
    }
    
    // Returns all transactions
    public List<Transaction> getTransactions() {
        return new LinkedList<>(transactions.values());
    }
    
    // Returns all planned payments by specified bank account iban
    public List<PlannedPayment> getPlannedPaymentsByBankAccountIban(String iban) {
        List<PlannedPayment> list = new ArrayList<>();
        
        for(PlannedPayment plannedPayment : plannedPayments.values()) {
            if(plannedPayment.getBankAccountIban().equals(iban)) {
                list.add(plannedPayment);
            }
        }
        
        return list;
    } // Time complexity - O(n) | Space complexity - O(n
    
    // Loads all data from the database
    public void loadAllData() {
        HashMap<UUID, User> loadedUsers = (HashMap<UUID, User>) usersFileController.load();
        if(loadedUsers != null) {
            users = loadedUsers;
        }
        else {
            users = new HashMap<>();
        }
        
        HashMap<String, BankAccount> loadedBankAccounts = (HashMap<String, BankAccount>) bankAccountsFileController.load();
        if(loadedBankAccounts != null) {
            bankAccounts = loadedBankAccounts;
        }
        else {
            bankAccounts = new HashMap<>();
        }
        
        HashMap<UUID, Transaction> loadedTransactions = (HashMap<UUID, Transaction>) transactionsFileController.load();
        if(loadedTransactions != null) {
            transactions = loadedTransactions;
        }
        else {
            transactions = new HashMap<>();
        }
        
        HashMap<UUID, PlannedPayment> loadedPlannedPayments = (HashMap<UUID, PlannedPayment>) plannedPaymentsFileController.load();
        if(loadedPlannedPayments != null) {
            plannedPayments = loadedPlannedPayments;
        }
        else {
            plannedPayments = new HashMap<>();
        }
    }
    
    // Saves all data to the database
    public void saveAllData() {
        usersFileController.save(users);
        bankAccountsFileController.save(bankAccounts);
        transactionsFileController.save(transactions);
        plannedPaymentsFileController.save(plannedPayments);
    }
}