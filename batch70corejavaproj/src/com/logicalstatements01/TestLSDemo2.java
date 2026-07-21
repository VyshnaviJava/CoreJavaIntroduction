package com.logicalstatements01;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method statred");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you attending classes regularly");
		
		boolean areYouAttendingclassRegularly = sc.nextBoolean();
		boolean areYouAttendingweeklyTest = sc.nextBoolean();
		if(areYouAttendingclassRegularly && areYouAttendingweeklyTest) {
			System.out.println("you will not understand the classes properly & u will get job");
	
		}else {
			System.out.println("no need to learn anything" );
		}
	}
	

}