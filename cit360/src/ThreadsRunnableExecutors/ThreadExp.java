/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnableExecutors;


public class ThreadExp {

    public static void main(String a[]) {

        Task R1 = new Task("Thread-1");
        R1.start();

        Task R2 = new Task("Thread-2");
        R2.start();

    }

}
