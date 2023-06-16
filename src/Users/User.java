/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Users;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Simeon_32
 */
public class User implements Serializable {
    private Person person;
    private String username;
    private Password password;
    private String email;
    private String phoneNumber;
    private final UUID userId;

    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Password getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public UUID getUserId() {
        return userId;
    }
    
    public User(Person person, String username, char[] password, String email, String phoneNumber) {
        this.person = person;
        this.username = username;
        this.password = new Password(password);
        this.email = email;
        this.phoneNumber = phoneNumber;
        userId = UUID.randomUUID();
    }
}
