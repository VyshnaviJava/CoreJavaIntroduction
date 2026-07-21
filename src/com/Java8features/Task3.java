package com.Java8features;
@FunctionalInterface
interface Substraction{
	void substract(int a, int b);
	
}
public class Task3 {

	public static void main(String[] args) {
		Substraction s=(a,b)->{
			int result=a-b;
			System.out.println("substraction:"+result);
			
		};
		s.substract(20, 30);

	}

}
