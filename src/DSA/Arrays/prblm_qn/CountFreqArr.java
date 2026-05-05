package DSA.Arrays.prblm_qn;

import DSA.Arrays.PracticeArray;

import java.util.*;

public class CountFreqArr {
    public static void countArrFreq(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int a : arr){
            freq.put(a, freq.getOrDefault(a,0) + 1);
        }

//        The initialization of TreeMap creates
//        an object of HashMap in sorted manner
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(freq);

        for(HashMap.Entry entry : sortedMap.entrySet()){
            System.out.println("{ " + entry.getKey() + ", Frequency-> " + entry.getValue() + "}");
        }
    }

    public static int[] sortByFreq(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int n : arr){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            list.add(n);
        }

        Collections.sort(list, (a,b) -> {
            if(!freq.get(a).equals(freq.get(b))) return freq.get(b) - freq.get(a);
            return a - b;
        });

        for(int i = 0; i< arr.length; i++){
            arr[i]=list.get(i);
        }

        return arr;
    }

    public static void main(String[] args){
//        countArrFreq(new int[]{1,4,3,4,6,7,3,5,7,5,1,2,2});

        int[] array = {-192, 0, 2,3,0,3,-192};
        PracticeArray.traverse(sortByFreq(array));
    }
}
