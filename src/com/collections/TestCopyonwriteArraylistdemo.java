package com.collections;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyonwriteArraylistdemo {

	public static void main(String[] args) {
		
		
		List<Integer> a1 = new CopyOnWriteArrayList<>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		
		//fail safe with copyonwriteArrayList
//		Iterator<Integer>itr =a1 .iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			a1.add(100);
//		}
//		
		//fail fast with arrayList with iterator
//		Iterator<Integer>itr =a1 .iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			a1.add(100);
//		}
		//fail fast
//        for(Integer i : a1) {
//        	System.out.println(i+"");
//        	a1.add(60);
//        }
		
		
		//stack overflow error comes
//		for(int i= 0;i<a1.size();i++) {
//			System.out.println(a1.get(i));
//			a1.add(100);
//		}
		System.out.println(a1);

	}

}
