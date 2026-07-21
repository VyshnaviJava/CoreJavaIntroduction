package com.Java8features;
interface In5{
	double multiplication(int a,int b,int c);
}

public class TestJ8Demo5 {

	public static void main(String[] args) {
		System.out.println("main method startedd");
		In5 i =(l,m,n)->{
			double mul=l*m*n;
			return mul;
		};
		System.out.println(i.multiplication(10,15,18));

	}

}
