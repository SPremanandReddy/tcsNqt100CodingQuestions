package com.arrays;

import java.text.DecimalFormat;
import java.util.stream.IntStream;

public class AverageOfAllElements {
	public static void main(String[] args) {
		int arr[]  = {1,2,1,1,5,1};
		double total = IntStream.of(arr).sum();
		System.out.println(total/arr.length);
		DecimalFormat df = new DecimalFormat("#.#");
		String avg = df.format(total/arr.length);
		System.out.println(avg);
//		time is o(n) space is O(1)
		double sum=0;
		for(int i: arr) {
			sum+=(double)i;
//			it gets typecasted implicitly or else we can do like (double)i
		}
		String output = String.format("%.1f",sum/arr.length);
		System.out.println(Float.parseFloat(output));
	}
}
