package com.samples.base;

public class Address {
	private Staff info;
	private double salary;
	private String position;
	public Address(Staff info, double salary, String position) {
		super();
		this.info = info;
		this.salary = salary;
		this.position = position;
	}
	public Staff getInfo() {
		return info;
	}
	public void setInfo(Staff info) {
		this.info = info;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	
	

}
