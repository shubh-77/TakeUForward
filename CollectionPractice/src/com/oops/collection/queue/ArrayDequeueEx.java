package com.oops.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeueEx {
public static void main(String[] args) {
    ArrayDeque<Integer> dq = new ArrayDeque<>();
    
    //adding
    dq.offer(2);
    dq.offer(6);
    dq.offer(9);
    dq.offer(10);//add
    System.out.println(dq.peek()); //check the element at front

    System.out.println(dq.poll()); //delete
}
}
