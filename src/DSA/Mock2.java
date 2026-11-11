package DSA;


import java.util.*;
public class Mock2 {


	public static int maxSubarraysum(int[] nums){
		int left = 0, bestSum=Integer.MIN_VALUE, negCount = 0, sum = 0;
		
		for(int right = 0; right < nums.length; right++){
			if(nums[right] < 0) negCount++;
			sum+=nums[right];

			while(negCount > 1 && left < right){
				if(nums[left] < 0) negCount--;

				sum-=nums[left];

				left++;
			}
			bestSum = Math.max(bestSum, sum);
		}
		System.out.println(bestSum);
		return bestSum;
	}

	public static int[] nextGreater(int[] nums) {
		Deque<Integer> stack = new ArrayDeque<>();
		int[] ans = new int[nums.length];

		for(int i = nums.length-1; i >= 0; i--){
			while(!stack.isEmpty() && stack.peek() <= nums[i]){
				stack.pop();
			}

			ans[i]=stack.isEmpty() ? -1 : stack.peek();
			stack.push(nums[i]);
		}

		System.out.println(Arrays.toString(ans));
		return ans;
	}
    
	public static void main(String[] args) {
        	maxSubarraysum(new int[]{-4,5,-2,6});
		//nextGreater(new int[]{1,4,2,6});
    	}
}
