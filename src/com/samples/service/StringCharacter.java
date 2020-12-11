package com.samples.service;

public class StringCharacter {

	public static void main(String[] args) {
		String str = "Rajendra";
		int i;
		for(i=0;i<str.length();i++) {
		System.out.println("\n"+str.charAt(i));
		}
		char [] c = str.toCharArray();
		for(char ch:c) {
			System.out.println(ch);
		}
		
	}
}
