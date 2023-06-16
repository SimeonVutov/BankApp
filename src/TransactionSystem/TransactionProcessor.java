/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TransactionSystem;

import Core.DataRefreshEvent;
import java.time.Duration;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Simeon_32
 */
public class TransactionProcessor implements Runnable {
    private BlockingQueue<Transaction> pendingTransactions;
    private Semaphore semaphore = new Semaphore(1);
    private volatile boolean running = true;
    private Thread thread;
    private Duration processorWaitTime;
    private DataRefreshEvent dataRefreshEvent;
    
    // Returns the data refresh event for the transaction processor
    public DataRefreshEvent getDataRefreshEvent() {
        return dataRefreshEvent;
    }
    
    public TransactionProcessor(Duration processorWaitTime) {
        pendingTransactions = new LinkedBlockingQueue<Transaction>();
        this.processorWaitTime = processorWaitTime;
        dataRefreshEvent = new DataRefreshEvent(this);
    }

    // Starts the transaction processor thread
    public void start() {
        thread = new Thread(this);
        thread.start();
    }
    
    // Resumes the transaction processor thread if it was paused
    public void resume() {
        semaphore.release();
    }
    
    // Stops the transaction processor thread
    public void stop() {
        running = false;
        semaphore.release();
    }
    
    // Adds a transaction to the pending queue for processing
    public void addTransactionToQueue(Transaction transaction) {
        pendingTransactions.add(transaction);
    }

    // Performs the transaction processing in a continuous loop until the processor is stopped or interrupted
    @Override
    public void run() {
        while (true) {
            // Try to acquire the semaphore
            if (!semaphore.tryAcquire()) {
                // Semaphore not available, exit the loop
                break;
            }

            // Check the running flag
            if (!running) {
                // Flag is false, release the semaphore and exit the loop
                semaphore.release();
                break;
            }

            Transaction transaction = pendingTransactions.poll();
            if (transaction != null) {
                transaction.execute();
            } else {
                try {
                    dataRefreshEvent.fireDataRefreshEvent();
                    Thread.sleep(processorWaitTime.toMillis());
                } catch (InterruptedException e) {
                    // Interrupted, release the semaphore and exit the loop
                    semaphore.release();
                    break;
                }
            }

            semaphore.release();
        }
    }
}
