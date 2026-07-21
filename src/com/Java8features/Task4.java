package com.Java8features;
@FunctionalInterface
interface maximum{
	void max(int a,int b);
}
public class Task4 {

	public static void main(String[] args) {
		maximum a =(c,b)->{
			if(c>b) {
				System.out.println("print c");
			}else {
				System.out.println("print b");
			}
			
		};
		a.max(30, 20);
	}

}
