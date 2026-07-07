package com.oops.collection.sets;

import java.util.TreeSet;

public class TreeSetExample {
public static void main(String[] args) {
    //sorted order - log N
    TreeSet<Integer> treeSet = new TreeSet<>();

    treeSet.add(2);
    treeSet.add(0);
    treeSet.add(-1);
    treeSet.add(5);

    System.out.println(treeSet);
    System.out.println(treeSet.floor(1));//prints the first value which is lesser than/equal to 1
    System.out.println(treeSet.ceiling(1));//prints the first value which is greater than/equal to 1



}
}
