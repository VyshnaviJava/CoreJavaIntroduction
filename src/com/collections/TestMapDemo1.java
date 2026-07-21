package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo1 {

	public static void main(String[] args) {
		
		Map<Integer,String>m=new HashMap<>();
		
		m.put(7,"Dhoni");
		m.put(18,"virat");
		m.put(45,"rohith");
		m.put(7,"pandya");
		m.put(7,"pandya");
		m.put(7,"Rahul");
		m.put(7,"srikanth");
		m.put(7,null);
		m.put(7,null);
		
		
		//the previous value associated with key or null if there was no mapping for key
		System.out.println(m.put(77, "Gill"));
		System.out.println(m.put(9, "venkat"));
		
		
		//In map,it always old value is replacing with new value when we have duplicate key
		System.out.println(m);
		

	}

}
