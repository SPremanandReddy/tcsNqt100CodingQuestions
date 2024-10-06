package com.arrays;

import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedElements {
	public static void main(String[] args) {
		int arr[] = {1,1,2,3,4,4,5,2};
		int repeatedEl[] = new int[arr.length];
		int isvisited[] = new int[arr.length];
		int index=0;
		for(int i=0; i<arr.length; i++) {
			if(isvisited[i] == 1) continue;
			int count=0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					isvisited[j]=1;
				}
			}
			if(count>=1) {
				repeatedEl[index] = arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(repeatedEl));
		
		
		int[] arr1={1,1,2,3,4,4,5,2};
		Map<Integer, Integer> repeated = new HashMap<>();
		for(int i=0; i<arr1.length; i++) {
			if(!repeated.containsKey(arr1[i])) {
				repeated.put(arr1[i], 1);
			}else {
				repeated.put(arr[i],repeated.get(arr[i])+1);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = repeated.entrySet();
		for(Entry<Integer,Integer> pair:entrySet) {
			if(pair.getValue() >1) System.out.print(pair.getKey()+" ");
		}
	}
}
