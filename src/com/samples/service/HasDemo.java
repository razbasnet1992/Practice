package com.samples.service;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class HasDemo{
	public static void main(String [] args) {
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("Raj", 100);
		map.put("Basnet", 200);
		map.put("Sworaj", 300);
		
		for(Map.Entry<String,Integer> m :map.entrySet()) {
			System.out.print("Key:"+ m.getKey());
			System.out.println(", Value :" +m.getValue());
			
		Set set = map.entrySet();
		set.remove("Raj");
	
			
		}
		
		if(map.containsKey("Raj")) {
			System.out.println("Value is " +map.get("Raj"));
		}
			
			else {
			System.out.println("coudnt find the key");
		}
			
			
		}	
		
}