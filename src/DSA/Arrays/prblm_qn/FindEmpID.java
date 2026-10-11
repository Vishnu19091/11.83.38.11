package DSA.Arrays.prblm_qn;

import java.util.Scanner;

public class FindEmpID {
    public static void ops(int[] arr, int target){
        int fpos = -1;
        int lpos = -1;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                fpos = i+1;
                break;
            }
        }

        for(int i =0; i < arr.length; i++){
            if(arr[i] == target){
                lpos = (i+1);
                count++;
            }
        }

        System.out.println(fpos + " " + lpos + " " + count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter array elements" + i + ": ");
            int val = sc.nextInt();

            if(val >= 100 && val <= 99999){
                array[i] = val;
            }
        }

        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        ops(array, target);
    }
}
