package DSA.Arrays.prblm_qn;
import java.util.Arrays;
import DSA.Arrays.PracticeArray;

public class ReArrangeArray {
    /*
    PROBLEM STATEMENT:  Rearrange a given array such that
    the first half is arranged in increasing order,
    and the second half is arranged in decreasing order

    Input: [8 7 1 6 5 9]
    Output: [1 5 6 9 8 7]
    Explanation: First three elements are in the ascending order
    and next three elements are in the descending order.

    Input: [4 2 8 6 15 5 9 20]
    Output: [2 4 5 6 20 15 9 8]
    Explanation: First four elements are in the ascending order
    and next four elements are in the descending order.
    */
    public static void reArrange(int[] arr){
      Arrays.sort(arr);

      int n = arr.length;
      int mid = n / 2;
      int right = n - 1;

      while(mid < right){
        int temp = arr[mid];
        arr[mid] = arr[right];
        arr[right] = temp;

        mid++;
        right--;
      }
    }

    public static void main(String[] args){
        int[] arr = {8,7,1,6,5,9};
        reArrange(arr);
        PracticeArray.traverse(arr);
    }
}
