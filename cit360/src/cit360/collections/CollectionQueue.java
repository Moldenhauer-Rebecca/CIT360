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
        Queue<String> waitingPet = new LinkedList<>();
        
        //add new elements to Queue
        waitingPet.add("Fluffy");
        waitingPet.add("Spot");
        waitingPet.add("Charlie");
        waitingPet.add("Diesel");
        waitingPet.add("Luna");
        waitingPet.add("Walle");
        
        //Print out waiting Queue
        System.out.println("Waiting Pet List : "+ waitingPet);
        
        //Removing an element from the Queue using remove()
        //The remove() method throws NoSuchElementException if the Queue is empty
        String petName = waitingPet.remove();
        System.out.println("Removed from waitngPet : "+ petName + " | New waitingPet : " + waitingPet);
        
        //removing element from Queue using poll()
        //The poll() method is like remove() except it returns null if Queue is empty
        petName = waitingPet.poll();
        System.out.println("Removed from Waiting List : " + petName + " | New waiting List : " + waitingPet);
    }
    
}
