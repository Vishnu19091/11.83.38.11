package Basics.TwoPointers;

public class TP {
//    Big O(n^2) approach
    public static void sumOf(){
        int[] arr = {5,8,15,24,26,44,65};

        int a = -1;
        int b = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum == 50){
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
        }

        System.out.println(a + " " + b);
    }

//    Big O(n) Two pointer approach
    public static void sumOfTP(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int sum = arr[start] + arr[end];

            if(sum == target){
                System.out.println(arr[start] + " " + arr[end]);
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
    }

    public static void main(String[] args){
//        sumOf();
        sumOfTP(new int[]{5,8,15,24,26,44,65}, 50);
    }
}
