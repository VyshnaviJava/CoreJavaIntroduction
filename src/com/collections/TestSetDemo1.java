package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestSetDemo1 {
    public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(7, "Dhoni");
		m.put(8, "virat");
		m.put(6, "pandya");
		m.put(5, "pandya");
		System.out.println(m);
		System.out.println("******************************");
		//constructs a new empty set;
		//the backing Hash map instance has default initial capacity(16)
		//and load factor(0.75).
		//hash set internally working based on hash map
		//hash map creates internal table with 16 capacity
		//whatever we are sending the value for a hash set will consider as key
		//for internal hash map
		//what is the value for this key....-->ans is Present =new object() for every key.
		//Then how the key will be storing in buckets?key%bucket size 16
		//but once elements reaching threshold--->current capacity(16)*0.75--->12
		//then the capacity will be double like --->32 then the calculations also changing with 
		//32 only
		//Every bucket is linked list,when we have more than one elements in a same bucket,its arranging
		//inside linked list and will considered as hash collision.
		//In one bucket the linked list size is greater than 8 then from java
		//8 onwards its using red black tree for better performance
		//18 34 99 52 37 27 45 77
		Set<Integer> set = new HashSet<>();//map = new HashMap<>();
		set.add(18);
		set.add(34);
		set.add(37);
		set.add(27);
		set.add(45);
		set.add(52);
		set.add(77);
		set.add(99);
		System.out.println(set);
		}

}
