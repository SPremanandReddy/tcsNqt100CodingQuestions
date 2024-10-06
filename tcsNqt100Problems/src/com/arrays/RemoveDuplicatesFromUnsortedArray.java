package com.arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class RemoveDuplicatesFromUnsortedArray {
	public static void main(String[] args) {
		int arr[] = {4,3,9,2,4,1,10,89,34};
//		time is O(n), space is O(n)
		HashMap<Integer,Integer> uniqueEl = new HashMap<>();
		for(int a: arr) {
			if(!uniqueEl.containsKey(a)) {
				uniqueEl.put(a, 1);
			}else {
				uniqueEl.put(a, uniqueEl.get(a)+1);
			}
		}
		Set<Integer> keys = uniqueEl.keySet();
		int output[] = new int[keys.size()];
		int i=0;
		for(int j: keys) {
			output[i]=j;
			i++;
		}
		System.out.println(Arrays.toString(output));
		
		
		int arr1[] = new int[]{4,3,9,2,4,1,10,89,34};
		removeduplicates(arr1,arr1.length);
	}
	
//	O(n*n) for updating boolean arrays, O(n) for printing non duplicates arrays - time 
//	O(n) marking array and O(n) answer array
	
	static void removeduplicates(int[] arr, int n) {
		int output[] = new int[n];
		for(int i=0; i<n; i++) {
			output[i]=1;
		}
		
		for(int i=0; i<n; i++) {
			if(output[i]==0) continue;
			for(int j=i+1; j<n; j++) {
				if(arr[j]==0) continue;
				if(arr[i]==arr[j]) {
					output[j]=0;
				}
			}
		}
		System.out.print("[ ");
		for(int i=0; i<n; i++) {
			if(output[i]==1) System.out.print(arr[i]+", ");
		}
		System.out.println("] ");
	}
}
