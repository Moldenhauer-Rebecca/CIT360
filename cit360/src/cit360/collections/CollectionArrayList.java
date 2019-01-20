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
        
        ArrayList<String> employees = new ArrayList<>();
        //add items to the ArrayList
        employees.add("Suzie");
        employees.add("Bob");
        employees.add("Anna");
        employees.add("Natalie");
        employees.add("Tiffany");
        
        //Print out ArrayList contents, and show size
        System.out.println("The Campground employees are: " + employees);
        System.out.println("There are " + employees.size()+" people on the Campground team");
        
       //Iterating through the list
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
    
}
