package com.logicalstatements01;

import java.util.Scanner;

//WAP to provide description about T-shirts...?
public class TestLSDemo9 {

	public static void main(String[] args) {
		System.out.println("Enter your T_shirt size to provide details");
		Scanner sc = new Scanner(System.in);
		
		int t_shirtSize = sc.nextInt();
		
		switch(t_shirtSize) {
		case 36-> System.out.println("small size");
			
		case 38-> System.out.println("medium");
			
		case 40-> System.out.println("large");
			
		default-> System.out.println("Enter size is not available");
		}
		
		

	}

}