/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnableExecutors;


public class WorkThread implements Runnable {

    private String command;
    private int number;

    public WorkThread(String s, int num) {
        this.command = s;
        this.number = num;
    }

    @Override
    public void run() {
        int number2 = number * number;
        //System.out.println(Thread.currentThread().getName()+"Num = " + number + ". Start. Command = "+command);
        System.out.println("Number " + number + " Squared = " + number2 + ". command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }

}
