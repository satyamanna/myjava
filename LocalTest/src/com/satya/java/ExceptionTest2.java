package com.satya.java;

import com.sun.java_cup.internal.runtime.Symbol;

public class ExceptionTest2 {
		 public static void main(String argv[]){
			 try{
				 System.out.println("This is method");
				 int a=10/0;
				 System.out.println("sasa"+a);
			 }
			 catch(ArithmeticException e){
				 System.out.println("First Exception"+e.getMessage());
				// e.getStackTrace();
			 }
			 catch(Exception e){
				 System.out.println("Second Exception"+e.getMessage());
				// e.getStackTrace();
			 }
			 
			 
		 }
}
