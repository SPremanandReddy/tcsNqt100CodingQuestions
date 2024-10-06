package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnArray {
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		int start=0;
		int end=arr.length-1;
//		time n space 1
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
		
//		time n space 1
		int arr1[] = {5,6,2,9,4,1};
		int arr2[] = new int[arr1.length];
		for(int i=arr2.length-1; i>=0; i--) {
			arr2[arr2.length-i-1] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
