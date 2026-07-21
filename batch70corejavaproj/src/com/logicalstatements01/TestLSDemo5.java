package com.logicalstatements01;

import java.util.Scanner;

//WAP to find the grade based on your marks...?
public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks percentage :");
		
		double marksp = sc.nextDouble();
		
		if(marksp > 100 || marksp < 0) {
			System.out.println("Invalid marks percentage");
			
		}else if(marksp >= 90) {
			System.out.println("Grade A");
		}else if(marksp >= 80) {
			System.out.println("Grade B");
		}else if(marksp >= 70) {
			System.out.println("Grade c");
		}else if(marksp >= 60) {
			System.out.println("Grade D");
		}else if(marksp >= 35) {
			System.out.println("Just passed");
		}else {
			System.out.println("Failed");
		}
		
		sc.close();

	}

}