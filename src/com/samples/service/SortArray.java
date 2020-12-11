package com.samples.service;

public class SortArray {

	public static void main(String[] args) {
		
		int []  num = {1,6,7,10,4,9};
		int sum =0;
		
		for(int i :num) {
		System.out.print(i +" ");
		sum = sum +i;
		
		
		}
		System.out.println(sum);
		System.out.println(num.length);
	}

}
