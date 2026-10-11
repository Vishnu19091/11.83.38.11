package Basics.Collections;

import java.util.ArrayDeque;
import java.util.TreeSet;

public class MyTreeSet {
    
    public static void main(String[] args){
        ArrayDeque ad = new ArrayDeque();

        ad.add(10);
        ad.add(30);
        ad.add(20);
        ad.add(50);
        ad.add(60);
        ad.add(40);
        ad.add(50);

        System.out.println(ad);

        TreeSet ts = new TreeSet();

//        ts.add(100);
//        ts.add(50);
//        ts.add(150);
//        ts.add(25);
//        ts.add(75);
//        ts.add(125);
//        ts.add(175);
        ts.addAll(ad);

        System.out.println(ts);
        System.out.println(ts.size());
    }
}
