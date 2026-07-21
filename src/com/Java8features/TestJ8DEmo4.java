package com.Java8features;
interface In4{
	void addition(int a,int b);
}

public class TestJ8DEmo4 {

	public static void main(String[] args) {
		In4 i =(a,b)->{
		int sum = a+b;
		System.out.println("add of two values : "+sum);
		};

	
	i.addition(100,200);

}
}
