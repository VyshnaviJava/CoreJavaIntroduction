package com.languagefundamentals.methods;
import java.util.Scanner;
public class TestmethodsDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		// In scanner class , no arg constructor so we are unable to create object for scanner directly
		// so we must need to pass arguments
		//Scanner sc = new Scanner();
		
		// constructs a new scanner that produces values scanned fron the specified input stream
		//to read elements from console
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age :");
		int age = sc.nextInt();
		
		System.out.println("Enter your first name:");
		String fname = sc.next();
		
		System.out.println("Enter your last name:");
		String lname = sc.next();
		
		
		
		
		TestmethodsDemo6 t6 = new TestmethodsDemo6();
		t6.getEmployeeAge(22);
		t6.getEmployeeFullName(fname, lname);
		
		sc.close();
		
	}
	
	void getEmployeeAge(int age){
		System.out.println("Employee age is :" + age);
	}
	
	void getEmployeeFullName(String fn,String ln) {
		System.out.println("The full name of Employee is :"+fn+""+ln);
	}

}
