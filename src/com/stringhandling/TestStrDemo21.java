package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.next();
		String result = " ";
		
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if(result.indexOf(c)==-1) {
				result=result+c;
			}
		}
		System.out.println("Removed duplicate elements from given string is :"+result);

	}

}
