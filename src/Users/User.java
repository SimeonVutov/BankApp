/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Users;

import java.util.UUID;

/**
 *
 * @author Simeon_32
 */
public class User {
    private Person _person;
    private String _username;
    private String _password;
    private String _email;
    private final UUID _userId;

    public Person getPerson() {
        return _person;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String _username) {
        _username = _username;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        _email = _email;
    }
    
    public void setPassword(String password) {
        _password = password;
    }

    public UUID getUserId() {
        return _userId;
    }
    
    public User(Person person, String username, String password, String email) {
        _person = person;
        _username = username;
        _password = password;
        _email = email;
        _userId = UUID.randomUUID();
    }
    
    public User(Person person, String username, String password, String email, UUID userId) {
        _person = person;
        _username = username;
        _password = password;
        _email = email;
        _userId = userId;
    }
    
    public boolean doesPasswordMatch(String password) {
        return _password.equals(password);
    }
}
