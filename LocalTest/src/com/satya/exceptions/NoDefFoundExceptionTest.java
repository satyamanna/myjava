package com.satya.exceptions;

public class NoDefFoundExceptionTest {

	public static void main(String[] args) {
		try{
		DemoClass demo  = new DemoClass();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

class  DemoClass{
	static {
		int a = 10 / 0 ;
		
	}
	DemoClass(){
		System.out.println("In this demo class");
	}
}
