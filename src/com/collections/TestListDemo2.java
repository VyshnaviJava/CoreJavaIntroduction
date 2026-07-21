package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TestListDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
List<String>girls= new ArrayList<>();
		
		girls.add("akki");
		girls.add("vyshu");

		
		List<String>boys= new ArrayList<>();
		
		boys.add("vinay");
		boys.add("tilak");
		boys.add(0,"sasank");
		boys.add("Ayyan");
		boys.add("siddu");
		boys.add(1,"bharath");
		boys.add("vinay");
		boys.add(1,"srikanth");
		boys.add(0,"swamy");
		boys.add(null);
		boys.add(null);
		
		List<String>students = new ArrayList<>();
		
		students.addAll(boys);
		students.addAll(girls);
		System.out.println(students);
		
		System.out.println("*************************");
		
		List<String>trainers= new ArrayList<>();
		trainers.add("Srikanth");
		trainers.add("vishwanath");
		
		students.addAll(1,trainers);
		System.out.println(students);
		
		System.out.println("************************************");
		
		System.out.println(boys);
		System.out.println(boys.set(0, "Abhisek"));//repalces the element at the specified position in this list with the
		System.out.println(boys);
		
		System.out.println("*****************************");
		for(int i =0;i<boys.size();i++) {
			System.out.println(boys.get(i));
		}
		System.out.println("*****************************");
		for(String b : boys) {
			System.out.println(b);
		}
		System.out.println("******************************");	
		
		Iterator<String> it= boys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(boys);
		
		System.out.println("main method ended");
	}

}
