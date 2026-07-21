package com.Java8features;
@FunctionalInterface
interface minimum{
	void min(int a,int b);
}
public class Task5 {

	public static void main(String[] args) {
		minimum b =(d,e)->{
		if(d<e) {
			System.out.println("print d");
		}else {
			System.out.println("print e");
		}	
		};
		b.min(2, 4);
	}

}
