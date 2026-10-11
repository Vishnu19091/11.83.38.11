package DSA.Arrays.prblm_qn;

public class TripletSubSequence{
  /**
   * https://leetcode.com/problems/increasing-triplet-subsequence/
   * 334. Increasing Triplet Subsequence
   * Given an integer array nums, return true if there exists a triple of indices (i, j, k)
   * such that i < j < k and nums[i] < nums[j] < nums[k].
   * If no such indices exists, return false
   * Time Complexity O(n) - We have to traverse the array
   * Space Complexity O(1)-Constant space is required
   */
  public static boolean isTripletSubSequence(int[] arr){
    int fnum = Integer.MAX_VALUE;
    int snum = Integer.MAX_VALUE;

    for(int n = 0;n<arr.length;n++){
      // if curr_Element is smaller than the other
      // fnum(stores the smallest element in the array)
      if(arr[n] <= fnum){
        fnum = arr[n];
      }
      // same condition goes for the second smallest element in the array
      else if (arr[n] <= snum){
        snum = arr[n];
      }
      // if largest element is found the returns the result
      else {
        return true;
      }
      System.out.println("fnum = " + fnum + ", snum = " + snum);
    }
    return false;
  }

  public static void main(String[] args){
    int[] arr = {7,5,2,1,0};
    System.out.println(isTripletSubSequence(arr));
  }
}
