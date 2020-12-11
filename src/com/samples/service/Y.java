package com.samples.service;

class X {
	int data = 50;

	public int change(int data) {
		data = data + 100;
		return data;
	}
}

public class Y {
	public static void main(String[] args) {

		X op = new X();
		System.out.println(op.data);
		
		System.out.println(op.change(100));

	}

}
