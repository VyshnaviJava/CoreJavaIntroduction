package com.stringhandling;

public class TestStrDemo23 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		StringBuffer sb = new StringBuffer("srikanth");
		System.out.println(sb);
		
		String s1 = "java";//string is immutable so cocat doesnt work
		s1.concat("srikanth");
		System.out.println(s1);
		
		StringBuffer sb1 = new StringBuffer("srikanth");//stringbuffer mutable so append works
		sb1.append("java");
		System.out.println(sb1);

	}

}
