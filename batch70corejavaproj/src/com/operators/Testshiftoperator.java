package com.operators;

public class Testshiftoperator {

	public static void main(String[] args) {
		int a = 54;
		int b = 3;
		
		System.out.println(a<<b);//Left shift operator
		
		int a1 = 15;
		int b1 = 2;
		System.out.println(a1>>b1);//Right shift operator
		System.out.println(a1>>>b1);//Signed right shift operator

	}

}
