package com.stringhandling;

public class TestStrDemo13 {

	public static void main(String[] args) {
        System.out.println("main method started");
        
        String s1 = "Java";
        String s2 = new String("java");
        s2=s2.intern();
        
        System.out.println(s1==s2);
		
		String str="java is simple in vcube in jntu";
		System.out.println(str.indexOf('i',str.indexOf('i',str.indexOf('i')+1)+1));
		System.out.println(str.indexOf('i',str.indexOf('i')+1));
		
		System.out.println(str.indexOf('i'));
		System.out.println(str.lastIndexOf('i'));
		System.out.println(str.indexOf("in",str.indexOf("in")+1));
		
	}

}
