package com.Java8features;
interface In1{
	void method1();
}
class TestIn1 implements In1{
	@Override
	public void method1() {
		System.out.println("Method1 called");
	}
}

public class TestJ8Demo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		In1 i=new TestIn1();
		i.method1();
		System.out.println("main method ended");
		

	}

}
