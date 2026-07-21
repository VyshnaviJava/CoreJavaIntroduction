package com.stringhandling;

public class TestStrDemo24 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("srikanth");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("srikanth");
		System.out.println(sb3.capacity());
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append("srikanthsrikanthsrikanthsrikanth");
		System.out.println(sb4.capacity());
		

	}

}
