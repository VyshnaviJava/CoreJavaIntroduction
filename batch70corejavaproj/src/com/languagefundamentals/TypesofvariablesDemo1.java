package com.languagefundamentals;

public class TypesofvariablesDemo1 {
	
	
	//primitive + instance
	int id;
	
	//object + Instance
	String name;
	
	//primitive + static variable
	static int collegeId=55;
	
	//object + static variable
	static String collegeName="vcube";

	public static void main(String[] args) {
		System.out.println("main method started");
		//object creation to access instance data members
		TypesofvariablesDemo1 t1 = new TypesofvariablesDemo1();
		System.out.println(t1.id);//0
		System.out.println(t1.name);//null
		
		//We cannot access instance data through class name.
		//cannot make a static reference to the non-static field TypesofvariablesDemo2.id
		//System.out.println(typesofvariablesDemo2.id);
		
		
		
		System.out.println("Accessing static data !*******************");
		//Accessing static data directly...
		System.out.println(collegeId);
		System.out.println(collegeName);
		
		//static data members we can access by using class name also
		//sometimes we need to access the static data outside of the classes then we must need to access through class name.
		//Accessing static dataq through class name is always recommended.
		System.out.println(TypesofvariablesDemo1.collegeId);
		System.out.println(TypesofvariablesDemo1.collegeName);
		
		//static data we can access by using object reference variable also.
		//The static field TypesofvariablesDemo1.collegeId should be accessed in a static way
		System.out.println(t1.collegeId);
		System.out.println(t1.collegeName);
	}

}
