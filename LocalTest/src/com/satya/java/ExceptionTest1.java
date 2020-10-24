package com.satya.java;

public class ExceptionTest1 {

	
	public static void main(String argv []){
		
		try{
			System.out.println("in Main");
		}
		catch(Exception E){
			System.out.println("in Exception");
		}
		finally {
			int a=10/0;
			System.out.println("In finally");
		}
		
	}
	
}
