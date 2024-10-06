package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatedFromSortedArray {
	public static void main(String[] args) {
//		int[] arr= {1,1,1,2,2,3,3,3,3,4,4};
		
//		my way
//		
//		int[] arr1=new int[arr.length];
//		int count=0;
//		boolean[] isvisited = new boolean[arr.length];
//		for(int i=0; i<arr.length; i++) {
//			if(isvisited[i]) {
//				continue;
//			}
//			isvisited[i]=true;
//			
//			for(int j=i+1; j<arr.length; j++) {
//				if(isvisited[j]) continue; 
//				if(arr[i]==arr[j]) {
//					isvisited[j] = true;
//				}
//			}
////			System.out.println(Arrays.toString(isvisited));
//			arr1[count] = arr[i];
//			count++;
//		}
//		
//		System.out.println(Arrays.toString(arr1));
//		
//		
		
//		 int arr[] = {1,4,5,66,7,7,4,5,66,7};
////	        int k = removeDuplicates(arr);
////	        System.out.println("The array after removing duplicate elements is ");
////	        for (int i = 0; i < k; i++) {
////	            System.out.print(arr[i] + " ");
////	        }
//	     HashSet<Integer> hs = new HashSet<>();
//	     for(int num: arr) {
//	    	 hs.add(num);
//	     }
////	     System.out.println(hs);
//	     
//		Iterator iterator = hs.iterator();
//		while(iterator.hasNext()) {
//			System.out.print(iterator.next()+" ");
//		}
		
		
//		two pointer approach
		 int arr2[] = {1,1,2,2,2,3,3};
		 int i = 0;
	        for (int j = 1; j < arr2.length; j++) {
	            if (arr2[i] != arr2[j]) {
	                i++;
	                arr2[i] = arr2[j];
	                System.out.println(Arrays.toString(arr2));
	            }
	        
		 }
	     System.out.println(i+1);
		System.out.println(Arrays.toString(arr2));
	}
	static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j] = x;
            j++;
        }
        return k;
    }
}
