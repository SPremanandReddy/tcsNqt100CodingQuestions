package com.arrays;

import java.util.Arrays;

public class findMedian {
	static double median(int[] arr, int n) {
		if(n%2==0) {
			return (double)(arr[(n/2-1)]+ arr[n/2])/2;
		}
		return arr[n/2];
	}
	
	public static void main(String[] args) {
//		o(nlogn) sorting of array
		int arr[] = {4, 7, 1, 2, 5, 6};
		Arrays.sort(arr);
		System.out.println(median(arr,arr.length));
		
	}
}
