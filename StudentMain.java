package com.cdac.acts.tester;
import com.cdac.acts.student.Student; //full qualified path 
import java.util.Scanner;
public class StudentMain{
	public static void main(String []args){
		Student s1=new Student(); //using default ctor
		Student s2=new Student("raj kapoor",98); //using parameterised ctor
		s1.printData();
		s2.printData();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your name: ");
		String name=sc.nextLine();
		System.out.println("enter your marks: ");
		double marks=sc.nextDouble();
		Student s3=new Student(name,marks);
		s3.printData();
	}
}
