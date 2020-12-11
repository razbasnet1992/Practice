package com.samples.service;

class SingletonClass {
	  String s = "Rajendra";
	
	private static SingletonClass  singleton = null;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if(singleton == null) {
			singleton = new SingletonClass();
		}
		return singleton;
	}
	public  void getConnection(String name) {
		System.out.println("You are now connected to database"+"\n"+name);
	}

}

public class MainClass{
	
	public static void main(String[] args) {
		SingletonClass singleton = SingletonClass.getInstance();
		singleton.getConnection("Naren");
		System.out.println(singleton.s);
	}
}

