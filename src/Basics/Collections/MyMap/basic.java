package Basics.Collections.MyMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class basic {
    public static void HashMap(){
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(2,"B");
        hm.put(4,"D");
        hm.put(5,"E");
        hm.put(6,"F");
        hm.put(1,"A");
        hm.put(3,"C");

        System.out.println("HashMap");
        System.out.println(hm);
    }

    public static void LinkedHashMap(){
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(2,"B");
        hm.put(4,"D");
        hm.put(5,"E");
        hm.put(6,"F");
        hm.put(1,"A");
        hm.put(3,"C");

        System.out.println("LinkedHashMap");
        System.out.println(hm);
    }

    public static void TreeMap(){
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(2,"B");
        tm.put(4,"D");
        tm.put(5,"E");
        tm.put(6,"F");
        tm.put(1,"A");
        tm.put(3,"C");

        System.out.println("Tree Map");
        System.out.println(tm);
    }
    public static void main(String[] args) {
        HashMap();
        LinkedHashMap();
        TreeMap();
    }
}
