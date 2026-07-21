package com.Java8features;
@FunctionalInterface
interface CheckNumber{
	void check(int n);
	
}

public class Task1 {

	public static void main(String[] args) {
		CheckNumber c = n->{
			if(n%2==0) {
				System.out.println("even numner");
			}else {
				System.out.println("odd number");
			}
			
		};
		c.check(25);

	}

}
