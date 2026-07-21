package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompDemo2 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(7,"Dhoni",98878987878L,43,100000.00);
		Employee emp2 = new Employee(18,"Dho",98878987878L,47,700000.00);
		Employee emp3 = new Employee(1,"oni",98878987878L,42,800000.00);
		Employee emp4 = new Employee(45,"honi",98878987878L,41,900000.00);
		Employee emp5 = new Employee(8,"Dhoi",98878987878L,40,400000.00);
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		Collections.sort(empList);
		
		for(Employee emp : empList) {
			System.out.println(emp);
		}
	}

}
