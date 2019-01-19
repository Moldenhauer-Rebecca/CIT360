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
public class ThreadExp2 {
    
    public static void main(String a[]){
        
        Task T1 = new Task("Thread-1");
        T1.start();
        
        Task T2 = new Task("Thread-2");
        T2.start();
    }
    
}
