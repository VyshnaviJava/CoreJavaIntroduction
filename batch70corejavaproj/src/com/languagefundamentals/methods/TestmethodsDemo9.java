package com.languagefundamentals.methods;

//SRS : service Requirement specification
interface In1 {
	//abstract methods do not specify a body
	//void method1() {
		
	//}
public abstract void method2();// abstract method : which doesnt provide
}


class Student{
	String name;
}

public class TestmethodsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
	Student s1	=createstudent();
	s1.name = "vyshu";
	System.out.println(s1.name);
		
	}
	
	//factory methods
	static Student createstudent(){
		Student s = new Student();
		return s;
		
	}

}
