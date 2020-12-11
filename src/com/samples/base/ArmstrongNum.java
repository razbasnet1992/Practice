package com.samples.base;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num = 0;
		armsNum(num);

	}

	public static void armsNum(int num) {
		int n;
		int c = 0;

		for (int i = 1; i < 1000; i++) {
			num = i;

			while (num > 0) {
				n = num % 10;
				num = num / 10;
				c = c + (n * n * n);

			}
			if (c == i) {
				System.out.println("Armstrong number : "+i);
				
			}
			
			c =0;
		}
		
	}

}
