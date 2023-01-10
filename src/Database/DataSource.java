/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Database;

import java.util.HashMap;
import java.util.UUID;
import Users.User;
import bankapp.BankAccount;
import TransactionSystem.Transaction;
import PlannedPayments.PlannedPayment;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Simeon_32
 */
public class DataSource {
    private final String ApplicationName = "BankApp";
    public static final DataSource DATA_SOURCE = new DataSource();
    private HashMap<UUID, User> _users;
    private FileController<HashMap<UUID, User>> _usersFileController;
    
    private HashMap<String, BankAccount> _bankAccounts;
    private FileController<HashMap<String, BankAccount>> _bankAccountsFileController;
    
    private HashMap<UUID, Transaction> _transactions;
    private FileController<HashMap<UUID, Transaction>> _transactionsFileController;
    
    private HashMap<UUID, PlannedPayment> _plannedPayments;
    private FileController<HashMap<UUID, PlannedPayment>> _plannedPaymentsFileController;
    
    private DataSource() {
        Path tempPath = Paths.get(System.getProperty("java.io.tmpdir")).resolve(ApplicationName);
        _users = new HashMap<>();
        _usersFileController = new FileController(_users, tempPath.resolve("users.txt"));
        
        _bankAccounts = new HashMap<>();
        _bankAccountsFileController = new FileController<>(_bankAccounts, tempPath.resolve("bankAccounts.txt"));
        
        _transactions = new HashMap<>();
        _transactionsFileController = new FileController<>(_transactions, tempPath.resolve("transactions.txt"));
        
        _plannedPayments = new HashMap<>();
        _plannedPaymentsFileController = new FileController<>(_plannedPayments, tempPath.resolve("plannedPayments.txt"));
        
        loadAllData();
        try {
            addPlannedPayment(new PlannedPayment(null, null, null, null));
        } catch (ItemAlreadyExistsException ex) {
            System.out.println(ex);
        }
        System.out.println(_plannedPayments.size());
    }
    
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
            try {
                _users.put(user.getUserId(), user);
            } catch (Exception e) {
                e.printStackTrace();
            }
            _usersFileController.save();
        }
    }
    
    public void removeUser(UUID userId) {
        _users.remove(userId);
        _usersFileController.save();
    }
    
    public void addBankAccount(BankAccount bankAccount) throws ItemAlreadyExistsException {
        if(_bankAccounts.containsKey(bankAccount.getIban())) {
            throw new ItemAlreadyExistsException("Bank account with this iban already exists");
        }
        else {
            _bankAccounts.put(bankAccount.getIban(), bankAccount);
            _bankAccountsFileController.save();
        }
    }
    
    public void removeBankAccount(String iban) {
        _bankAccounts.remove(iban);
        _bankAccountsFileController.save();
    }
    
    public void addTransaction(Transaction transaction) throws ItemAlreadyExistsException {
        if(_transactions.containsKey(transaction.getTransactionId())) {
            throw new ItemAlreadyExistsException("Transaction with this id already exists");
        }
        else {
            _transactions.put(transaction.getTransactionId(), transaction);
            _transactionsFileController.save();
        }
    }
    
    public void removeTransaction(UUID transactionId) {
        _transactions.remove(transactionId);
        _transactionsFileController.save();
    }
    
    public void addPlannedPayment(PlannedPayment plannedPayment) throws ItemAlreadyExistsException {
        if(_plannedPayments.containsKey(plannedPayment.getId())) {
            throw new ItemAlreadyExistsException("Planned payment with this id already exists.");
        }
        else {
            _plannedPayments.put(plannedPayment.getId(), plannedPayment);
            _plannedPaymentsFileController.save();
        }
    }
    
    public void removePlannedPayment(UUID plannedPaymentId) {
        _plannedPayments.remove(plannedPaymentId);
        _plannedPaymentsFileController.save();
    }
    
    public User getUserById(UUID id) {
        return _users.get(id);
    }
    
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
    
    public BankAccount getBankAccountByIban(String iban) {
        return _bankAccounts.get(iban);
    }
    
    public List<BankAccount> getBankAccountsForUser(User user) {
        List<BankAccount> list = new LinkedList<>();
        
        for(var bankAccount : _bankAccounts.values()) {
            if(bankAccount.getUserId().equals(user.getUserId())) {
                list.add(bankAccount);
            }
        }
        
        return list;
    }
    
    public Transaction getTransactionById(UUID id) {
        return _transactions.get(id);
    }
    
    public List<Transaction> getTransactions() {
        return new LinkedList<>(_transactions.values());
    }
    
    public List<PlannedPayment> getPlannedPaymentsByBankAccountIban(String iban) {
        List<PlannedPayment> list = new LinkedList<>();
        
        for(var plannedPayment : _plannedPayments.values()) {
            if(plannedPayment.getBankAccountIban().equals(iban)) {
                list.add(plannedPayment);
            }
        }
        
        return list;
    }
    
    public void loadAllData() {
        _usersFileController.load();
        _bankAccountsFileController.load();
        _transactionsFileController.load();
        _plannedPaymentsFileController.load();
    }
    
    public void saveAllData() {
        _usersFileController.save();
        _bankAccountsFileController.save();
        _transactionsFileController.save();
        _plannedPaymentsFileController.save();
    }
}