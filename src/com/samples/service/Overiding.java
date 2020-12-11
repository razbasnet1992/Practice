package com.samples.service;

class Bike {
	public void m1() {
		
		System.out.println("bike");
	}
}

class Honda3 extends Bike {
	
	public void m1() {
		System.out.println("honda");
	}
}
public class Overiding{
	public static void main(String args[]) {
		Bike obj = new Bike();
		obj.m1();
	}
}
