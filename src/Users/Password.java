/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Users;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

/**
 *
 * @author Simeon_32
 */
public class Password implements Serializable {
    private static final String ALGORITHM = "SHA-256";
    private static final int SALT_SIZE = 16;
    
    private byte[] salt;
    private byte[] hash;
    
    public Password(char[] password) {
        SecureRandom random = new SecureRandom();
        salt = new byte[SALT_SIZE];
        random.nextBytes(salt);
        
        var hashedPass = hashPassword(password);
        
        if(hashedPass != null) {
            hash = hashedPass;
            
            // Clear the password from memory
            Arrays.fill(password, Character.MIN_VALUE);
        }
    }
    
    public Password(String encoded) {
        String[] parts = encoded.split("`");
        salt = Base64.getDecoder().decode(parts[0]);
        hash = Base64.getDecoder().decode(parts[1]);
    }
    
    // Checks if the given password matches the current password
    public boolean verify(char[] password) {
        byte[] testHash = hashPassword(password);
        
        if(testHash != null) {
            // Clear the password from memory
            Arrays.fill(password, Character.MIN_VALUE);
            
            return Arrays.equals(hash, testHash);
        }
        
        return false;
    }
    
    // Changes the current password to the specified one
    public void changePassword(char[] newPassword) {
        SecureRandom random = new SecureRandom();
        salt = new byte[SALT_SIZE];
        random.nextBytes(salt);

        var hashedPass = hashPassword(newPassword);
        
        if(hashedPass != null) {
            hash = hashedPass;
            
            // Clear the password from memory
            Arrays.fill(newPassword, Character.MIN_VALUE);
        }
    }
    
    // Performs a hash function on the given password
    private byte[] hashPassword(char[] password) {
        try {
            MessageDigest md = MessageDigest.getInstance(ALGORITHM);
            md.update(salt);
            return md.digest(new String(password).getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    } // Time complexity - O(n) | Space complexity - O(n)
    
    // Returns the string representation of a password
    @Override
    public String toString() {
        return Base64.getEncoder().encodeToString(salt) + "`" +
                Base64.getEncoder().encodeToString(hash);
    }
}
