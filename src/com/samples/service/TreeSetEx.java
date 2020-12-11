package com.samples.service;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		Integer[] a = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23 };
		
		List<Integer> list = Arrays.asList(a);
		Set<Integer> set = new TreeSet<Integer>(list);
		System.out.println("Printing Sorted List ..." +set);
	}
}
