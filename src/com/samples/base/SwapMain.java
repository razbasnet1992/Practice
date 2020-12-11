package com.samples.base;

class Car{
	int model,no;
	Car(int model,int no){
		this.model = model;
		this.no = no;
	}
	public void print() {
		System.out.println("Model " +this.model+" and "+ "no "+this.no);
	}
}
class CarWrapper{
	Car c;
	CarWrapper(Car c){
		this.c = c;
	}
}


public class SwapMain {
	public static void swap(CarWrapper cw1,CarWrapper cw2) {
		Car temp = cw1.c;
		cw1.c = cw2.c;
		cw2.c = temp;
	}
	public static void main(String args []) throws Exception{
		Car c1 = new Car(101,1);
		Car c2 = new Car(202,2);
		CarWrapper cw1 = new CarWrapper(c1);
		CarWrapper cw2 = new CarWrapper(c2);
		swap(cw1,cw2);
		cw1.c.print();
		cw2.c.print();
		
		
		
	}

}
