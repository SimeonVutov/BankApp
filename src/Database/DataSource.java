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
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Simeon_32
 */
public class DataSource {
    private final String ApplicationName = "BankApp";
    private HashMap<UUID, User> _users;
    private FileController<HashMap<UUID, User>> _usersFileController;
    
    private HashMap<String, BankAccount> _bankAccounts;
    private FileController<HashMap<String, BankAccount>> _bankAccountsFileController;
    
    private HashMap<UUID, Transaction> _transactions;
    private FileController<HashMap<UUID, Transaction>> _transactionsFileController;
    
    public DataSource() {
        Path tempPath = Paths.get(System.getProperty("java.io.tmpdir")).resolve(ApplicationName);
        _users = new HashMap<>();
        _usersFileController = new FileController(_users, tempPath.resolve("users.txt"));
        
        _bankAccounts = new HashMap<>();
        _bankAccountsFileController = new FileController<>(_bankAccounts, tempPath.resolve("bankAccounts.txt"));
        
        _transactions = new HashMap<>();
        _transactionsFileController = new FileController<>(_transactions, tempPath.resolve("transactions.txt"));
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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            _usersFileController.Save();
        }
    }
    
    public void addBankAccount(BankAccount bankAccount) throws ItemAlreadyExistsException {
        if(_bankAccounts.containsKey(bankAccount.getIban())) {
            throw new ItemAlreadyExistsException("Bank account with this iban already exists");
        }
        else {
            _bankAccounts.put(bankAccount.getIban(), bankAccount);
            _bankAccountsFileController.Save();
        }
    }
    
    public void addTransaction(Transaction transaction) throws ItemAlreadyExistsException {
        if(_transactions.containsKey(transaction)) {
            throw new ItemAlreadyExistsException("Transaction with this id already exists");
        }
        else {
            _transactions.put(transaction.getTransactionId(), transaction);
            _transactionsFileController.Save();
        }
    }
    
    public void loadAllData() {
        _usersFileController.Load();
        _bankAccountsFileController.Load();
        _transactionsFileController.Load();
    }
    
    public void saveAllData() {
        _usersFileController.Save();
        _bankAccountsFileController.Save();
        _transactionsFileController.Save();
    }
}
