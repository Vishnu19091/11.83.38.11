package Basics.Collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args){
//        PriorityQueue pq = new PriorityQueue();
        PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());

        pq.add(100);
        pq.add(25);
        pq.add(75);
        pq.add(50);
        pq.add(12);
        pq.add(150);
        pq.add(125);
        pq.add(175);
        System.out.println(pq);
    }
}
