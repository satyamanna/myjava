package com.satya.localtest;

public class Try_NoCatch {
	
	
	   public static void main(String[] args) {
		try  {
			int  a =   5 /0 ;
			System.out.println(a);
		}
		finally {
			System.out.println("finally block");
		}
	}

}
