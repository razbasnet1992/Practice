package com.samples.service;


import java.lang.reflect.Method;

 class A {
	

	private void n() {
		System.out.println("this is private method");
	}
}
public class Ex {
	public static void main(String[] args) throws Exception {
		A c =  new A();
		
		Method m = A.class.getDeclaredMethod("n");
		m.setAccessible(true);
		m.invoke(c);

	}

}
