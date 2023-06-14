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
    private final String ApplicationName = "BankApp";
    public static final DataSource DATA_SOURCE = new DataSource();
    private HashMap<UUID, User> _users;
    private FileController<User> _usersFileController;
    
    private HashMap<String, BankAccount> _bankAccounts;
    private FileController<BankAccount> _bankAccountsFileController;
    
    private HashMap<UUID, Transaction> _transactions;
    private FileController<Transaction> _transactionsFileController;
    
    private HashMap<UUID, PlannedPayment> _plannedPayments;
    private FileController<PlannedPayment> _plannedPaymentsFileController;
    
    // Initializes the file controllers for data storage and loads all the data
    private DataSource() {
        Path tempPath = Paths.get(System.getProperty("java.io.tmpdir")).resolve(ApplicationName);

        _usersFileController = new FileController(tempPath.resolve("users.txt"));
        _bankAccountsFileController = new FileController<>(tempPath.resolve("bankAccounts.txt"));
        _transactionsFileController = new FileController<>(tempPath.resolve("transactions.txt"));
        _plannedPaymentsFileController = new FileController<>(tempPath.resolve("plannedPayments.txt"));
        
        loadAllData();
    }
    
    // Saves the new user to the database
    public void addUser(User user) throws ItemAlreadyExistsException {
        for (User currUser : _users.values()) {
            if(currUser.getUsername().equals(user.getUsername())) {
                throw new ItemAlreadyExistsException("User with this username already exists");
            }
        }
        
        if(_users.containsKey(user.getUserId().toString())) {
            throw new ItemAlreadyExistsException("User with this id already exists.");
        }
        else {
            _users.put(user.getUserId(), user);
            _usersFileController.save(_users);
        }
    }
    
    // Deletes the user with the specified id
    public void removeUser(UUID userId) {
        _users.remove(userId);
        _usersFileController.save(_users);
    }
    
    // Saves the new bank account to the database
    public void addBankAccount(BankAccount bankAccount) throws ItemAlreadyExistsException {
        if(_bankAccounts.containsKey(bankAccount.getIban())) {
            throw new ItemAlreadyExistsException("Bank account with this iban already exists");
        }
        else {
            _bankAccounts.put(bankAccount.getIban(), bankAccount);
            _bankAccountsFileController.save(_bankAccounts);
        }
    }
    
    // Deletes the bank account with the specified iban
    public void removeBankAccount(String iban) {
        _bankAccounts.remove(iban);
        _bankAccountsFileController.save(_bankAccounts);
    }
    
    // Saves the new transaction to the database
    public void addTransaction(Transaction transaction) throws ItemAlreadyExistsException {
        if(_transactions.containsKey(transaction.getTransactionId())) {
            throw new ItemAlreadyExistsException("Transaction with this id already exists");
        }
        else {
            _transactions.put(transaction.getTransactionId(), transaction);
            _transactionsFileController.save(_transactions);
        }
    }
    
    // Delete the transaction with the specified id
    public void removeTransaction(UUID transactionId) {
        _transactions.remove(transactionId);
        _transactionsFileController.save(_transactions);
    }
    
    // Saves the new planned payment to the database
    public void addPlannedPayment(PlannedPayment plannedPayment) throws ItemAlreadyExistsException {
        if(_plannedPayments.containsKey(plannedPayment.getId())) {
            throw new ItemAlreadyExistsException("Planned payment with this id already exists.");
        }
        else {
            _plannedPayments.put(plannedPayment.getId(), plannedPayment);
            _plannedPaymentsFileController.save(_plannedPayments);
        }
    }
    
    // Deletes a planned payment with the specified id from the database
    public void removePlannedPayment(UUID plannedPaymentId) {
        _plannedPayments.remove(plannedPaymentId);
        _plannedPaymentsFileController.save(_plannedPayments);
    }
    
    // Returns the user with the specified id
    public User getUserById(UUID id) {
        return _users.get(id);
    }
    
    // Returns the user with the specified username and password
    public User getUserByCredentials(String username, char[] password) throws InvalidUserCredentialsException {
        for(var user : _users.values()) {
            if(user.getUsername().equals(username)) {
                if(user.getPassword().verify(password)) {
                    return user;
                }
            }
        }
        
        throw new InvalidUserCredentialsException("Username or password is wrong.");
    }
    
    // Returns the bank account with the specified iban
    public BankAccount getBankAccountByIban(String iban) {
        return _bankAccounts.get(iban);
    }
    
    // Returns all bank accounts for the specified user
    public List<BankAccount> getBankAccountsForUser(User user) {
        List<BankAccount> list = new ArrayList<>();
        
        for(var bankAccount : _bankAccounts.values()) {
            if(bankAccount.getUserId().equals(user.getUserId())) {
                list.add(bankAccount);
            }
        }
        
        return list;
    }
    
    // Returns a transaction with the specified id
    public Transaction getTransactionById(UUID id) {
        return _transactions.get(id);
    }
    
    // Returns all transactions
    public List<Transaction> getTransactions() {
        return new LinkedList<>(_transactions.values());
    }
    
    // Returns all planned payments by specified bank account iban
    public List<PlannedPayment> getPlannedPaymentsByBankAccountIban(String iban) {
        List<PlannedPayment> list = new ArrayList<>();
        
        for(var plannedPayment : _plannedPayments.values()) {
            if(plannedPayment.getBankAccountIban().equals(iban)) {
                list.add(plannedPayment);
            }
        }
        
        return list;
    }
    
    // Loads all data from the database
    public void loadAllData() {
        HashMap<UUID, User> users = (HashMap<UUID, User>) _usersFileController.load();
        if(users != null) {
            _users = users;
        }
        else {
            _users = new HashMap<>();
        }
        
        HashMap<String, BankAccount> bankAccounts = (HashMap<String, BankAccount>) _bankAccountsFileController.load();
        if(bankAccounts != null) {
            _bankAccounts = bankAccounts;
        }
        else {
            _bankAccounts = new HashMap<>();
        }
        
        HashMap<UUID, Transaction> transactions = (HashMap<UUID, Transaction>) _transactionsFileController.load();
        if(transactions != null) {
            _transactions = transactions;
        }
        else {
            _transactions = new HashMap<>();
        }
        
        HashMap<UUID, PlannedPayment> plannedPayments = (HashMap<UUID, PlannedPayment>) _plannedPaymentsFileController.load();
        if(plannedPayments != null) {
            _plannedPayments = plannedPayments;
        }
        else {
            _plannedPayments = new HashMap<>();
        }
    }
    
    // Saves all data to the database
    public void saveAllData() {
        _usersFileController.save(_users);
        _bankAccountsFileController.save(_bankAccounts);
        _transactionsFileController.save(_transactions);
        _plannedPaymentsFileController.save(_plannedPayments);
    }
}