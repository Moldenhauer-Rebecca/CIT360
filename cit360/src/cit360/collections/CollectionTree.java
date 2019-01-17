/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author crmol
 */
/* A TreeSet is a sorted collection. It stores unique elements an doesn't perserve
the insertion order of the elements. It sorts in ascending order and not thread-safe*/
public class CollectionTree {
    public static void main(String[] args){
        Set<String> groomers = new HashSet<>();
        //Add items to list
        groomers.add("Drew");
        groomers.add("Suzie");
        groomers.add("Corbin");
        groomers.add("Bob");
        groomers.add("Brennen");
        groomers.add("Anna");
        groomers.add("Natalie");
        groomers.add("Tiffany");
        groomers.add("Rylee");
        
        //Print Groomers list
        System.out.println(groomers);
        
        //Create TreeList. This will alphabetically reorder list
        Set<String> treeSet = new TreeSet(groomers);
        
        //Print new Groomer list
        System.out.println(treeSet);
    }
    
}
