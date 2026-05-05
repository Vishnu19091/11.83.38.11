package Basics.Array;

import java.util.Scanner;

public class MyArrays {
    public static Scanner sc = new Scanner(System.in);
   
    public void StringArray(){
      String[] arr = new String[4];

      arr[0] = "String 1";
      arr[1] = "String 2";
      arr[2] = "String 3";
      arr[3] = "String 4";

      // System.out.println(arr);
  }


    public int[] ReturnArray(){
    return new int[] {1,2,3,4,5,6,7,8,9,10};
  }
  
  public static int max(int[] arr){
    int max = 0;

    for(int i = 0; i<arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }

    return max;
  }
  

  public static void main(String[] args) {
      System.out.println("Works");
  }
}
