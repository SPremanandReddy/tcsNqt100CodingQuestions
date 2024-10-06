package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	public static void main(String[] args) {
		int arr[] = {10,5,10,15,10,5};
		//bruteForce
		
		boolean isVisited[] = new boolean[arr.length];
		for(int i=0; i<arr.length-2; i++) {
			if(isVisited[i]==true) {
				continue;
			}
			isVisited[i]=true;
			int Count=1;
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[i]==arr[j]) {
					isVisited[j]=true;
					Count++;
				}
			}
			System.out.println("The Count of "+arr[i]+" "+Count);
		}
		
		
		
//		timeComplexity n and space 1
		Map<Integer,Integer> frequencyCount = new HashMap();
		for(int element:arr) {
			if(!frequencyCount.containsKey(element)) {
				frequencyCount.put(element, 1);
			}else {
				frequencyCount.put(element, frequencyCount.get(element)+1);
			}
		}
		
		System.out.println(frequencyCount);
	}
}
