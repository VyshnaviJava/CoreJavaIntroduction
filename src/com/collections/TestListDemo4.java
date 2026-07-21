package com.collections;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListDemo4 {

	public static void main(String[] args) {
		
		
		List<String> fruits= new ArrayList<>();
		
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("apple");
		fruits.add("pineapple");
		
		Iterator<String> itr = fruits.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("****************************");
		List<String> vegies= new ArrayList<>();
		
        vegies.add("banana");
        vegies.add("potato");
        vegies.add("tamato");
        vegies.add("carrot");
        
       ListIterator<String> litr = vegies.listIterator();
       while(litr.hasNext()) {
    	   System.out.println(litr.next());
       }
       System.out.println("**********************************");
       while(litr.hasPrevious());
       System.out.println(litr.previous());


}
}
