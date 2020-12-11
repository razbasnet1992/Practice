package com.samples.base;

public class ReverseNum {
	public static void main(String[] args) {
		int num = 1534;
		System.out.println(numReverse(num));
		
	}
public static int numReverse(int num) {
	int reversed =0;
	while(num!=0) {
		int digit = num%10;
		reversed = reversed*10 + digit;
		num = num/10;
	}
	return reversed;

}
}
