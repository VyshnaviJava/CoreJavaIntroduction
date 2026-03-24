package com.languagefundamentals.constructors;

public class Vehicle {
	
	String model;
	String brand;
	
	Vehicle(){
		System.out.println("vehicle no arg constructor callled");
	}
	
	public Vehicle(String model,String brand) {
		super();
		System.out.println("vehicle class parameterized constructor called");
		this.model = model;
		this.brand = brand;
	}
	
	
	public static void main(String[]args) {
		System.out.println("Vehicle class main method started");
	}
}
class Car1 extends Vehicle {
	public static void main(String[]args) {
		System.out.println("car1 class main method started ");
		
		Car1 c1 = new Car1();
		
		System.out.println("car1 class main method ended");
	}
}