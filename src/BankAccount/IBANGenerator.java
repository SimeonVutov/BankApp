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
    private static final int _numberOfDigits = 16;
    
    public static String Generate(String countryCode) {
        Random rand = new Random();
        String result = countryCode;
        
        for(int i = 0; i < _numberOfDigits; i++) {
            result += rand.nextInt(10);
        }
        
        return result;
    }
}
