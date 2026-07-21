package com.operators;

public class TestUnaryOPerators02 {

	public static void main(String[] args) {
		
		
		int a = 5;
		int b = 4;
		
		System.out.println(b++);
		System.out.println(++a);
		System.out.println(b--);
		System.out.println(--b);
		System.out.println(a--);
		System.out.println(b++);
		System.out.println(++b);
		System.out.println(--a);
		System.out.println(a - b);
		System.out.println(a++);
		System.out.println(--b);
		
		System.out.println("a value is :" + a);
		System.out.println("b value is :" + b);
		
		System.out.println(a++ + b++ + ++a + ++b);
		System.out.println(a++ + ++b - ++a + --b);
	}

}
