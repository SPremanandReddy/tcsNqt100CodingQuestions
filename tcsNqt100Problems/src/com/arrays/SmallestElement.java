package com.arrays;

import java.util.Arrays;

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr= new int[] {8,10,5,7,9};
		int smallest = Integer.MAX_VALUE;
//		Timecomplexity - O(n) , space complexity - O(1)
//	Static Way	
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]<smallest) {
//				smallest=arr[i];
//			}
//		}
		
//		Inbuilt Way
		Arrays.sort(arr);
		smallest=arr[0];
		System.out.println(smallest);
	}
}
