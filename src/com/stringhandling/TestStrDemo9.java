package com.stringhandling;

public class TestStrDemo9 {

	public static void main(String[] args) {
		
		char[] ch = {'j','a','v','a'};
		
		String s1 = String.copyValueOf(ch);
		System.out.println(s1);
		
		char[] ch1 = {'j','a','v','a','i','s','s','i','m','p','l','e'};
		String s2 = String.copyValueOf(ch1,6,6);
		System.out.println(s2);
		System.out.println("***********************************");
		String[] names = {"J2SE","J2EE","Spring","spring boot","microservices","jdbc"};
		for(String name:names) {
			if(name.startsWith("j")) {
				System.out.println(name);
			}
		}
	}

}
