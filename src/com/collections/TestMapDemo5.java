package com.collections;

import java.util.HashMap;
import java.util.Map;

class Customer{

	@Override
	public String toString() {
		return "srikanth";
	}
	
	
	
}
//WeakHashMap
//Hash map always dominates garbage collector.so we can say hash map object will not eligible for garbage collection even though objects are nullified.
//Garbage collector dominates weakHashmap.so we can say
public class TestMapDemo5 {

	public static void main(String[] args) {
		
		Map<Object,String> map=new HashMap<>();
		Customer c = new Customer();
		
		map.put(c, "java");
		System.out.println(map);
		c=null;
		System.gc();
		System.out.println(map);
		

	}

}
