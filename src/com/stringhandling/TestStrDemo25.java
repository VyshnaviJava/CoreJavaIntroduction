package com.stringhandling;

public class TestStrDemo25 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("srikanthsrikanthsrikanth");
		sb1.append("srikanthsrikanth");
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("java");
		sb2.append("srikanth");
		sb2.append("srikanth");
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("java is simple");
		sb3.delete(8, 14);
		System.out.println(sb3);
		sb3.deleteCharAt(5);
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer();
		sb4.ensureCapacity(100);
		System.out.println(sb4.capacity());
		
		
	}

}
