package com.samples.service;

	 interface Calculate  
	{  
	    abstract int multiply(int a, int b);  
	}  
	   
	public class TestingAbstract  
	{  
	    public static void main(String[] args)  
	    {  
	        int result = new Calculate()  
	        {      
				 
	            public int multiply(int a, int b)  
	            {  
	                return a*b;  
	            }  
	        }.multiply(12,32);  
	        System.out.println("result = "+result);  
	    }  
	}  
