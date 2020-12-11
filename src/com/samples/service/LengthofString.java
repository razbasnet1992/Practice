package com.samples.service;

public class LengthofString {

	public static void main(String[] args) {
		String str = "Rajendra";
		int s = str.length();
		StringBuilder strb = new StringBuilder();
		strb.append(str);

		strb.reverse();

		System.out.println(strb);

		char[] c = str.toCharArray();
		for (int i = c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}

	}
}
