package com.arrays;

import java.util.Arrays;

public class LargestElement {
	public static void main(String[] args) {
		int arr[] = {8,10,5,7,9};
		
//		Time space - nlogn , n
//		first way
//		Arrays.sort(arr);
//		System.out.println("The largest is "+ arr[arr.length-1]);

//		second waw
//		time, space -n , 1
		int larg = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > larg) {
				larg = arr[i];
			}
		}
		System.out.println("The largest is" +(larg));
		
		
		
	}
}
