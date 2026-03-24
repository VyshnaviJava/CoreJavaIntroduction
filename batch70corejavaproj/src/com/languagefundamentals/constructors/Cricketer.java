package com.languagefundamentals.constructors;

//Note : In java ,if the program does not contain any explicit constructor then java compiler
//will create a constructor name called default constructor.

//ex.default constructor  looks like below
//syntax :public Cricketer(){}

public class Cricketer {
	
	int jno;
	String name;
	
	
	//no arg constructor
	Cricketer(){
		System.out.println("No arg constructor called !");
		
	}
	{
		System.out.println("Instance block called !");
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		//Note 1 : The below object is created with the help of default constructor.
		//whenever the class does not contains any constructors then java
		//compiler will create default constructor.
		
		//Note 2 : The below object is created with the help of no arg constructor.
		//Whenever the class contains any constructor then java compiler will not create 
		//default constructor ,now we have explicit no arg constructor so the below object is created with the 
		//help of no arg constructor
		Cricketer c1 = new Cricketer();//cricketer()--> constructor calling
		c1.jno=9;
		c1.name = "sanju samson";
		System.out.println(c1.jno);
		System.out.println(c1.name);
		
		// the constructor scanner() is undefined
		//scanner sc = new scanner();
		
		System.out.println("main method ended");
		
		
		}
       

	}


