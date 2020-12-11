package com.samples.service;

import java.lang.reflect.Field;

import java.lang.reflect.Method;



class MyObject {
	String str ="Rajendra";
	public void m1() {
		System.out.println("method1");
	}

	public static void m2() {
			System.out.println("method2");
	}

	public void m3() {
				System.out.println("method3");
	}

	public void m4() {
		System.out.println("method4");
	}
}
class Test extends MyObject{
	public static void m2() {
		System.out.println("methodtest");
	}
	
}

public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class myObjectClass = MyObject.class;
		System.out.println("Class name : "+myObjectClass.getName());
		
		Method[] methods = MyObject.class.getDeclaredMethods();
		
		for(Method method:methods) {
			System.out.println("methods : "+method.getName());
		}
		
		Field[] fields = myObjectClass.getFields();
		for(Field field:fields) {
		System.out.println("fields : "+field.getName());
		}
       MyObject obj = new MyObject();
       obj.str = "Basnet";
       
       MyObject obj1 = new MyObject();
       System.out.println(obj1.str);
	}

}
