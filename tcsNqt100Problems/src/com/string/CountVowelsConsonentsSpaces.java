package com.string;

public class CountVowelsConsonentsSpaces {
	public static void main(String[] args) {
		String name="India won the cricket match";
		name=name.toLowerCase();
		int v=0, c=0, s=0;
//		time is O(n) space is O(1)
		for(int i=0; i<name.length(); i++) {
			char alphabet = name.charAt(i);
			if(alphabet=='a' ||alphabet=='e'|| alphabet=='i'|| alphabet=='o' || alphabet=='u' ) {
				v++;
			}else if(alphabet >='a' && alphabet<='z') {
				c++;
			}else if(alphabet==' ') {
				s++;
			}
		}
		System.out.println("Vowls: "+v);
		System.out.println("Consonents: "+c);
		System.out.println("Space: "+s);
		
		
		
//		ascii of capital vowels i.e., 65, 69, 73, 79, 85
//		ascii of lower vowels i.e., 97, 101, 105, 111, 117
//		ascii of space is 32
		int vowels,consonents,space;
		vowels=consonents=space=0;
		char[] nameArr  = name.toCharArray();
		for(int letter: nameArr) {
			if(letter==65 || letter==69 || letter==73 || letter==79 || letter == 85 ||
			letter==97 || letter==101 || letter==105 || letter==111 || letter == 117) {
				vowels++;
			}else if(letter == 32) {
				space++;
			}else {
				consonents++;
			}
		}
		System.out.println("Vowls: "+vowels);
		System.out.println("Consonents: "+consonents);
		System.out.println("Space: "+space);
		
	}
	
}
