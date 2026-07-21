package com.languagefundamentals.constructors;

public class Example1 {
	
	Example1(){
		System.out.println("Default constructor");
	}
	Example1(String name){
		System.out.println("one argument constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Example1 s1 = new Example1();
		Example1 s2 = new Example1("vyshu");
	}

}
