package com.languagefundamentals;


//whenever we want to share the data to all objects then will use static for data members
//whenever the data is changing from object to object then we keep the data members as instance

public class TypesofvariablesDemo3 {
	
	int id =10;
	
	//static variables
	static String collegeName = "VSS";
	

	public static void main(String[] args) {
		//local variable will not provide default values
		//whenever we access local variables,the variable must be assigned otherwise we get compile time error
		// why local variables...to main temporary data
		String collegeName = "sss";
		int id = 9;
		
		int x;
		x=100;//should be initialized
		//System.out.println(x);//should be initialized
		System.out.println(x);
		
		System.out.println("main method started");
		//Accessing local variables
		System.out.println(collegeName);
		System.out.println(id);
		
		//Accessing static data
		System.out.println(TypesofvariablesDemo3.collegeName);
		

	}

}
