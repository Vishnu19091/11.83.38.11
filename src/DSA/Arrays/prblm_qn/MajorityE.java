package DSA.Arrays.prblm_qn;

import java.util.*;
public class MajorityE{
  public static List<Integer> findMajority(int[] nums){
    int n = nums.length;
    int threshold = n / 3;

    Map<Integer, Integer> countMap = new HashMap<>();
    ArrayList<Integer> result = new ArrayList<>();

    for(int m : nums){
      countMap.put(m, countMap.getOrDefault(m, 0) + 1);
    }

    for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
      if(entry.getValue() > threshold){
        result.add(entry.getKey());
      }
    }

    return result;
  }

  public static void main(String[] args){
    System.out.println(findMajority(new int[]{1,2}));
  }
}
