package Users;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;

/**
 *
 * @author Simeon_32
 */
public class Person implements Serializable {
    private String firstName;
    private String secondName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Person(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s", firstName, secondName, lastName);
    }
}
