package com.collections;

class TestDemo2{
	TestDemo2(){
		show();
	}
	void show() {
		System.out.println("Present");
	}
}
public class TestDemo1 {
	
	int x =10;
	
	TestDemo1(){
		super();
		System.out.println("no arg called");
		
	}

	public static void main(String[] args) {
		 new TestDemo1();
		}
	void show() {
		System.out.println(x);
	}

}
