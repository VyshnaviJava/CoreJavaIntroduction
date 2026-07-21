package com.Java8features;
@FunctionalInterface
interface Message{
	void display();
}
public class Task2 {

	public static void main(String[] args) {
		Message m=()->{
			System.out.println(" hello world");
			
		};
		m.display();

	}

}
