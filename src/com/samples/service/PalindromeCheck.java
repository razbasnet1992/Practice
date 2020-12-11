package com.samples.service;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		
		System.out.println("Enter string");
		
		
		String str = obj.nextLine();
		
		char[] chars = str.toCharArray();
		System.out.println(chars);
		
		//String s = chars.toString();
		boolean isTrue = isPalindrome(str);
		System.out.println(isTrue);
		
		System.out.println(str.charAt(2));
		
	}
	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}
		StringBuilder strBuilder = new StringBuilder(s);
		strBuilder.reverse();
		return strBuilder.toString().equals(s);
	}
	
}
