package com.string;

public class AsciiValue {
	public static void main(String[] args) {
		char Char = 'a';
		int ascii = Char;
		System.out.println("Implicit TypeCAsting  "+ascii);
		
		int CharAscii = (int)Char;
		System.out.println("Explicit TypeCasting :"+CharAscii);
	}
}
