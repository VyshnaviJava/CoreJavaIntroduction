package com.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

//Hashmap internally uses .equals for key check.
//IdentityHashmap uses == operator for key check.

//As we know == operators always checks addresses of objects.
//.equals ()methods check content of the string.

public class TestmapDemo4 {

	public static void main(String[] args) {
		
		Map<String,String> map = new IdentityHashMap<>();
		String s1 = "Java";
		String s2 = "Java";
		map.put(s1, "simple");
		map.put(s2, "more simple");
		System.out.println(map);
		
		
		System.out.println("******************************");
		Map<String,String> map1 = new IdentityHashMap<>();
		String s3 = new String("Java");
		String s4 = new String("Java");
		map1.put(s3, "simple");
		map1.put(s4, "more simple");
		System.out.println(map1);
		

	}

}
