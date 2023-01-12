/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankapp;
import Core.Application;
import Core.FramesController;
import Core.FrameType;

/**
 *
 * @author Moni
 */
public class BankApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application app = new Application();
        FramesController framesController = new FramesController(app);
        
        framesController.OpenFrame(FrameType.LOGIN_FRAME);
    }
}
