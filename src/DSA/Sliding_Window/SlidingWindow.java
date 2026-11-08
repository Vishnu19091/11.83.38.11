package DSA.Sliding_Window;

import java.util.Arrays;
import java.util.HashMap;

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
    
    public static void countDistinct(int[] arr , int k){
    	int n = arr.length, uniq = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < k; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}

		System.out.print(map.size() + " ");
		for(int i = k; i < n; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			if(map.get(arr[i-k]) > 0){
				map.put(arr[i-k], map.get(arr[i-k])-1);
			}
			
			if(map.get(arr[i-k]) == 0){
				map.remove(arr[i-k]);
			}
			System.out.print(map.size() + " ");
		}
    }

    public static void lsbstrrpc(String s){
    	int n = s.length();
		int[] cnt = new int[256];
		int left = 0, best = 0;

		for(int right = 0; right < n; right++){
			cnt[s.charAt(right)]++;		//add
			while(cnt[s.charAt(right)] > 1) {	//window invalid
				cnt[s.charAt(left)]--;
				left++;
			}
			best = Math.max(best,right-left+1);	//record best window length
		}
		System.out.println(best);
    }

    public static void longestValidWindow(int[] arr, int k){
    	int zeros = 0, best = 0, left = 0;

	for(int right = 0; right<arr.length; right++){
		if(arr[right] == 0) zeros++;
		while(zeros > k){
			if(arr[left] == 0) zeros--;
			left++;
		}
		
		best = Math.max(best, right-left+1);
	}

	System.out.println(best);
    }

    public static void shortestValidWindows(int[] arr, int t){
	int n = arr.length, best = Integer.MAX_VALUE, left = 0;
	long sum = 0;
	for(int right = 0; right < n; right++){
		sum+=arr[right];
		while(sum >= t){
			best = Math.min(best, right-left+1);
			sum-=arr[left];
			left++;
		}
	}
	System.out.println(best == Integer.MAX_VALUE ? "-1":best);
    }

    public static String subarrsum(int[] arr, int sum){
    	int left = 0, n = arr.length, total = 0;

	for(int right = 0; right < n; right++){
		total+=arr[right];
		while(total > sum && left <= right) {
			total-=arr[left];
			left++;
		}
		if(total == sum){
			return (left+1)+ " " + (right+1);
		}
	}
	return "-1";
    }

    public static void substringdistinct(String s, int k){
		int best = 0, left = 0, n = s.length(), d = 0;
		int[] cnt = new int[26];

		for(int right = 0; right < n; right++){
			cnt[s.charAt(right)- 'a']++;
			if(cnt[s.charAt(right) - 'a'] == 1) d++;

			while(d > k){
				cnt[s.charAt(left) - 'a']--;
				left++;

				if(cnt[s.charAt(left)] == 0) d--;
			}
			best = Math.max(best, right-left+1);
		}
		System.out.println(best);
    }
    public static void main(String[] args) {

        int[] arr= {1,3,4,5,6,7,8,9,10};
        //System.out.println(maxSum(arr, 3));
	//lsbstrrpc("bbb");
	//longestValidWindow(new int[]{1,0,0,0,0,1,1,1,0,1,1,0,1}, 3);
	//shortestValidWindows(new int[]{2,3,1,2,4,3}, 7);
	//System.out.println(subarrsum(new int[]{1,2,3,7,5}, 10));
	//countDistinct(new int[]{1,1,3,4,2,3}, 4);
	substringdistinct("abcabc",3);
    }    
}
