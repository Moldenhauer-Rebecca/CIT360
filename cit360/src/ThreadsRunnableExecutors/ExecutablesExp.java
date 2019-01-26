/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnableExecutors;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author crmol
 */
public class ExecutablesExp {
    
    public void runExecutables() throws InterruptedException {
        CallablesExp callablesExp = new CallablesExp();
        
        ExecutorService executor = Executors.newWorkStealingPool();
        
        List<Callable<String>> callables = Arrays.asList(
        callablesExp.createTask("task4", 2),
        callablesExp.createTask("task5", 1),
        callablesExp.createTask("task6", 3));
        
        executor.invokeAll(callables)
                .stream().map(future -> {
                    try {
                        return future.get();
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                });
    }
    
    
}
