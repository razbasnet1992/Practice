package com.samples.service;

import java.time.Period;

public class ParseMethod {
	public static void main(String args[]) {
		
		String str = "P1992Y04M28D";
		Period p = Period.parse(str);
		System.out.println(p.getYears()+" Year\n" +p.getMonths()+" Month\n"+p.getDays()+" Days");
	}

}
