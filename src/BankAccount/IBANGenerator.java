/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

import java.util.Random;

/**
 *
 * @author Moni
 */
public class IBANGenerator {
    private static final int numberOfDigits = 16;
    
    // Generates a unique iban
    // A country code is needed for the process
    public static String generate(String countryCode) {
        Random rand = new Random();
        String result = countryCode;
        
        for(int i = 0; i < numberOfDigits; i++) {
            result += rand.nextInt(10);
        }
        
        return result;
    }
}
