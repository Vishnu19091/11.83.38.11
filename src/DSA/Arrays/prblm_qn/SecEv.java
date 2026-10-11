package DSA.Arrays.prblm_qn;

import java.util.Arrays;

public class SecEv {
    public static void secSmallestLargest(int[] arr){
        Arrays.sort(arr);
        int sS = -1;
        int sL = -1;

        if(arr.length > 1){
            sS= arr[1];
            sL = arr[arr.length - 2];
        }
        System.out.println(sS + " " + sL);
    }

    public static void secSmallestLargestM2(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int highest = 0;

        for(int a : arr){
            if(a < smallest){
                smallest = a;
            } else if(a > highest){
                highest = a;
            }
        }

        int sS = Integer.MAX_VALUE;
        int sL = 0;
        for(int a : arr){
            if(a < sS && a !=smallest){
                sS = a;
            } else if (a > sL && a != highest) {
                sL = a;
            }
        }

        System.out.println(sS + " " + sL);
    }

    /*
     * Optimal Approach
     */
    public static void secSmallestLargestM3(int[] arr){
        int small = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int second_highest = Integer.MIN_VALUE;

        for(int a : arr){
            if(a < small){
                second_smallest = small;
                small = a;
            } else if (a < second_smallest && a != small) {
                second_smallest = a;
            }
            if(a > high){
                second_highest = high;
                high = a;
            } else if (a > second_highest && a!= high) {
                second_highest = a;
            }
        }
        System.out.println(second_smallest + " " + second_highest);
    }

    public static void main(String[] args){
//        secSmallestLargest(new int[]{1,2,4,7,5});
//        secSmallestLargestM2(new int[]{1,2,4,7,7,5});
        secSmallestLargestM3(new int[]{1,2,4,7,7,5});

    }
}
