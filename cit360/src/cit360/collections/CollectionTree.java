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
/* A TreeSet is a sorted collection. It stores unique elements and doesn't perserve
the insertion order of the elements. It sorts in ascending order and not thread-safe*/
public class CollectionTree {
    public static void main(String[] args){
        Set<String> employees = new HashSet<>();
        //Add items to list
        employees.add("Drew");
        employees.add("Suzie");
        employees.add("Corbin");
        employees.add("Bob");
        employees.add("Brennen");
        employees.add("Anna");
        employees.add("Natalie");
        employees.add("Tiffany");
        employees.add("Rylee");
        
        //Print Employee list
        System.out.println(employees);
        
        //Create TreeList. This will alphabetically reorder list
        Set<String> treeSet = new TreeSet(employees);
        
        //Print new Employee list
        System.out.println(treeSet);
    }
    
}
