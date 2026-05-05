package DSA.Arrays.prblm_qn;

import java.util.*;

public class Missing {
  public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper){
    int n = nums.length;
    List<List<Integer>> result = new ArrayList<>();

    if(n == 0){
      result.add(Arrays.asList(lower, upper));
      return result;
    }

    if(lower < nums[0]){
      result.add(Arrays.asList(lower, nums[0]-1));
    }

    // from 1st index of arr elements
    // check if (nums[i]+1 - nums[i+1] > 1)
    // if so then add to arraylist (nums[i]+1,nums[i+1]-1)
    for(int i=0; i < n-1; i++){
      if(nums[i+1] - nums[i] > 1){
        result.add(Arrays.asList(nums[i]+1, nums[i+1]-1));
      }
    }

    // for last element in the array
    // if nums[n-1] < upper
    // then add [nums[n-1]+1, upper]
    if(nums[n-1] < upper){
      result.add(Arrays.asList(nums[n-1]+1,upper));
    }

    return result;
  }

  public static void main(String[] args){
    int[] arr = {-1};
    System.out.println(findMissingRanges(arr,-10,10));
  }
}
