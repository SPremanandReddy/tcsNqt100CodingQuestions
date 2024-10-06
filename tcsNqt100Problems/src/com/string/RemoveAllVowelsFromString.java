package com.string;

public class RemoveAllVowelsFromString {
	public static void main(String[] args) {
		String String = "I am very happy today";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<String.length(); i++) {
			char val = String.charAt(i);
			if( val!= 'a' && val!='e' && val!='i' && val!='o' && val!='u' &&
				val!='E' && val!='A' && val!='I' && val!='O' && val!='U' ) {
				sb.append(val);
			}
		}
		String output = sb.toString();
		System.out.println(output);
		
		
		String text = "I am very happy today";
		System.out.println(text +" The ouput is without vowels : "+ removeVowels(text));
	}
	
	static String removeVowels(String text) {
		for(int i=0; i<text.length(); i++) {
			char letter = text.charAt(i);
			if(letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U' ||
					letter=='a' || 
					letter=='e' || 
					letter=='o' || letter=='i' || letter=='u' ) {
				text=text.substring(0,i)+text.substring(i+1);
			}
		}
		return text;
	}
}
