/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Frames.EditFrames;

import javax.swing.JFrame;

/**
 *
 * @author Moni
 */
public abstract class EditFrame extends JFrame{
    private DataChangedEvent _dataChangedEvent = new DataChangedEvent(this);

    public DataChangedEvent getDataChangedEvent() {
        return _dataChangedEvent;
    }
}
