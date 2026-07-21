package com.languagefundamentals.methods;

//with Argument + No return type
public class TestmethodsDemo5 {

	public static void main(String[] args) {
		// call by value
		greet("Good Mrng,have a nice day");
		addition(100,200);
		subtraction(4000.0F,6000.986);
		multiplication(23445,235.098F);
		division(64,345.0F);
		modulus((byte)18,147);

	}
	
	static void greet(String wish) {
		System.out.println("Greeting : " +wish);
		
	}
	static void addition(int a , int b) {
		System.out.println("In Add : "+ (a+b));
	}
	static void subtraction(float a , double b) {
		System.out.println("In Sub : "+(a-b));
	}
	static void multiplication(int a , float b) {
		System.out.println("In mul: "+(a*b));
	}
	static void division(int a , float b) {
		System.out.println("In div :"+(a/b));
	}
	static void modulus(byte a , int b) {
		System.out.println("In modulus : "+(a%b));
	}

}
