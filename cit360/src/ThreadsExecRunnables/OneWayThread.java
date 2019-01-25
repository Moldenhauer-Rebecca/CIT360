/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecRunnables;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author crmol
 */

//Thread object and the runnable implemenation both are provided by the same TaskOne class
//The start method is started from the constructor of TaskOne itself
public class OneWayThread {
    
    public static void main(String[] args) {
        System.out.println("Main thread starting here. ");
        
        new TaskOne();
        //capture thread reference
        Thread t = new TaskOne();
             
        System.out.println("Main thread finishes here. ");
    }
    
}

class TaskOne extends Thread { 
    
    private static int count = 0;
    private int taskid;
    
    @Override
    public void run() {
        for (int i=10; i>0; i--) {
            System.out.println("<" + taskid + "> Working On " + i);
            
            //allow for delay in the loop
            try{
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    //call the start method of the thread class to start the thread of execution
    public TaskOne(){
        this.taskid = ++count;
        this.start();
    }
   
}