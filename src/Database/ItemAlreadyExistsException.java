/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Moni
 */
public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException(String errorMessage) {
        super(errorMessage);
    }
}
