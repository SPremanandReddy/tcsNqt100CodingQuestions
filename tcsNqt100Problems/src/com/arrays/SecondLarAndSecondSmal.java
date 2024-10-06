package com.arrays;

import java.util.Arrays;

public class SecondLarAndSecondSmal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,7,7,5};
		int larg=Integer.MIN_VALUE;
		int secondLar = Integer.MIN_VALUE;
		
		int smallest = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
//		time n , space 1
		for(int i=0; i<arr.length; i++) {
			if(arr.length==1) {
				System.out.println("-1");
				break;
			}
			if(arr[i]>larg) {
				secondLar = larg;
				larg=arr[i];
			}else if(arr[i]>secondLar && arr[i]!=larg) {
				secondLar=arr[i];
			}
			if(arr[i]<smallest) {
				secondSmall = smallest;
				smallest=arr[i];
			}else if(arr[i] < secondSmall && arr[i] !=smallest) {
				secondSmall = arr[i];
			}
		}
		System.out.println("The second Largest : "+secondLar);
		System.out.println("The second smallest: "+secondSmall);
	
		
//		time nlogn space 1
		int arr2[] = {1,5,2,9,3,0};
		Arrays.sort(arr2);
		System.out.println("The second largest is "+arr2[arr2.length -2]);
		System.out.println("The second smallest is "+arr2[1]);
		
		
	}

}
