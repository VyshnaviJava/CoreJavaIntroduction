package com.logicalstatements01;

import java.util.Scanner;

//WAP to print the given age is eligible for voting or driving..?

public class TestLSDemo1{

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.println("you are eligible for voting & Driving !!");
			System.out.println(("congratulations!!"));
		}else {
			System.out.println("you are not eligible");
		}
		
		
		System.out.println("main method ended !!");

	}

}