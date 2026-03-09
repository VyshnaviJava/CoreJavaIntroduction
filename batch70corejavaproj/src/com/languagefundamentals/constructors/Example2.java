package com.languagefundamentals.constructors;

public class Example2 {
	
	String brand;
	
	Example2(String brand)
	{
	this.brand=brand;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Example2 c1 = new Example2("Toyota");
		System.out.println(c1.brand);

	}

}
