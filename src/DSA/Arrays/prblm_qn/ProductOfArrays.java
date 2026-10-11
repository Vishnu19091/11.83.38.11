package DSA.Arrays.prblm_qn;

import DSA.Arrays.PracticeArray;

public class ProductOfArrays {
    /**
     * Brute Force Approach
     * Time Complexity O(n*2) - for each element we're iterating the array again
     * Space Complexity O(1)
     * This method takes Integer arrays
     * and performs multiplication of all elements
     * except ith element and modifies the ith element's value
     * with the product
     * @param arr
     * @return int[]
     */
    public static int[] ProdOfArray(int[] arr){
        int n = arr.length;
        int[] output = new int[n];

        for (int i = 0; i<n;i++){
            // setting the current ith as one to skip the product of element
            output[i]=1;

            for (int j = 0; j < n; j++) {
                // skipping the ith index
                if(i !=j ){
                    output[i] *= arr[j];
                }
            }
        }

        return output;
    }

     public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] output = new int[size];

        // Initialize the output array with left products
        output[0] = 1;
        for (int i = 1; i < size; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Calculate and multiply the right products
        int right = 1;
        for (int i = size - 1; i >= 0; i--) {
          output[i] *= right;
          right *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] prodArray = {1,2,3,4};
        
        int[] res = ProdOfArray(prodArray);

         PracticeArray.traverse(res);
    }
}

