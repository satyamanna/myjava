package com.satya.exception.superclassrelated;

import java.io.FileNotFoundException;
import java.io.IOException;

//  if super class throws  any checked exception  
//  the child class can throw no exception , uncheck exception , same exception but not its parent exception 
//  
public class SubClassExceptionTest1 {

	public static void main(String[] args) {
	 // some code here 

	}
	
	

}


class A1  {
	
	//  throwing  the file not found exception  
	void add() throws  FileNotFoundException{
		System.out.println("------");
	}
}

class B1 extends  A1  {
	
	//  cannot throw it's parent exception  
	@Override
	void add() throws IOException{
		
	}
}