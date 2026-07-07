package com.oops.collection.maps;

import java.util.HashMap;

public class HashMapEx {
public static void main(String[] args) {
    //does not maintain order of insertion
    HashMap<Integer,String> hm = new HashMap<>();

    hm.put(1, "Shubh");
    hm.put(2, "Shubham");
    hm.put(3, "PRD");
    hm.put(4, "KK");


    System.out.println(hm);
    System.out.println(hm.size());
    System.out.println(hm.remove(1));
    System.out.println(hm);

    
}
}
