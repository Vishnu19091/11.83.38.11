package Basics.Array.Multi_dimensional_arrays;

import java.util.Arrays;

public class MD {
  public static int[][] declaration(){
    int[][] arr2D = {{1,2,3}, {4,5,6}, {7,8,9}};
    //int[][] 2dArr = new int[3][4];
    //2dArr[0][0] = 5;

    return arr2D;
  }

  public static void traverseM1(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void traverseM2(int[][] arr){
    for(int[] row: arr){
      for(int val : row){
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }

  public static void sort2D(int[][] arr){
    for(int i = 0; i<arr.length; i++){
      Arrays.sort(arr[i]);
    }
  }

  public static void sort2DM(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        for(int k = j+1; k<arr[i].length; k++){
          if(arr[i][j] > arr[i][k]){
            int temp = arr[i][j];
            arr[i][j] = arr[i][k];
            arr[i][k] = temp;
          }
        }
      }
    }
  }

  public static int sum2D(int[][] arr){
    int sum =0;

    for(int[] row : arr){
      for(int val : row){
        sum += val;
      }
    }
    return sum;
  }

  public static void search2D(int[][] arr, int target){
    for(int r = 0; r < arr.length; r++){
      for(int c = 0; c < arr[r].length; c++){
        if(arr[r][c] == target){
          System.out.println("Element " + target + " is at row: " + (r+1) + ", column: " + (c+1));
        }
      }
    }
  }

  public static void main(String[] args){
    //System.out.println("Hello from MD package :)");
    int[][] jibrish = {{1,3,2,5}, {9,4,8,1},{1,0,5,9}};
    //sort2DM(jibrish);
    //traverseM2(jibrish);
    //System.out.println(sum2D(jibrish));
    search2D(jibrish, 8);
  }
}
