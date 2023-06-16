/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.lang.reflect.Constructor;
import javax.swing.JFrame;

/**
 *
 * @author Moni
 */
public class FramesController {
    private Application app;
    
    public FramesController(Application app) {
        this.app = app;
    }
    
    // Creates a new frame of the specified FrameType
    public void openFrame(FrameType frameType) {
        Class<? extends JFrame> frameClass = frameType.getFrameClass();
        
        try {
            Constructor<? extends JFrame> frameConstructor = frameClass.getConstructor(Application.class, FramesController.class);
            frameConstructor.newInstance(app, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Creates a new frame of the specified FrameType and pass the given data to it
    public void openFrame(FrameType frameType, Object data) {
        Class<? extends JFrame> frameClass = frameType.getFrameClass();
        
        try {
            Constructor<? extends JFrame> frameConstructor = frameClass.getConstructor(Application.class, FramesController.class, Object.class);
            frameConstructor.newInstance(app, this, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
