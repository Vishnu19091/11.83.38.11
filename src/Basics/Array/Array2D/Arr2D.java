package Basics.Array.Array2D;

import java.util.Scanner;

public class Arr2D {
    public static Scanner sc = new Scanner(System.in);
    public static void transposeMatrix2D(){
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        System.out.println();

        int[][] arr = new int[rows][cols];
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                System.out.print("Enter element for row: " + (r+1) + ", and column: " + (c+1));
                arr[r][c] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Original Matrix:");
        for(int r[] : arr){
            for (int c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }

        int[][] trns = new int[rows][cols];
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                trns[c][r]= arr[r][c];
            }
        }

        System.out.println("Transpose of the matrix:");
        for(int r[] : trns){
            for (int c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        transposeMatrix2D();
    }
}
