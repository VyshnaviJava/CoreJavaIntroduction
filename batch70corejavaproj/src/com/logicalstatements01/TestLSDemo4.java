package com.logicalstatements01;

import java.util.Scanner;

//WAP to find the given number is Even or odd...?
public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("The given number is Even !!");
		   // System.out.println("Yes !! its even");//when {}is not given it will execute only one line so its better to hava {}
		} else {
		    	System.out.println("The given is odd");
	            System.out.println("Yes its odd");
		
		System.out.println("main method");
		

	}

}
}