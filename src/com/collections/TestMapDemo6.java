package com.collections;

import java.util.Hashtable;
import java.util.Map;

public class TestMapDemo6 {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new Hashtable<>();
		
		m.put(1," srikanth");
		m.put(2," vinay");
		m.put(3," raj");
		m.put(4," lokesh");
		m.put(5," mahesh");
//		m.put(null,null);
//		m.put(null,"hello");
//		m.put(6,null);
//		m.put(7,null);
		
		System.out.println(m);
		

	}

}
