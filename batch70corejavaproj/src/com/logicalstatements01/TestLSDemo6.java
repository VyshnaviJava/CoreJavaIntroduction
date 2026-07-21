package com.logicalstatements01;

import java.util.Scanner;
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("main method strated");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(("Enter your age ..."));
		int age = sc.nextInt();
		
		System.out.println("Do you have License..?");
		boolean hasLicense = sc.nextBoolean();
		
		if(age > 18) {
			if(hasLicense) {
				
				System.out.println("Are u indian....?");
				boolean areYouIndian = sc.nextBoolean();
				
				if(areYouIndian) {
					System.out.println("you are eligible driving");
					
				}else {
					System.out.println("you age & license is good to go but ur dont have citizinship");
				}
				
				
				
			}else {
				System.out.println("Your age is okay but u must need to provide the license");
			}
		}else {
			System.out.println("You are eligible Driving");
		}

	}

}