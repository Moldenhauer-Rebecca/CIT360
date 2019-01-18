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
        HashMap<Integer, String> employeeStations = new HashMap<>();
        //add elements
        employeeStations.put(3, "Suzie");
        employeeStations.put(6, "Bob");
        employeeStations.put(2, "Anna");
        employeeStations.put(1, "Natalie");
        employeeStations.put(5, "Tiffany");
        
        System.out.println("Team Stations has "+ employeeStations.size()+" employees working");
        
        //Removing element by key
        employeeStations.remove(2);
        System.out.println(employeeStations);
        
        //Search for element by number
        if(employeeStations.containsKey(4)){
            System.out.println("Employee Found");
        } else {
            System.out.println("Employee Off duty");
        }
        //Remove all emements from HashMap
        employeeStations.clear();
    }
    
}
