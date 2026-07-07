package com.oops.collection.maps;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {


public static void main(String[] args) {
    //maintains sorted order of keys
    TreeMap<Integer,String> tm = new TreeMap<>();
    tm.put(1, "Shubh");
    tm.put(4, "Shubham");
    tm.put(3, "PRD");
    tm.put(6, "KK");
    System.out.println(tm);
    System.out.println(tm.ceilingKey(2));
    System.out.println(tm.floorKey(7));
    Set<Integer>keySet = tm.keySet();
    System.out.println(keySet);
    Collection<String> values = tm.values();
    System.out.println(values);
}
}
