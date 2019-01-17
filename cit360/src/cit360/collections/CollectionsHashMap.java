/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.HashMap;

/**
 *
 * @author crmol
 */
/*A HashMap is part of collection. It is a basic map interface. It stores data in 
a (key,Value) pair. To access a value you must know the key.*/

public class CollectionsHashMap {
    public static void main(String[] args) {
        //Declare
        HashMap<Integer, String> groomerStations = new HashMap<>();
        //add elements
        groomerStations.put(3, "Suzie");
        groomerStations.put(6, "Bob");
        groomerStations.put(2, "Anna");
        groomerStations.put(1, "Natalie");
        groomerStations.put(5, "Tiffany");
        
        System.out.println("Team Stations has "+ groomerStations.size()+" goomers working");
        
        //Removing element by key
        groomerStations.remove(2);
        System.out.println(groomerStations);
        
        //Search for element by number
        if(groomerStations.containsKey(1)){
            System.out.println("Groomer Found");
        } else {
            System.out.println("Groomer Off duty");
        }
        //Remove all emements from HashMap
        groomerStations.clear();
    }
    
}
