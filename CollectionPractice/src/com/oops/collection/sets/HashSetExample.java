package com.oops.collection.sets;

import java.util.HashSet;

public class HashSetExample {
public static void main(String[] args) {
    
    //stores unique element in random order 0(N)
    HashSet<Integer> hs = new HashSet<>();

    System.out.println(hs.add(1));
    System.out.println(hs.add(2));
    System.out.println(hs.add(1));

    System.out.println(hs);
    System.out.println(hs.size());
    for(var n:hs){
        System.out.println(n);
    }
    hs.stream().forEach(ele->System.out.print(ele+" "));


    


}
}
