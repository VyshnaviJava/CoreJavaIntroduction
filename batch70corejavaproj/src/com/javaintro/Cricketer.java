package com.javaintro;

public class Cricketer {
	
// static variables
// Declaration
	static int countryId;
	static String countryName;
	
//Non-static or instance variable or data
	int jerseyNo;
	String cricketerName; 
	
	public static void main(String[] args) {
		System.out.println("main method startes");
		System.out.println("Welcome to  indian team!!");
		System.out.println("main method ended!");
		
		countryId = 91;
		countryName = "India";
//  Representing the static data
	System.out.println(countryId);//0	
	System.out.println(countryName);//null
	System.out.println("*****object1 info*******");
	Cricketer msd = new Cricketer();
	
	System.out.println("country Id : "+countryId);
	System.out.println("country Name : "+countryName);
	
	msd.jerseyNo = 7;
	msd.cricketerName = "mahendra";
	
	System.out.println("jersey Number : "+msd.jerseyNo);
  System.out.println("cricketer Name : "+msd.cricketerName);	
	
	
		

	}

}
