package Basics.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practice {
    public static void countFreq(String s) {
        String[] words = s.split(" ");
        HashMap<String, Integer> freq= new HashMap<>();

        for(String word : words){
            if(freq.containsKey(word)){
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            } else {
                freq.put(word, 1);
            }
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(freq);

        for(Map.Entry entry : sortedMap.entrySet()){
            if(entry.getValue().equals(1)){
                System.out.println("UNIQUE ELEMENT: '" + entry.getKey() + "'");
            }
        }

        System.out.println(sortedMap);
    }

    public static void main(String[] args){
        countFreq("Hello hi , Hello hi i , mi");
    }
}
