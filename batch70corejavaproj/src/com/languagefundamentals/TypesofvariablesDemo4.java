package com.languagefundamentals;

public class TypesofvariablesDemo4 {
	
	int id;
	static String name = "vyshnavi";

	public static void main(String[] args) {
		
		var a = 100;
		var a1 = "Ram";
		var a2 = 5.9;
		var a3 = 'A';
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		TypesofvariablesDemo4 s1 = new TypesofvariablesDemo4();
		s1.id=101;
		System.out.println(s1.id);//101
		System.out.println(s1.name);//vyshnavi
		
		TypesofvariablesDemo4 s2 = new TypesofvariablesDemo4();
		System.out.println(s2.id);//0
		System.out.println(s2.name);//vyshnavi
		
		TypesofvariablesDemo4 s3 = null;//null. anything is NPE (null pointer exception)
		System.out.println(s3.name);//but not for static data
		//System.out.println(s3.id);
		
		
		
		
		
	}

}
