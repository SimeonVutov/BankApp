/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Frames.EditFrames;

import Core.DataEditedEvent;
import javax.swing.JFrame;

/**
 *
 * @author Moni
 */
public abstract class EditFrame extends JFrame{
    private DataEditedEvent _dataEditedEvent = new DataEditedEvent(this);

    public DataEditedEvent getDataEditedEvent() {
        return _dataEditedEvent;
    }
}
