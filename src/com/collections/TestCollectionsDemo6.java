package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionsDemo6 {

	public static void main(String[] args) {
		
		Collection<String> fruits = new ArrayList<>();
		
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("pineapple");
		System.out.println(fruits.size());
		
		Object[] objs=fruits.toArray();
		
		for(Object obj : objs) {
			System.out.println(obj);
		}
		System.out.println("*****************");
		
Collection<String> vegies= new ArrayList<>();
		
          vegies.add("banana");
          vegies.add("potato");
          vegies.add("tamato");
          vegies.add("carrot");
   System.out.println(fruits.retainAll(vegies));
   System.out.println(fruits);

		
	}

}
