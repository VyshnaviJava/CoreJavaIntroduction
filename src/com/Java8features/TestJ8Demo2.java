package com.Java8features;
@FunctionalInterface
interface In2{
	void method1();
	}

public class TestJ8Demo2 {

	public static void main(String[] args) {
		System.out.println("Main method strated");
		In2 i=()->
		System.out.println("method1 called");
		i.method1();
		System.out.println("main ended");
		

	}

}
