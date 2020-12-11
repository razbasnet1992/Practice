package com.samples.service;

import java.lang.reflect.Method;

class B {
	private void display() {

		System.out.println("private method is invoked");
	}
}

public class PrivateExample {
	public static void main(String[] args) throws Exception {

		Class c = Class.forName("com.samples.service.B");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("display");
		m.setAccessible(true);
		m.invoke(o);
	}
}