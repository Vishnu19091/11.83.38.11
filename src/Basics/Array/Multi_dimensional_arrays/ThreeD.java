package Basics.Array.Multi_dimensional_arrays;

import java.util.Scanner;

public class ThreeD {
    public static Scanner sc = new Scanner(System.in);

    public static int arr[][][] = new int[2][3][5];

    public static void feed3D(){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    System.out.print("Enter input for Block: " + i + ", Row: " + j + ", Column: " + k + ", Input =");
                    arr[i][j][k]=sc.nextInt();
                    System.out.println();
                }
            }
        }
    }

    public static void print3D() {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    System.out.println("Block: " + i + ", Row: " + j + ", Column: " + k + ", Element: " + arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void print3DArray() {
//        BLOCKS
        for(int i = 0; i < arr.length; i++){
//        ROWS
            for(int j = 0; j < arr[i].length; j++){
//        COLUMNS
                for(int k = 0; k < arr[i][j].length; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        feed3D();
        print3DArray();
    }
}
