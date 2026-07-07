package com.oops.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //we can add it in the end
        list.add(10);
        list.add(16);
        list.add(20);
        list.add(12);

        System.out.println(list);
        System.out.println("getting element:"+list.get(0));
        System.out.println("getting size:"+list.size());

        System.out.println("removing element at index 1: "+list.remove(1));
        list.add(1, 16);

        
        

    }
}
