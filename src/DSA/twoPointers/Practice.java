package DSA.twoPointers;

import java.util.Arrays;

public class Practice {
    public static boolean findSum(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == target) {
                System.out.println(l + " " + r);
                return true;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        if(l>0 && r>0){
            System.out.println("Not sufficient!");
        }
        return false;
    }

    public static void sort(int[] arr){
        int n = arr.length;

        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if(arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void containerWithMostWater(int[] arr) {
        int n = arr.length;

        int l = 0;
        int r = n-1;
        int max=0;

        while(l < r){
            int wid = r - l;
            int minHeight = Math.min(arr[r], arr[l]);

            int area = wid * minHeight;
            max = Math.max(max, area);

            if(arr[l] < arr[r]){
                l++;
            } else {
                r--;
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args){

        int[] arr = {10,15,20,30,40,50};
        int target = 90;

//        findSum(arr, target);
//        sort(new int[] {2,0,2,1,2,1,0,1,0});
        containerWithMostWater(new int[] {3, 7, 6, 2, 6, 4, 8, 4, 9});
    }
}
