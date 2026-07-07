package com.oops.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
public static void main(String[] args) {
    
    List<Integer> ll = new LinkedList<>();

    ll.add(1);
    ll.add(2);
    ll.addFirst(0);
    ll.addLast(4);


    System.out.println(ll);

    System.out.println(ll.removeLast());
    System.out.println(ll.getFirst());

    
    

    
}
}
