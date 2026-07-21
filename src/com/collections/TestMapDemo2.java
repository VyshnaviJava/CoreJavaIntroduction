package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TestMapDemo2 {

	public static void main(String[] args) {
		
		Map<String,String> m =new HashMap<>();
		
		m.put("AP","Andhrapradesh");
		m.put("TG","Hyderabad");
		m.put("TG","telangana");
		
		m.put("KA","banglore");
		m.put("Ka","Karnataka");
		
		m.put("TN","madras");
		m.put("TN","Tamilnadu");
		
		m.put("KL","Thiruvanthapuram");
		
		
		System.out.println(m);
		
		System.out.println(m.containsKey("TN"));
		System.out.println(m.containsValue("banglore"));
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		Set<Entry<String,String>>entries = m.entrySet();
		for(Entry<String,String>entry : entries) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
		

	}

}
