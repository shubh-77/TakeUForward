package com.oops.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IteratorEx {
public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    
    Iterator<String> itr = list.iterator();

    while(itr.hasNext()){
        System.out.println(itr.next());
    }

    
}
}
