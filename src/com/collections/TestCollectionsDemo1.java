package com.collections;

import java.util.Collection;

import java.util.ArrayList;

public class TestCollectionsDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Object[] obj =new Object[5];
		
		obj[0] = 10;
		obj[1] = "vyshu";
		obj[2] = 5.8;
		obj[3] = 10000.0;
		obj[4] ='c';
		
		for(Object o:obj) {
			System.out.println(o);
		}
		
		System.out.println("******************************");
		//Collection is a raw type.
		//References to generic type Collection<E> should be parameterized
		Collection<Integer> c = new ArrayList<>();
		
		//c.add("Apple");
		//c.add("banana");
		//c.add(100.0);
		c.add(7);
		c.add(1);
		
		c.add(8);
		c.add(9);
		c.add(6);
		c.add(5);
		c.add(7);
		
		
		System.out.println(c);
		
	}

}
