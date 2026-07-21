package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Collection<String> bowlers = new ArrayList<>();
		bowlers.add("bhumrah");
		bowlers.add("siraj");
		bowlers.add("bhuvi");
		bowlers.add("harshadeep");
		bowlers.add("aswin");
		bowlers.add("kuldeep");
		System.out.println(bowlers);
		
		Collection<String> batsmens = new ArrayList<>();
		batsmens.add("virat");
		batsmens.add("rohith");
		batsmens.add("iyer");
		batsmens.add("dhoni");
		batsmens.add("rahul");
		System.out.println(batsmens);
		
		Collection<String> Indianteam = new ArrayList<>();
		Indianteam.addAll(bowlers);
		Indianteam.addAll(batsmens);
		
		bowlers.clear();
		
		
		System.out.println(bowlers);
		System.out.println(Indianteam);
		
		System.out.println(batsmens.contains("vyshu"));
		System.out.println(batsmens.contains("virat"));
		
		Collection<String> allrounders = new ArrayList<>();
		allrounders.add("jadeja");
		allrounders.add("Srikanth");
		
		System.out.println(Indianteam.containsAll(bowlers));
		System.out.println(Indianteam.containsAll(bowlers));
		
		//Indianteam.clear();
		if(!Indianteam.isEmpty()) {
			System.out.println("Welcome to indian team all the best");
		}
		
		System.out.println(allrounders);
		System.out.println(batsmens);
		System.out.println(bowlers);
		System.out.println("**********************");
		
		System.out.println(batsmens.remove("Dhoni"));
		
		System.out.println(batsmens);
		
		Indianteam.addAll(allrounders);
		System.out.println(Indianteam);
		
		Indianteam.removeAll(allrounders);
		
		System.out.println(Indianteam);
	}

}
