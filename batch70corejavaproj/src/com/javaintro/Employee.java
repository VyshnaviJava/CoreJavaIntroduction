package com.javaintro;

public class Employee {
		// static variables
		//DEclaration
			static int companyId;
			static String companyName;
			
		//instance variables
			int empId;
			String empName;

			public static void main(String[] args) {
				System.out.println("Main method started");
				System.out.println("Welcome to employee info");
				System.out.println("Main method ended");
		// Initialize static data
				companyId = 123;
				companyName = "Tech solutions";
		// Representing the static data
				System.out.println("company Id : "+companyId);//123
				System.out.println("company Name : "+companyName);//tech solutions
				
		//Intialize instance data
				
		//creating object
				System.out.println("*******employee object1 info*******");
				Employee e1 = new Employee();
		//Assigning or initialize instance data
				e1.empId = 101;
				e1.empName = "vyshnavi";
		//Representing or accessing instance data
				System.out.println("Employee Id : "+e1.empId);
				System.out.println("Employee Name : "+e1.empName);
		//second object
				System.out.println("******employee object2 info************");
				Employee e2 = new Employee();
				e2.empId = 102;
				e2.empName = "akshara";
				System.out.println("Employee Id :"+e2.empId);
				System.out.println("Employee Name :"+e2.empName);

	}

}
