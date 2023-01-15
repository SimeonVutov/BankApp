/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Frames.CreateFrames;

import Core.DataCreatedEvent;
import javax.swing.JFrame;

/**
 *
 * @author Moni
 */
public abstract class CreateFrame extends JFrame{
    private DataCreatedEvent _dataCreatedEvent = new DataCreatedEvent(this);
    
    public DataCreatedEvent getDataCreatedEvent() {
        return _dataCreatedEvent;
    }
}
