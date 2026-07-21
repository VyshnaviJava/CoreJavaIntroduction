package com.javaintro;

public class TestDemo {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Main method started from TestDemo");
		
//		Class.forName("com.javaintro.Student");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class Loaded Successfully");

	}

}
