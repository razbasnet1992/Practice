package com.samples.base;

public class Pass {

    public static void main(String[] args) 
    { 
        int marks = 30; 
        String result = marks > 60 ? "Pass with 1st div.":
        			   marks < 60 && marks >40 ? "Pass with 2nd div.":
        			   "Pass with 3rd division";
        			   		
                        
                        	
       System.out.println(result); 
    } 
} 