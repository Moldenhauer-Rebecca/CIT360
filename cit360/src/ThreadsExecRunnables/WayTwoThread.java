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
public class WayTwoThread {
     public static void main(String[] args) {
        System.out.println("Main thread starting here. ");
        
        //call the start method on TaskTwo object. It extends the thread class
        new TaskTwo().start();
       
        //capture thread reference
        //second instance of TaskTwo with the variable t
       
        Thread t = new TaskTwo();
        t.start();
             
        System.out.println("Main thread finishes here. ");
    }
    
}

class TaskTwo extends Thread { 
    
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
    
    //task id
    public TaskTwo(){
        this.taskid = ++count;
    }
    
}
