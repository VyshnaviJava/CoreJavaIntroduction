package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {
		 
		//class cast exception
//		SortedSet s = new TreeSet<>();
//		s.add("Srikanth");
//		s.add("java");
//		s.add(10);
//		s.add(9);
//		System.out.println(s);
		System.out.println("*********************");
		SortedSet<Integer> ss= new TreeSet<>();
		ss.add(10);
		ss.add(45);
		ss.add(18);
		ss.add(7);
		ss.add(0);
		ss.add(1);
		ss.add(9);
		ss.add(15);
		ss.add(10);
		ss.add(10);
		System.out.println(ss);
		System.out.println(ss.first());//10
		System.out.println(ss.last());//45
		//Returns a view of the portion of this set
		//whose elements are strictly less than to element
		System.out.println(ss.headSet(15));//0 1 7  9 10
		
		//returns a view of the portion of this set
		//whose elements are greater than or equal to from element
		System.out.println(ss.tailSet(10));// 10 15 18 45
		System.out.println(ss.subSet(7, 18));// 7 9 10 15
		}

}
