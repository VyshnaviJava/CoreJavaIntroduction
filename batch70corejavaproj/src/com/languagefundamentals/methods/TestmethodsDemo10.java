package com.languagefundamentals.methods;

class Employee{
	String name = "vyshu";
}

public class TestmethodsDemo10 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		getEmployee(e1);
		

	}
	static void getEmployee(Employee e1){
		System.out.println(e1.name);
		
	}

}
