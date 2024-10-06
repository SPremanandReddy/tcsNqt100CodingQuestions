package com.string;

public class PalindromeOrNot {
	public static void main(String[] args) {
		int num =  779;
		int originalValue = num;
		int reverse = 0;
//		time is O(log10n +1) space is O(1)
		while(num!=0) {
			reverse = reverse*10+(num%10);
			num/=10;
		}
		if(originalValue==reverse) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
		String num1="7557";
		StringBuilder sb = new StringBuilder(num1);
		
		sb.reverse();
		if(num1.equals(sb.toString())) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	}
}
