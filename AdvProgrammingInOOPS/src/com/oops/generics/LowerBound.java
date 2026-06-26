package com.oops.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
 
    public static void writeArray(List<? super Integer>list){
      
        list.add(10);
        list.add(20);
     
        System.out.println(list);
        //int element= list.get(0); // compile time error 

    }
 
    public static void main(String[] args) {

        List<Number> list1=new ArrayList<>();
        writeArray(list1);

        /*

            
        Thus write access is allowed but read access is not allowed in case of lower bounded wildcards
        in the method writeArray.
        
         */
 }
}
