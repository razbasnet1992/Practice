package com.samples.service;

class Animal{
	
	Animal(){
		System.out.println("This is parent class");
	
		
	}
}
class Dog extends Animal{
	Dog(){
		
		System.out.println(super.hashCode());
		System.out.println("This is child class");
		System.out.println(this.getClass());
		System.out.println(super.getClass());
	}
}

public class SuperCheck {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.hashCode());
		
		
		Animal a = new Animal();
		System.out.println("Animal hascode: "+a.hashCode());
		
		
	}

}
