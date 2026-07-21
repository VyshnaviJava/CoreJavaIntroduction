package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestcollectionDemo4 {

	public static void main(String[] args) {
		
		Collection<String> batsmens = new ArrayList<>();
		batsmens.add("virat");
		batsmens.add("rohith");
		batsmens.add("iyer");
		batsmens.add("dhoni");
		batsmens.add("rahul");
		System.out.println(batsmens);
		
		batsmens.removeIf(s->s.equals("Rohith"));
		
		Iterator<String> itr = batsmens.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***********************");
		//enhanced for loop or for each loop
		//for(String batsMen : batsmens) {
			
			//if(batsmens.equals("Gill")) {
				//batsmens.remove(batsMen);
			//}
		     //System.out.println(batsMen);
	}
	//}
}
