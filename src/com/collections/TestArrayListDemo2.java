package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListDemo2 {

	public static void main(String[] args) {
		 
		Student s1 = new Student(1,"Kohli",38,91891234356L);
		Student s2 = new Student(1,"rohith",37,7645678896L);
		Student s3 = new Student(1,"lokesh",35,91891234356L);
		Student s4 = new Student(1,"jadeja",78,56787804L);
		Student s5 = new Student(1,"dhoni",48,678854333456L);
		
		List<Student> li = new ArrayList<>();
		
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		
		for(Student s:li) {
			System.out.println(s);
		}
		
		System.out.println(li);
		
		

	}

}
