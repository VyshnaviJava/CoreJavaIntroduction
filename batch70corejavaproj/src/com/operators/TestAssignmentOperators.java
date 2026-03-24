package com.operators;


//Assignment operators or compound operators are
//== += -= *= /= %=
public class TestAssignmentOperators {

	public static void main(String[] args) {
		
		int result = 0;
		double a = 5.5;
		//result = result +a;//Type mismatch:cannot convert from double to int
		
		result += a;//result = result + a
		System.out.println("Addition : " + result);//5
		System.out.println("***************************");
		
		double b = 2.9;
		//result = (int) (result - b);
		result -= b;
		System.out.println("Subtraction : " + result);
		
		double c = 4.5;
		result *= c;
		System.out.println("Multiplication : " + result);
		
		double d = 3;
		//result = (int) (result - b);
		result /= d;
		System.out.println("Division or quotient : " + result);
		
		double e = 1;
		//result = (int) (result - b);
		result %= e;//result = result%e ;--->result = 3/1 =0
		System.out.println("Modulus or reminder : " + result);
		
		
		
		
		
	}

}
