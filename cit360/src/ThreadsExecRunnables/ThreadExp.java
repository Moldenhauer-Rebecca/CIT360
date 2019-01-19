/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecRunnables;

/**
 *
 * @author crmol
 */
public class ThreadExp implements Runnable {
    
    private final String command;
    private final int number;
    
    public ThreadExp(String s, int num){
        this.command = s;
        this.number=num;
    }

    @Override
    public void run() {
        int num2 = number * number;
        
        System.out.println("Number " + number + " Squared = " + num2 + ". request = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }
    
    private void processCommand(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override 
    public String toString(){
        return this.command;
    }
        
        
    
}

