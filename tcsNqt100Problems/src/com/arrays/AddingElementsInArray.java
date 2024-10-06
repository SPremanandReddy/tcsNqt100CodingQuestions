package com.arrays;

import java.util.Arrays;

public class AddingElementsInArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,0};
		int n=5;
		insertAtBegin(9, arr,n );
		System.out.println(Arrays.toString(arr));
		int arr1[] = {1,2,3,4,5,0};
		int n1 = 5;
		insertAtEnd(99,arr1,n1);
		System.out.println(Arrays.toString(arr1));
		
		int arr2[] = {1,2,3,4,5,9,0};
		int n2 = 6;
		insertAtPos(3,993,arr2,n2);
		System.out.println(Arrays.toString(arr2));
	}
	
	static void insertAtPos(int pos, int num, int  arr[],int noOfEl) {
		for(int i=noOfEl; i>=pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos-1] = num;
	}
	
	static void insertAtEnd(int num, int[] arr, int len) {
		arr[len] = num;
	}
	static void insertAtBegin(int num, int[] arr, int len) {
		for(int i=len; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = num;
	}
	
}
