package com.javaintro;

public class Student {
// static variables
// Declaration
	static int collegeId = 333;
	static String collegeName = "vss";
//Instance variables
	int studentId =7;
	String studentName="sbh";

	public static void main(String[] args) {
//Intailize the static data
		collegeId =123;
		collegeName = "sidhhartha institute";
//representation
				System.out.println("college Id :"+collegeId);
		        System.out.println("college Name :"+collegeName);
//create object
		        System.out.println("***student object1 info****");
		        Student s1 = new Student();
//Intialize
		        s1.studentId = 101;
		        s1.studentName = "vyshnavi";
//Representation
		        System.out.println("student Id :"+s1.studentId);
		        System.out.println("student Name:"+s1.studentName);
	System.out.println("****student object2 info*****");
	collegeId = 222;
	collegeName = "vcube";
	Student s2 = new Student();
	
	System.out.println("college Id :"+collegeId);
    System.out.println("college Name :"+collegeName);

	System.out.println("student Id:"+s2.studentId);
	System.out.println("student Name:"+s2.studentName);
		
	}

}
