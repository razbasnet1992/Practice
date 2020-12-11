package com.samples.service;

import java.util.Scanner;

public class SwitchExpression {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = n.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("it is monday");
			break;
		case 3:	
		case 2:
			System.out.println("it is tuesday");
			break;
		
		default:
			System.out.println("\nEnter between 1 and 7");
			break;
		}
		System.out.println("Your entered number "+num);
	}

}
