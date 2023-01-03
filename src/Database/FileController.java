/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Database;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Simeon_32
 */
public class FileController<T> {
    private T _saveObj;
    private Path _filePath;
    
    public FileController(T saveObj, Path path) {
        _filePath = path;
        _saveObj = saveObj;
        
        if(!Files.exists(_filePath)) {
            System.out.println("Directory does not exist " + _filePath);
            try {
                Files.createDirectories(path.getParent());
                Files.createFile(path);
                System.out.println("Directory created: " + _filePath);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void Save() {
        File file = new File(_filePath.toString());
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(_saveObj);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void Load() {
        File file = new File(_filePath.toString());
        
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            _saveObj = (T) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("File is empty");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
