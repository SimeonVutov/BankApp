/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TransactionSystem;

import Core.DataChangedEvent;
import java.time.Duration;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Simeon_32
 */
public class TransactionProcessor implements Runnable {
    private BlockingQueue<Transaction> _pendingTransactions;
    private Semaphore _semaphore = new Semaphore(1);
    private volatile boolean _running = true;
    private Thread thread;
    private Duration _processorWaitTime;
    private DataChangedEvent _dataChangedEvent;
    
    public DataChangedEvent getDataChangedEvent() {
        return _dataChangedEvent;
    }
    
    public TransactionProcessor(Duration processorWaitTime) {
        _pendingTransactions = new LinkedBlockingQueue<Transaction>();
        _processorWaitTime = processorWaitTime;
        _dataChangedEvent = new DataChangedEvent(this);
    }

    public void Start() {
        thread = new Thread(this);
        thread.start();
    }
    
    public void Resume() {
        _semaphore.release();
    }
    
    public void Stop() {
        _running = false;
        _semaphore.release();
    }
    
    public void addTransactionToQueue(Transaction transaction) {
        _pendingTransactions.add(transaction);
    }

    @Override
    public void run() {
        while (true) {
            // Try to acquire the semaphore
            if (!_semaphore.tryAcquire()) {
                // Semaphore not available, exit the loop
                break;
            }

            // Check the running flag
            if (!_running) {
                // Flag is false, release the semaphore and exit the loop
                _semaphore.release();
                break;
            }

            Transaction transaction = _pendingTransactions.poll();
            if (transaction != null) {
                transaction.Execute();
            } else {
                try {
                    _dataChangedEvent.fireDataChangedEvent();
                    Thread.sleep(_processorWaitTime);
                } catch (InterruptedException e) {
                    // Interrupted, release the semaphore and exit the loop
                    _semaphore.release();
                    break;
                }
            }

            _semaphore.release();
        }
    }
}
