package com.cdac.acts.student;

public class Student{
	private int rollno;
	private String name;
	private double marks;
	private static int idGenerator = 100;
	
	public Student(){
		this.rollno=idGenerator++;
		this.name=" ";
		this.marks=0.0;
	}
	public Student(String name,double marks){
		this.rollno=idGenerator++;
		this.name=name;
		this.marks=marks;
	}
	public void printData(){
		System.out.println("Student[Rollno:"+rollno+", Name:"+name+", Marks:"+
	marks+"]");
	}
}
		
	