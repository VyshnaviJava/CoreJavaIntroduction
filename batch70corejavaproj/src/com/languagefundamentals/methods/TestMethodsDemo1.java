package com.languagefundamentals.methods;

//1) no argument + no return type
public class TestMethodsDemo1 {

	//instance method
	//no return type + no arguments
	void greet(){
		System.out.println("Good morning , Have a great day");
	}
	
	static void welcome() {
	 System.out.println("Welcome to methods");
	 }
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		// cannot make a static reference to the non-static method greet() from the type Test methodsDemo1
        //greet();
		
		
		// If we want to call instance methods inside a static area,we must need to create an object.
		
		TestMethodsDemo1 t1 = new TestMethodsDemo1();
		t1.greet();
		
		//static methods we can call directly
		//And also we can call by using class name
		welcome();
		TestMethodsDemo1.welcome();
		//t1.welcome();-->gives warning not recommended approach
		

	}

}
