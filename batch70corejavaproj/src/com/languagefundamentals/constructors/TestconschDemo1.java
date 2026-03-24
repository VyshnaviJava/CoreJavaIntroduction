package com.languagefundamentals.constructors;

class Animal{
	String name = "puppy";
	
	void show() {
		System.out.println("Animal " + name);
		
	}
}

class Dog extends Animal{
	
	String name = "sweety";
	
	//note : this super can use only in instance area but not in static area
	//@override
	void show() {
		System.out.println("Dog " + super.name);
	}
	
	
	//cannot use super in a static context
	//static void display() {
	//	System.out.println(super.name);
	}


public class TestconschDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		
		Dog d = new Dog();
		//System.out.println(d.name);
		d.show();
		System.out.println("main method ended !!");
		
	}

}
