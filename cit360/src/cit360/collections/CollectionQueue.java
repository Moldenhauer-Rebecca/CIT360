/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author crmol
 */
/*The Queue collection is used to hold elements ready to be processed. FIFO */ 

public class CollectionQueue {
    public static void main(String[] args){
        Queue<String> waitingCamper = new LinkedList<>();
        
        //add new elements to Queue
        waitingCamper.add("Anderson");
        waitingCamper.add("Douglas");
        waitingCamper.add("Brady");
        waitingCamper.add("Johnson");
        waitingCamper.add("Walker");
        waitingCamper.add("Reynolds");
        
        //Print out waiting Queue
        System.out.println("Waiting Camper List : "+ waitingCamper);
        
        //Removing an element from the Queue using remove()
        //The remove() method throws NoSuchElementException if the Queue is empty
        String camperName = waitingCamper.remove();
        System.out.println("Removed from Waiting Camper list : "+ camperName + " | New Waiting Camper list : " + waitingCamper);
        
        //removing element from Queue using poll()
        //The poll() method is like remove() except it returns null if Queue is empty
        camperName = waitingCamper.poll();
        System.out.println("Removed from Waiting List : " + camperName + " | New waiting List : " + waitingCamper);
    }
    
}
