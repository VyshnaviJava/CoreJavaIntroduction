package com.Java8features;
@FunctionalInterface
interface In3{
	void sqrt(int n);
}
public class TestJ8DEmo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		In3 i =( n)->
		System.out.println(n*n);
		i.sqrt(2);
		

	}

}
