package GitProblems;

import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args){
        int[] arr = {2,4,1,3,5};
        int n = arr.length;


        int[] prefix = new int[n];
        prefix[0]=arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int l = 1;
        int r= 4;
        int sum = prefix[r] - prefix[l-1];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(prefix));
        System.out.println(sum);
    }
}
