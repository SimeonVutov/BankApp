/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Moni
 */

// This exception is typically thrown when attempting to add an item that already exists in the database,
// such as adding a duplicate entry or creating a new item with a unique identifier that is already in use
public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException(String errorMessage) {
        super(errorMessage);
    }
}
