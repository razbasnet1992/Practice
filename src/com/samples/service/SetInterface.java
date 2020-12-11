package com.samples.service;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		
		//Hashset example
		Set<Integer> hashset = new HashSet<Integer>();
		hashset.add(10);
		hashset.add(3);
		hashset.add(4);
		hashset.add(0);
		hashset.add(0);

		
		//System.out.println(hashset);
		
		
		//Linkedhashset example
		Set<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("salu");
		linkedset.add("raj");
		linkedset.add("Sworaj");
		linkedset.add("Sworaj");
		linkedset.add("null");;
		linkedset.remove("Sworaj");
		linkedset.isEmpty();
		System.out.println(linkedset);
		
		//treeset example
		
		Set<Integer> treeset = new TreeSet<Integer>();
		treeset.add(4);
		treeset.add(7);
		treeset.add(8);
		treeset.add(2);
		treeset.add(0);
		treeset.add(0);
		
		System.out.println(treeset);
		
		
		
		
		
		
	}

}
