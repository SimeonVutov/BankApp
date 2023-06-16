/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.EventObject;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Moni
 */
public class DataRefreshEvent extends EventObject {
    private List<DataRefreshListener> listeners;
    
    public DataRefreshEvent(Object source) {
        super(source);
        listeners = new LinkedList<>();
    }
    
    // Adds a listener to the event
    public void addListener(DataRefreshListener listener) {
        listeners.add(listener);
    }
    
    // Removes a listener to the event
    public void removeListener(DataRefreshListener listener) {
        listeners.remove(listener);
    }
    
    // Fire the event which notifies all listeners
    public void fireDataRefreshEvent() {
        for(DataRefreshListener listener : listeners) {
            listener.onDataRefreshEvent();
        }
    }
}
