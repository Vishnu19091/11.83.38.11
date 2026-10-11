package Basics.Collections;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        System.out.println(hs);


        for(Integer i : hs){
            System.out.print(i + " ");
        }
    }
}
