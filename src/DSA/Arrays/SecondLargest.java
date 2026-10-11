package DSA.Arrays;

import DSA.Arrays.prblm_qn.RotateArrays;

public class SecondLargest{
  public static int getSecondLargest(int[] arr){
    
    int largest = arr[0];
    int slargest= -1;

    // iterate the array
    for(int i=1; i<arr.length; i++){
      // if new value is greater the largest value
      // then update the 'slargest' to store largest
      // largest will store new large value
      if(arr[i] > largest){
        slargest = largest;
        largest = arr[i];
      }
      // if an element greater than second largest value
      // but smaller than largest element value
      // then update the slargest reference
      else if(arr[i] > slargest && arr[i] < largest){
        slargest = arr[i];
      }
    }

    return slargest;
  }

  public static void main(String[] args){
    int[] arr = {12,35,1,10,34,129,11,123,122,124,126,130,100};

    int res = getSecondLargest(arr);
//    RotateArrays.traverseArray(arr);

    System.out.println(res);
  }
}
