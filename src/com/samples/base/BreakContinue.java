package com.samples.base;

public class BreakContinue {
	static public void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			if(i==3) {
				break;
			}
			System.out.print(i);
		}
		System.out.print("\nContinue command :");
		for(int i=0;i<5;i++) {
			if(i==3) {
				continue;
			}
			System.out.print(i);
		}
	}

}
