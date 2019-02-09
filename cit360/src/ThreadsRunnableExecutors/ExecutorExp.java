/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnableExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExp {

    //here is a class that extends thread which will start a new thread when called.
    public static class Task2 extends Thread {

        @Override
        public void run() {
            System.out.println("Hello World");
        }
    }

    //main method in this program. Holing all call to the different types of threads
    //the executor. The pool specifies how many threads to run at the same time.
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        //loop to call a new thread each time and pass the number to the workThread class
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkThread("" + i, i);
            executor.execute(worker);
        }
        //shuts down the threads
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        //prints threads are complete.
        System.out.println("Threads are complete");

        // calls class task2
        Thread myThread = new Task2();
        myThread.start();

        // calls class runnableExp, passes the name of the thread
        RunnableExp R1 = new RunnableExp("Thread-1");
        R1.start();

        RunnableExp R2 = new RunnableExp("Thread-2");
        R2.start();

    }

}
