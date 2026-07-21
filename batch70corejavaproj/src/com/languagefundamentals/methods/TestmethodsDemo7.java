package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestmethodsDemo7 {
	
	//with argument + with return type
	// WAP to find areas of triangle ,rectangle,square,circle.
	
	//Area of Triangle = 0.5 *base *height
	//Area of rectangle = length *breadth
	//Area of square = side*side
	//Area of circle = PI*r*r

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		
		// Area of triangle = 0.5*b*h
		System.out.println("Enter Base :");
		double base = sc.nextDouble();
		
		System.out.println("Enter Height :");
		float height = sc.nextFloat();
		
		double arTri=findAreaofTriangle(base,height);
		System.out.println("Area of triangle is : "+arTri);
		
		//Area of circle = PI*r*
		
		System.out.println("Enter radius :");
		double radius = sc.nextDouble();
		double arcir =findAreaofcircle(radius);
		System.out.println("Area of circle is :"+arcir);
		
		//Area of square = side * side
		System.out.println("Enter area ");
		double side = sc.nextDouble();
		double arsqr = findAreaofsquare(side);
		System.out.println("Area of square is :"+arsqr);
		
		//Area of rectangle = l*b
		System.out.println("Enter length :");
		double length  = sc.nextDouble();
		
		System.out.println("Enter breadth :");
		double breadth = sc.nextDouble();
		double arrec = findAreaofrectangle(length,breadth);
		System.out.println("Area of rectangle is :"+arrec);
		
		
		
	}
	
	static double findAreaofTriangle(double b , double h){
		 double arTri = 0.5 *b*h;
		 return arTri;
		
	}
	 static double findAreaofcircle(double r){
		 double arcir = Math.PI * r * r;
				 return arcir;
		 
	 }
	
	 static double findAreaofsquare(double s) {
		 double arsqr = s *s;
		 return arsqr;
		 
	 }
	 static double findAreaofrectangle(double l ,double b) {
		 double arrec = l*b;
		 return arrec;
	 }

}
