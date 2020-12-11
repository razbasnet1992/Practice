package com.samples.service;

public class IfElse {
	public static void main(String[] args) {
		String str = "Rajendra";
		
		String message =(str == null)? "it is null ":
			str.substring(0,1);
			System.out.println(message);
			
	}

}
