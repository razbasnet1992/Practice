package com.samples.service;

class Raj {
      int a;
      
	public int num(int a) {
		
		this.a = this.a +a*a;
		return a;
	}
}

public class Value {
	public static void main(String[] args) {
		int a = 10;
		
		Raj r = new Raj();
		
		System.out.println(r.num(a));
		System.out.println(r.num(a));
		System.out.println(r.a+a);
	}

}
