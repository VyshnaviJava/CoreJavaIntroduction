package com.collections;

import java.util.ArrayList;

public class TestArrayListDemo {

	public static void main(String[] args) {
		
		//constructs an empty list with an initial capacity of ten.
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(5);
		al.add(6);
		al.add(4);
		
		al.add(3);
		al.add(2);
		al.add(1);
		
		al.add(3);
		al.add(10);
		al.add(8);
		al.add(3);
		al.add(null);
		
		al.add(6);//when we add more than 10 elements,while adding 11th element
		//internally re-sizeable array resizing with 15 
		//formula :current-capacity *3/2
		System.out.println(al.size());
	}

}
