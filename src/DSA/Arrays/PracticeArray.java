package DSA.Arrays;

import java.util.ArrayList;

public class PracticeArray{
  static int[] ProductSelf(int[] arr){
    int n = arr.length;
    int[] output = new int[n];

    output[0] = 1;
    // first pass
    for(int i = 1; i<n;i++){
      output[i]= output[i-1] * arr[i-1];
    }

    int right = 1;
    for(int i=n-1;i>=0;i--){
      output[i] = output[i] *right;
      right = right * arr[i];
    }

    return output;
  }

  public static void traverse(int[] arr){
    System.out.print("{ ");
    for(int i =0; i < arr.length; i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.println("}");
  }

  public static void traverse2D(int[][] arr){
    System.out.println("{ ");
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr.length; j++){
        System.out.print(arr[i][j] + ", ");
      }
      System.out.println("");
    }
  }

  public static void traverseList(ArrayList<int[]> arr){
    for(int[] a : arr){
      for(int i : a){
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args){
    int[] arr = {4,3,2,1};
    
    int[] res = ProductSelf(arr);

    traverse(res);
  }
}
