package Users;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.time.LocalDate;

/**
 *
 * @author Simeon_32
 */
public class Person {
    private String _firstName;
    private String _secondName;
    private String _lastName;
    private LocalDate _birthDate;

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String _firstName) {
        _firstName = _firstName;
    }

    public String getSecondName() {
        return _secondName;
    }

    public void setSecondName(String _secondName) {
        _secondName = _secondName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String _lastName) {
        _lastName = _lastName;
    }

    public LocalDate getBirthDate() {
        return _birthDate;
    }

    public void setBirthDate(LocalDate _birthDate) {
        _birthDate = _birthDate;
    }
    
    public Person(String firstName, String secondName, String lastName, LocalDate birthDate) {
        _firstName = firstName;
        _secondName = secondName;
        _lastName = lastName;
        _birthDate = birthDate;
    }
}