/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Moni
 */

// This exception is typically thrown when user authentication fails due to invalid credentials
public class InvalidUserCredentialsException extends Exception {
    public InvalidUserCredentialsException(String message) {
        super(message);
    }
}
