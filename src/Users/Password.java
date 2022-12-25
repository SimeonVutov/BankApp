/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Users;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

/**
 *
 * @author Simeon_32
 */
public class Password implements java.io.Serializable {
    private static final String ALGORITHM = "SHA-256";
    private static final int SALT_SIZE = 16;
    
    private byte[] salt;
    private byte[] hash;
    
    public Password(char[] password) throws Exception {
        SecureRandom random = new SecureRandom();
        salt = new byte[SALT_SIZE];
        random.nextBytes(salt);
        
        hash = hashPassword(password);
        
        // Clear the password from memory
        Arrays.fill(password, Character.MIN_VALUE);
    }
    
    public Password(String encoded) {
        String[] parts = encoded.split(":");
        salt = Base64.getDecoder().decode(parts[0]);
        hash = Base64.getDecoder().decode(parts[1]);
    }
    
    public boolean verify(char[] password) throws Exception {
        byte[] testHash = hashPassword(password);
                
        // Clear the password from memory
        Arrays.fill(password, Character.MIN_VALUE);

        return Arrays.equals(hash, testHash);
    }
    
    public void changePassword(char[] newPassword) throws Exception {
        SecureRandom random = new SecureRandom();
        salt = new byte[SALT_SIZE];
        random.nextBytes(salt);

        hash = hashPassword(newPassword);
        
        // Clear the password from memory
        Arrays.fill(newPassword, Character.MIN_VALUE);
    }
    
    private byte[] hashPassword(char[] password) throws Exception {
        MessageDigest md = MessageDigest.getInstance(ALGORITHM);
        md.update(salt);
        return md.digest(new String(password).getBytes("UTF-8"));
    }
    
    @Override
    public String toString() {
        return Base64.getEncoder().encodeToString(salt) + ":" +
                Base64.getEncoder().encodeToString(hash);
    }
}
