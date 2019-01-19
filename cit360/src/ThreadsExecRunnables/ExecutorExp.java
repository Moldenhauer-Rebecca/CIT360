/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecRunnables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author crmol
 */
public class ExecutorExp {
    
    //class extends thread - starting a new thread called
    public static class Task2 extends Thread {
        
        @Override
        public void run(){
            System.out.println("Hello");
        }
    }
    
    public static void main(String[] args){
        //pool specifies the number of threads to run at the same time
        ExecutorService executor = Executors.newFixedThreadPool(5);
       
        //loop calls new thread each time the number to ThreadExp class
        for (int i=0; i<10; i++) {
            Runnable worker = new ThreadExp("" + i, i);
            executor.execute(worker);
        }
        //shuts down threads
        executor.shutdown();
        while(!executor.isTerminated()){
            System.out.println("All Threads finished");
            
            System.out.println("");
            
            Thread nThread = new Task2();
            nThread.start();
            
            RunnableExp T1 = new RunnableExp("Thread-1");
            T1.start();
            
            RunnableExp T2 = new RunnableExp("Thread-2");
            T2.start();
        }
    }
}
