package DSA.Arrays;
import DSA.Arrays.prblm_qn.RotateArrays;

public class DsaArrays {
  public void moveZeroesTwoPass(int[] nums){
    int writePos = 0;

    for(int i = 0; i < nums.length; i++){
      if (nums[i] != 0){
        nums[writePos] = nums[i];
        writePos++;
      }
    }

    while(writePos < nums.length){
      nums[writePos] = 0;
      writePos++;
    }
  }

  /**
   * Moving zeroes using Two pointer appraoch
   * with variable writePos to write the non-zeroes
   */
  public void moveZeroesTP(int[] nums){
    // Holds the writing position inside the array
    int writePos = 0;

    for(int readPos = 0; readPos < nums.length; readPos++){
      if (nums[readPos] != 0){
        if(readPos != writePos){
          int temp = nums[readPos];
          nums[readPos] = nums[writePos];
          nums[writePos] = temp;
          writePos++;
        }
      }
    }
  }

  /**
   * Time Complexity of this approach is O(n^2)
   * because for each element, we are iterating the array
   * to count the occurrences.
   */
  public int majorityElementBruteForce(int[] arr){
    // get the length of the array
    int n = arr.length;

    for (int i = 0; i < n; i++){
      int count = 0;
      // from 0th element to remaining elements
      // we count the arr[0] occurrence
     for (int j = 0; j < n; j++){
        if(arr[j] == arr[i]){
          count++;
        }
      }

      // condition to check the occurrence is
      // greater the n/2 times
      if(count > n / 2){
        return arr[i];
      }
    }
    return -1;
    // hashmap approach has to implemented for this problem(practice)
  }

  /**
   * Reverse the array in-place modifying the original array
   * using two-pointer approach
   * @param int[]arr (integer array)
   * @return reversedArray
   */
  static void reverseArrayInPlace(int[] arr){
    int left = 0;
    int right = arr.length - 1;

    while(left < right){
      // swap the array elements (left to right)
      int tmp = arr[left];
      arr[left] = arr[right];
      arr[right] = tmp;

      // move the pointers
      left++;
      right--;
    }
  }

  // O(n) for iterating over the array
  public static void traverseArray(int[] arr){
    System.out.print("{");
    for (int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.print("null");
    System.out.println("}");
  }

  // Remove Duplicates from an array
  // Return k, which is the no.of unique element
  // also return modified array in-place contains
  // no duplicates
  public int removeDuplicates(int[] arr){
    int n = arr.length;

    if(n == 0){
      return -1;
    }

    int writePos = 0;

    for (int readPos = 1; readPos < n; readPos++){
      if (arr[readPos] != arr[writePos]){
        writePos++;
        arr[writePos]=arr[readPos];
      }
    }

    // remove the rest of the elements in the array
    // for (int i = writePos; i < n; i++)
    return writePos + 1;
  }

  public static void main(String[] args){
    DsaArrays obj = new DsaArrays();
    int[] arr = {0,2,4,6,0,5,0,3,0,22,03};
    // obj.moveZeroesTwoPass(arr);
    obj.moveZeroesTP(arr);

    int[] arr2 = {2,2,1,1,3,2,3,3,3,3,3};
    int res = obj.majorityElementBruteForce(arr2);

    int[] arr3 = {1,1,2,2,2,3,3,4,4,5,6,6,7,8,8,9,9,9,10};

    // int count = obj.removeDuplicates(arr3);
    reverseArrayInPlace(arr2);
    //System.out.println(arr2);
//    RotateArrays.traverseArray(arr3);
  }
}


/**
 * Java Doc template
 * @param arr
 * @return
*/
