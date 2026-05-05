package DSA.Arrays.prblm_qn;

import java.util.Scanner;

public class FindElement {
  static Scanner sc = new Scanner(System.in);
  static int[] takeInp(){
    System.out.println("Size: ");
    int size = sc.nextInt();
    System.out.println("Enter array elements: ");
    int[] arr = new int[size];
    for(int i = 0; i < size; i++){
      arr[i]=sc.nextInt();
    }

    return arr;
  }
  public static int missingElement(int[] arr){
    int n = arr.length;
    int sum1 = 0;
    int sum2 = 0;

    // finds total sum of given array
    for(int i=0;i<n;i++){
      sum1 = sum1 + arr[i];
    }

    // finds total sum of given range/size of the array
    // we need the range of the arrays, so we add +1 to size
    for(int j=1;j<=n+1;j++){
      sum2 = sum2 + j;
    }

    // now to find the missing element just find the difference of both sum
    int diff = sum2 - sum1;

    return diff;
  }

  // this problem always returns a missing because
  // the solution is designed to produce a missing values always
  public static void main(String[] args){
    //no duplicates
    //no need to be in sorted order
    //values should be in range
    int[] arr = takeInp();
    int res = missingElement(arr);
    System.out.println("Missing Element -> " + res);
  }
}
