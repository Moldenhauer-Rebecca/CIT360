/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnableExecutors;


public class Task extends Thread {

    private Thread t;
    private String tName;

    Task(String name) {
        tName = name;
        System.out.println("Creating " + tName);

    }

    @Override
    public void run() {
        System.out.println("Running " + tName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + tName + ", " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
            }
        } finally {
            System.out.println("Thread " + tName + " exiting.");
        }
    }

    @Override
    public void start() {
        System.out.println("Starting " + tName);
        if (t == null) {
            t = new Thread(this, tName);
            t.start();
        }
    }
}
