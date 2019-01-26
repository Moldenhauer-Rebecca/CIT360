/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnableExecutors;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crmol
 */
public class ThreadExp {
    
     public void runThreads() {
        RunnableExp tasks = new RunnableExp();
        tasks.setTaskData();
        Runnable Task1 = tasks.getTask1();
        Runnable Task2 = tasks.getTask2();
        Runnable Task3 = tasks.getTask3();
        
        Thread simpleThread1 = new Thread(Task1);
        simpleThread1.start();
        Thread simpleThread2 = new Thread(Task2);
        simpleThread2.start();
        Thread simpleThread3 = new Thread(Task3);
        simpleThread3.start();
        
        /*This allows for simple Thread1 to finish before moving on
        Without this the thread moves on and the program continues and mixes
        the executor results in the console.*/
         try {
             simpleThread1.join();
         } catch (InterruptedException ex) {
             Logger.getLogger(ThreadExp.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }
   
    
}
