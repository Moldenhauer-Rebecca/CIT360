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
public class RunnableExp {

    private Runnable task1;
    private Runnable task2;
    private Runnable task3;

    public void setTaskData() {
        this.task1 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Task 1 running on " + threadName);
        };

        this.task2 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Task 2 running on " + threadName);
        };

        this.task3 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Thread 3 running on " + threadName);
        };
        
    }
    
    public Runnable getTask1() {
        return task1;
    }

    public Runnable getTask2() {
        return task2;
    }

    public Runnable getTask3() {
        return task3;
    }
    
    public Runnable createTask(String name, long waitTime) {
        Runnable task;
        task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("This is " + name + " running on " + threadName
            + " with a wait time of " + waitTime);
        };
        return task;
    }
}

