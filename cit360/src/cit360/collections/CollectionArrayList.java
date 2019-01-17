/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author crmol
 */

/* A collection is a object that groups multiple elements in a single unit
Collections can store, retrieve, manipulate and communicate aggregate data. 
collections can be stored in an ARRAY, SET, MAP, QUEUE OR TREE.
List can contain duplicated and elements are ordered.*/

public class CollectionArrayList {
     public static void main(String args[]) {
        
        ArrayList<String> groomers = new ArrayList<>();
        //add items to the ArrayList
        groomers.add("Suzie");
        groomers.add("Bob");
        groomers.add("Anna");
        groomers.add("Natalie");
        groomers.add("Tiffany");
        
        //Print out ArrayList contents, and show size
        System.out.println("The Gooming Team members are: " + groomers);
        System.out.println("There are " + groomers.size()+" people in the Grooming team");
        
       //Iterating through the list
        Iterator<String> iterator = groomers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
    
}
