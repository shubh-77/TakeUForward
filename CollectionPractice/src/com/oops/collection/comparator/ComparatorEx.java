package com.oops.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2, o1);
    }



}

public class ComparatorEx {
public static void main(String[] args) {
    

        List<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(5);
        al.add(4);

        Collections.sort(al,(n1,n2)-> n2-n1);
        Collections.sort(al,new DescendingComparator());
        System.out.println(al);
}
}
