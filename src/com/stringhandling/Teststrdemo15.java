package com.stringhandling;

public class Teststrdemo15 {

	public static void main(String[] args) {
		String str = String.join("-","java","is","simple","in");
		System.out.println(str);
		
		String str1 = "Good morning ";
		String[]words =str1.split("-",4);
		int count=0;
		
		for(String word : words) {
			count++;
			System.out.println(word);
		}
		System.out.println("count of all the word : "+count);
		System.out.println(str.length());
	}

}
