package com.satya.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


// note  
//  when  we are  using checked exception using throws key word   , we have to use try catch  or throws keyword during  calling of this function  

public class ExceptionTest {

	
	
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.divide(10, 10);
	}
}

class Parent  {
	
		Parent() {
			System.out.println("This is parent class");
		}
	
	void  divide(int a  ,  int b )  // throws  IOException
	{
		   
			   int c  =   a /b  ;
			   
			    FileReader file;
			    
			    /*
			     file = new FileReader("C:\\test\\a.txt");
				 BufferedReader fileInput = new BufferedReader(file); 
		         fileInput.close(); 
			     */
			    
		             try {
				  file = new FileReader("C:\\test\\a.txt");
				 BufferedReader fileInput = new BufferedReader(file); 
		         fileInput.close(); 
			 } catch (IOException e1) {
			
				e1.printStackTrace();
			} 
		        
			   System.out.println(" This is  "+  c);
		
			
		
	}
	
	
}

class  Child  extends  Parent {
	Child() {
		System.out.println("This is child class");
	}
	
	@Override
	void  divide(int a  ,  int b ) {
		
	}
	
	
}


class  Another  {
	public void test() {
		Parent p = new Parent();
		p.divide(10, 10);
	}
}

