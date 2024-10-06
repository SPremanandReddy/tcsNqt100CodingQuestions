package com.string;

public class RemoveSpaces {
	public static void main(String[] args) {
		String text = "How are you doing";
		int spaces=0;
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i)==' ') {
				text=text.substring(0,i)+text.substring(i+1); 
				spaces++;
			}
		}
		System.out.println(text);
		System.out.println("No of spaces "+ spaces);
	}
}
