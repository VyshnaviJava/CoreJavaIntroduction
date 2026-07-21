package com.languagefundamentals.methods;

//1)no argument + no return type
// WAP to calculate two numbers and print the same

//addition()--> +
//subtraction()-->-
//multiplication()--> *
//division()--> /--> will always give you quotient
//modulus()--> % --> will always give you remainder

public class TestmethodsDemo2 {
	
	void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}
	
	void subtraction() {
		int a = 100;
		int b = 200;
		System.out.println(a - b);
	}
	
	void multiplication() {
		int a = 100; 
		int b =	760;
		System.out.println(a * b);
	}
	
	void division() {
		int x = 100;
		int y = 4;
		System.out.println(x/y);
	}
	
	void modulus() {
		int m = 99;
		int n = 5;
		System.out.println(m % n);
	}

	void main() {
		System.out.println("main method started");
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
		
	}

}
