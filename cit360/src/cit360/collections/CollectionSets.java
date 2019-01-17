/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author crmol
 */
//Sets are unordered collection of objects where duplicates cannot be stored.

public class CollectionSets {
    public static void main(String[] args){
        Set<String> groomers = new HashSet<>();
        //Add itmes to list
        groomers.add("Suzie");
        groomers.add("Bob");
        groomers.add("Anna");
        groomers.add("Natalie");
        groomers.add("Tiffany");
        
//Add duplicate items to list
        groomers.add("Suzie");
        groomers.add("Bob");
        groomers.add("Anna");
        groomers.add("Natalie");
        
        //Sets do not allow duplicates. Printing will remove the duplicates
        System.out.println(groomers);
        
    }
    
}
