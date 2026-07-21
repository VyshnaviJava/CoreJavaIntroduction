package com.collections;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedlistDemo1 {

	public static void main(String[] args) {
		
		
		//whether it is array list or linked list output will be same
		
		//constructs empty list
		List<Integer>l1 = new LinkedList<>();
		//List<Integer>l1 = new ARRAYList<>();
		
		
		l1.add(10);
		l1.add(9);
		l1.add(18);
		l1.add(8);
		l1.add(15);
		l1.add(10);
		l1.add(null);
		l1.add(null);
		l1.add(100);
		
		l1.addFirst(50);
		l1.addLast(500);
		System.out.println(11);
		System.out.println(l1.reversed());
	}

}
