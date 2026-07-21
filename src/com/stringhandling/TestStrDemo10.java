package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username :");
		String username = sc.next();
		
		System.out.println("enter your password:");
		String password=sc.next();
		
		if(username.equalsIgnoreCase("Admin")&& password.equals("Admin@123")) {
			System.out.println("Welcome to home page");
		}else {
			System.out.println("something went wrong or invalid");
		}
		sc.close();
	

	}

}
