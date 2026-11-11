package DSA;


import java.util.*;

public class Mock {
    public static int subarraySum(int[] nums, int k) {

	HashMap<Integer, Integer> map = new HashMap<>();

	int prefixSum =0, count = 0;
	
	map.put(0,1);
	for(int i = 0; i < nums.length; i++){
		prefixSum+=nums[i];

        count+=map.getOrDefault(prefixSum - k, 0);

		map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
	}

	System.out.println(map);
	System.out.println(count);
	return count;
    }


	public static int longestSubarray(int[] nums) {
		int left = 0, bestLen =0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int right = 0; right < nums.length; right++){
			map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

			while(map.size() > 3 && left < right){
				int old = nums[left];

				map.put(old, map.get(old)-1);


				if(map.get(old) ==0) map.remove(old);

				left++;
			}
			bestLen = Math.max(bestLen, right-left+1);
		}
		System.out.println(bestLen);
		return bestLen;
	}

    public static void main(String[] args){
        //subarraySum(new int[]{1,2,1,2}, 3);

	longestSubarray(new int[]{1,1,1,2,2,3,3,4,5,6,7,8});
    }
}
