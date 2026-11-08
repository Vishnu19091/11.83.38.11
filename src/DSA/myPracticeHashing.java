package DSA;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class myPracticeHashing {
	public static Scanner sc = new Scanner(System.in);
	
	public static void groupAnagrams(){
		System.out.println("Enter n:");
		int n = sc.nextInt();
		String[] arr= new String[n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter n"+ i +": ");
			arr[i]=sc.next();
		}
		Arrays.sort(arr);
		HashMap<String, List<String>> map = new HashMap<>();

		for(String s : arr){
			char[] carr = s.toCharArray();
			Arrays.sort(carr);
		
			String key = new String(carr);
			if(!map.containsKey(key)){
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}

		for(Map.Entry entry: map.entrySet()){
			System.out.println(entry.getValue());
		}
		//System.out.println(map);
	}

	public static void findDuplicates(int[] arr){
		HashSet<Integer> hs = new HashSet<>();

		for(int i : arr){
			if(hs.contains(i)){
				System.out.println("Duplicate value is present!");
				return;
			}

			hs.add(i);
		}

		System.out.println("NO duplicates!");
	}


	public static void main(String[] args) {
		//findDuplicates(new int[]{0,2,3,1});
		groupAnagrams();
	}
}
