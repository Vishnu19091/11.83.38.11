public class SlidingWindow {
    // Problem - Maximum Sum using sliding Window
    static int maxSum(int arr[], int k){

        // checking the length of the array
        if(arr.length<=k){
            System.out.println("Invalid");
            return -1;
        }

        int max_sum=0;

        for (int i=0;i<k;i++)
            max_sum+=arr[i];

        int window_sum=max_sum;

        for(int i = k; i<arr.length;i++){
            // instead of recalculating the window each time, we simply do num_sum=old_sum-element_goin_out+element_coming_in
            window_sum= window_sum + arr[i] - arr[i-k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }
    public static void main(String[] args) {

        int[] arr= {1,3,4,5,6,7,8,9,10};
        System.out.println(maxSum(arr, 3));
    }    
}
