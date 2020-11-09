package com.satya.java8.practice;

public class CustomFunctionInterface {

	public static void main(String[] args) {

		//  creating object  
		
		CustomFunctionalInterface obj  =   (x,y) ->  {
			return x + y  ; 
			
			} ; 
		
		
			  
		//  calling the method  
		obj.sum(10, 20) ;
  		
	}

}

//  this is  custom functional interface which is defined as containing only  one abstract method
interface  CustomFunctionalInterface{
	
	 int  sum  (int x,int  y) ;
	
	
}