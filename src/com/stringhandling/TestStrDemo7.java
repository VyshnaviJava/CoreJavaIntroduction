package com.stringhandling;

public class TestStrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String str = "Java srikanth";
		//Returns the character (Unicode code point) at the specified index. The index refers to char values (Unicode code units) and ranges from 0 to length() - 1 .
		System.out.println(str.codePointAt(1));//97
		
		//Returns the character (Unicode code point) before the specified index. The index refers to char values (Unicode code units) and ranges from 1 to length.
		System.out.println(str.codePointBefore(1));//74
		
		//Returns the number of Unicode code points in the specified text range of this String .  
		System.out.println(str.codePointCount(1, 6));

	}

}
