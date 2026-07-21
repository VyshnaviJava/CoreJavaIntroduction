package com.languagefundamentals.methods;

public class TestmethodsDemo3 {
	
	static {
		System.out.println("static block started");
	}

	void main(String[] args) {
		System.out.println("main method started");
		System.out.println("The Employee Age is : " + getEmployeeAge());
		
		double sal = getSalary();
		double bonus = getBonus();
		
		// add bonus and salary
		System.out.println("Total salary is :" + (sal+bonus));// by BODMAS
		System.out.println("Total salary is :" + sal + bonus);
	//	System.out.println("Total salary is :" + (getSalary + getBonus()));
	}
	
	int getEmployeeAge() {
		int age = 22;
		return age;
	}
	
	double getSalary() {
		double Salary = 500000.00;
		return Salary;
	}
	
	double getBonus() {
		double Bonus = 20000.00;
		return Bonus;
	}

}
