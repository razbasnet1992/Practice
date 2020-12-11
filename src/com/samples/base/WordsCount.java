package com.samples.base;

import java.util.*;
import java.util.StringTokenizer;

public class WordsCount {
	public static void main(String[] args) {
		String s = " ";
		String s1 = " ";
		List l = new ArrayList();
		int length = wordsCountString(s1);
		System.out.println("Using stringtoken "+length);
		
		System.out.println("Using words split "+ wordsSplit(s1));
		
	}

	public static int wordsCountString(String sentence) {
		if(sentence==null || sentence.isEmpty()) {
			return 0;
		}
		StringTokenizer tokens = new StringTokenizer(sentence);
		return tokens.countTokens();
	}
	public static int wordsSplit(String input) {
		if(input==null || input.isEmpty()) {
			return 0;
	}
		String[] words = input.split("\\s+");
		return words.length;
		
	}
}
