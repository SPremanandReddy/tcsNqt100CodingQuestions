package com.arrays;

import java.util.stream.IntStream;

public class SumOfArray {
	public static void main(String[] args) {
		int arr[]= {1,2,1,1,5,1};
		int sum=0;
//		space is O(1) and time is O(n)
		for(int i:arr) {
			sum+=i;
		}
		System.out.println(sum);
		
//		time is O(n) , space is O(1)
		System.out.println(IntStream.of(arr).sum());
	}
}
