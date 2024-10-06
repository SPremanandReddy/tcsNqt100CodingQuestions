package com.arrays;

import java.util.Arrays;

public class RearrangeFirstHalfAscLastHafDesc {
	public static void main(String[] args) {
		
		int[] arr= {8,7,1,6,5,9};
		int n=arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		space is 0(1), time is O(nlogn)+O(n) i.e., n is for printing and nlogn for sorting
		for(int i=0; i<arr.length/2; i++) {
			System.out.print(arr[i]+"   ");
		}
		for(int i=0; i<arr.length/2;i++) {
			System.out.print(arr[n-1-i]+"  ");
		}
	}
}
