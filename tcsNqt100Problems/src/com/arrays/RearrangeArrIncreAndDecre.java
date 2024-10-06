package com.arrays;

import java.util.Arrays;
import java.util.Objects;

class array{
	String name="prem";
//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		array other = (array) obj;
//		return Objects.equals(name, other.name);
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null || getClass()!=obj.getClass()) return false;
		array ar = (array)obj;
		return name==ar.name && Objects.equals(name, ar.name);
		
	}
}


public class RearrangeArrIncreAndDecre {
	public static void main(String[] args) {
		int[] arr= {8,7,1,6,5,9};
		int[] arr1 = {1,7,8,9,5,6};
		int lastFirstPart=arr.length/2-1;
		int first=0;
		int firstsecondPart = lastFirstPart+1;
		int last=arr.length-1;
		while(first<=lastFirstPart) {
			int temp=arr[first];
			arr[first]=arr[lastFirstPart];
			arr[lastFirstPart]=temp;
			first++;
			lastFirstPart--;
		}
		while(firstsecondPart<=last) {
			int temp=arr[firstsecondPart];
			arr[firstsecondPart]=arr[last];
			arr[last]=temp;
			firstsecondPart++;
			last--;
		}
	
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.hashCode());
		System.out.println(arr1.hashCode());
		System.out.println(arr==arr1);
		System.out.println(arr.equals(arr1));
		System.out.println(arr);
		System.out.println("-------");
		
		array abc = new array();
		System.out.println(abc);
		System.out.println(abc.hashCode());
		array abc1 = new array();
		System.out.println(abc1);
		System.out.println(abc1.hashCode());
		System.out.println(abc==abc1);  //Here it is checking the reference equality not the content and hashvalue
		System.out.println(abc.equals(abc1));
	}
}
