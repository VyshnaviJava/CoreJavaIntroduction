package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

public class TestDataTypesDemo4 {
	
	//Type mismatch: cannot covert from int to integer
	//BigInteger bi = 100;
	//BigDecimal bd = 200;
	
	
	
	String s1 = "Vyshnavi";//String literals
	String s2 = new String();
	String s3 = new String("Java is simple");//string with new keyword
	
	String s4;
	Integer i3;
	BigInteger bi3;
	BigDecimal bd3;
	Character c3;
	Float f3;
	Double d3;
	Boolean b3;
	
	
	BigInteger bi1 = new BigInteger("10000789544788999966444332");
	BigInteger bi2 = new BigInteger("10000789544788999966444332");
	
	BigDecimal bd1 = new BigDecimal("567800654789954332134567654321111.67788886");
	BigDecimal bd2 = new BigDecimal("567800654789954332134567654321111.67788886");


	public static void main(String[] args) {
		System.out.println("main method started");
		
		TestDataTypesDemo4 t4 = new TestDataTypesDemo4();
		System.out.println(t4.s1);
		System.out.println(t4.s2);
		System.out.println(t4.s3);
		System.out.println(t4.s4);
		System.out.println();
		System.out.println(t4.bi3);
		System.out.println(t4.bd3);
		System.out.println(t4.c3);
		System.out.println(t4.f3);
		System.out.println(t4.d3);
		System.out.println(t4.b3);
		
		System.out.println("********************************");
		System.out.println(t4.bi1);
		System.out.println(t4.bi2);
		
		// the operator + is undefined for the argument type(s)
		//can we add this
		//System.out.println(t4.bi1 + t4.bi2);
		
		System.out.println(t4.bi1.add(t4.bi2));
		System.out.println(t4.bi1.multiply(t4.bi2));
		
		System.out.println("***********************************");
		System.out.println(t4.bd1.add(t4.bd2));
		System.out.println(t4.bd1.multiply(t4.bd2));
		
		System.out.println("*********************************");
		System.out.println(t4.s1);
		
		System.out.println("*************************************");
		
		

	}

}
