package com.logicalstatements01;

import java.util.Scanner;

//WAP  for a simple java program which can provide thepossibilites
//for marriage matrimony console based application

public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("Welcome to vcube matrimnial website");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tell me about your name :");
		String name = sc.nextLine();
		System.out.println("Hello Mr." + name);
		
		System.out.println("can you tell how much assets you have...?");
		double assets = sc.nextDouble();
		System.out.println("Enter your salary info :");
		double salary = sc.nextDouble();
		
		if (assets >= 50000000.00 && salary >=20000000.0) {
			System.out.println("Yes then we can start the conversation");
			
			System.out.println("Enter your age:");
			int age = sc.nextInt();
			
		if(age <=28 && age >=26) {
				System.out.println("oh okay shall we proceed");
				
				System.out.println("Can you enter your weight...?");
				
				double weight = sc.nextDouble();
				
				if(weight <= 70 && weight >= 65) {
					System.out.println("okay cool lets enter your height");
					
					float height = sc.nextFloat();
					
					if(height >= 5.4 && height <= 6.0) {
						System.out.println("okay good to go");
						
						System.out.println("Do you have siblings...?");
						
						boolean sibStatus = sc.nextBoolean();
						
						if(!sibStatus) {
							System.out.println("okay we will back to u soon");
						}else {
							System.out.println("omg........");
						}
					}else {
						System.out.println("your height is too long or too short not matching");
					}
				}else {
					System.out.println("you must join in gym");
				}
			}else {
				System.out.println("sorry your age is not matching with ur profile");
			}
			
		}else {
			System.out.println("you can leave for the day");
		}
		
	}

}