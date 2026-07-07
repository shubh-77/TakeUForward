package com.oops.collection.queue;

import java.util.PriorityQueue;

public class PriorityQEx {
public static void main(String[] args) {
        //it implements minimum heap structure
        //it stores element and whenever you peek it gives smallest element instead of the first element

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(0);
        pq.offer(-1);
        pq.offer(2);
        pq.offer(3);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());//delete

        System.out.println("second run");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());//delete

}
}
