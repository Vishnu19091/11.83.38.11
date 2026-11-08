package DSA.BinarySearch;

import java.util.Scanner;
import java.util.Arrays;
public class firstLastPos {
	public static int first(int[] arr, int target){
		int l = 0, r = arr.length-1, ans=-1;
		
		while(l<=r){
			int mid = l + (r - l) / 2;

			if(arr[mid] > target) r = mid-1;
			else if(arr[mid] < target) l = mid+1;
			else {	//completely searches on the left side
				ans=mid;
				r=mid-1;
			}
		}
		return ans;
	}
	
	public static int last(int[] arr, int target){
		int l=0,r=arr.length-1,ans=-1;
		while(l<=r){
			int mid = l+(r-l) / 2;
			if(arr[mid] > target) r = mid-1;
			else if(arr[mid] < target) l=mid+1;
			else {	//completely searches on the right side
				ans=mid;
				l=mid+1;
			}
		}
		return ans;
	}
	
	public static void countOccurrence(int[] arr, int target){
		int firstOcc = first(arr, target);
		int lastOcc = last(arr, target); 
		int count = 0;
		if(lastOcc == -1 && firstOcc == -1){
			count =-1;
		} else {
			count = lastOcc - firstOcc +1;
		}
		System.out.println(count);
	}

	public static void countSmallest(int target){
		int l = 1, h = target;
		
		while(l<h){
			int mid = l + (h-l) / 2;
			
			if(mid * mid >= target) h = mid;
			else l = mid+1;
		}

		System.out.println(l);

	}

	public static void findSqrt(int target){
		int lo = 1, hi = target, ans = -1;

		while(lo<hi){
			int mid = lo + (hi-lo) / 2;
			if(mid * mid <= target){
				ans=mid;
				lo=mid+1;
			} else {
				hi=mid-1;
			}
		}

		System.out.println(ans);
	}

	public static void search_rotated_array(int[] arr, int target){
		int lo = 0, n=arr.length, hi = n-1;
	
		while(lo<=hi){
			int mid = lo + (hi-lo)/2;

			if(arr[mid]==target){
				System.out.println(mid);
				return;
			}

			if(arr[lo] <= arr[mid]){
				if(arr[lo] <= target && target < arr[mid]) hi = mid-1;
				else lo = mid+1;
			} else {
				if(arr[mid] < target && target <= arr[hi]) lo = mid+1;
				else hi=mid-1;
			}
		}
		return;
	}
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter n size of array:");
		//int n = sc.nextInt();
		//int[] arr = new int[n];
		//System.out.println("Enter elements:");
		//for(int i = 0; i < n; i++) arr[i]=sc.nextInt();
		//System.out.println("Target:");
		//int target = sc.nextInt();

		//System.out.println(Arrays.toString(new int[]{first(arr, target), last(arr, target)}));
		//countOccurrence(arr, target);
		//countSmallest(8);
		//findSqrt(4);
		search_rotated_array(new int[]{4,5,6,7,0,1,2},2);
	}
}
