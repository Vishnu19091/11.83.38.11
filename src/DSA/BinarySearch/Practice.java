package DSA.BinarySearch;

import java.util.Scanner;

public class Practice {
	public static Scanner sc = new Scanner(System.in);

	public static void basic(){
		System.out.println("Enter n size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements:");
		for(int i = 0; i < n; i++) arr[i]=sc.nextInt();
		System.out.println("Target:");
		int target = sc.nextInt();
		boolean res = false;

		int l =0, r=n-1;
		while(l<=r){
			int mid = (l+r)/2;
			
			if(arr[mid] == target){
				res = true;
				System.out.println("Index: " + (mid));
				break;
			} else if(target < arr[mid]){
				r=mid-1;
			} else {
				l=mid+1;
			}
		}

		if(!res) System.out.println("Element not found!");
	}

    public static void insertPos(){
        System.out.println("Enter n size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) arr[i]=sc.nextInt();
        System.out.println("Target:");
        int target = sc.nextInt();

        int l = 0, r =n-1;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            } else if(arr[mid] > target){
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        System.out.println(l);
    }

	public static void main(String[] args){
		//basic();
		//insertPos();
	}
}
