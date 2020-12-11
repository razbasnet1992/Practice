package com.samples.service;

 class P{
	final String str = "Raj";
}

class Q extends P{
	int num =10;
	
}

public class FinalClass {
	public static void main(String[] args) {
		Q obj = new Q();
		System.out.println(obj.str);
		
	}

}
