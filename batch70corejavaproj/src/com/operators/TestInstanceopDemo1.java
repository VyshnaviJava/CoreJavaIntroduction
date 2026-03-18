package com.operators;

public class TestInstanceopDemo1 {

	public static void main(String[] args) {
		
		Integer i1 = 10;
		System.out.println(i1 instanceof Integer);//true
		System.out.println(i1 instanceof Number);//true
		System.out.println(i1 instanceof Object);//true
		
		String s1 = " vyshnavi";
		//System.out.println(s1 instanceof Integer);//CE error
		
		
		
		Number n = 100;
		System.out.println(n instanceof Number);//true
		System.out.println(n instanceof Integer);//true
		
		
		//when false will come?
		Number n1 = null;
		System.out.println(n1 instanceof Number);//false
		System.out.println(n1 instanceof Integer);//false
	}

}
