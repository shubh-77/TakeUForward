package com.oops.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
 
    public static void printArray(List<? extends Number>list){
       // list.add(10);  cannot add any value to the list because it is a list of unknown type that extends Number
       System.out.println(list.get(0)); //no compilation on read
       for (Number val:list){
            
            System.out.println(val);
        }
    }
 
    public static void main(String[] args) {
    
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        
        printArray(list1);
        int number =list1.get(0);
        System.out.println(number);

        /*
        
        Thus read access is allowed but write access is not allowed in case of upper bounded wildcards.
        in that method printArray.
        
        */

 }
}
