package com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSetDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method strated");
		
		Set<String> s = new HashSet<>();
		s.add("sachin");
		s.add("kohli");
		s.add("dhoni");
		s.add("rohith");
		s.add("rahul");
		s.add("jadeja");
		s.add(null);
		
		System.out.println(s);
		
		System.out.println("Main method ended");
		

	}

}
