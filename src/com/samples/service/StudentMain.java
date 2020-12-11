package com.samples.service;

class Student{
	private int id;
	private String name;
	private int mark1;
	private int mark2;
	private int totalMarks;
	
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public void setMarks(int mark1,int mark2) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.totalMarks = mark1 + mark2;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark1() {
		return this.mark1;
	}
	public int getMark2() {
		return this.mark2;
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String toString() {
		return "From Tostring:"+ "\n"+"Student id :"+id +" \nstudent name:  "+ name +"\ngf `4w3a2`13f `1awvfwc 3vc 7y4e34ev5uyt6c 56jiuhgy7v xcy5557755t6thr5cv4 6y1bb4gmark1 :"+ mark1 +" \nmark2 :"+ mark2 +" "
				+ "\nTotal Marks: " +totalMarks;
	}
	    
}

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Rajendra");
		s1.setMarks(90, 95);
		System.out.println("Student id "+s1.getId()+" \nStudent name: " + s1.getName() + 
				"\nmark2 " + s1.getMark2());
		
		System.out.println(s1);
	}
	

}
