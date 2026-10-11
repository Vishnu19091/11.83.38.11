package Basics.Array;

import java.util.*;

public class Sort{
  static void selectionSort(int[] arr) {
    int n = arr.length;
    int min;
    int pos;
    int temp;

    for(int i = 0; i <= n -2; i++){
      min=arr[i];
      pos=i;
      for(int j = i+1; j < n; j++){
        if(arr[j] > min){
          min=arr[j];
          pos=j;
        }
      }

//    swapping minimum element with the ith position element
      temp=arr[i];
      arr[i]=arr[pos];
      arr[pos]=temp;
    }
  }

  public static void main(String[] args){
    int[] arr= {73,99,81,12,53,23};
    System.out.println("Array before sorting: " + Arrays.toString(arr));
    selectionSort(arr);
//    Arrays.sort(arr);
    System.out.println("Array after sorting: " + Arrays.toString(arr));
  }
}
