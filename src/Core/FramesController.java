/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;

/**
 *
 * @author Moni
 */
public class FramesController {
    private Application _app;
    
    public FramesController(Application app) {
        _app = app;
    }
    
    public void OpenFrame(FrameType frameType) {
        Class<? extends JFrame> frameClass = frameType.getFrameClass();

        try {
            Constructor<? extends JFrame> frameConstructor = frameClass.getConstructor();
        
            frameConstructor.newInstance();
        }
        catch(NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
