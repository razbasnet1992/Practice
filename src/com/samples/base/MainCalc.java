package com.samples.base;

public class MainCalc implements Calculator {
	
	static  public void main(String args[]){
		Calculator calc= new MainCalc();
		int sumEvens = calc.addEven(1,2,3,4,5,6,7,8,9);
		System.out.println(sumEvens);
		
		int sumOdds = calc.addEven(1,2,3,4,5,6,7,8,9);
		System.out.println(sumOdds);
		
	}

}
