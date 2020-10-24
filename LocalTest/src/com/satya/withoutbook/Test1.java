package com.satya.withoutbook;




/**
 * @author satyajit
 *
 * this is for return type for in try block look main method's return type is void so if we write only "return" then it 
 *  will not cause any problems because only "return" returns void  
 *  look string abc .. if we write return method in try block then it will throw error
 *  
 *
 */
public class Test1 {

	
	public static void main(String[] args) 
	{
		
	try 
	{ 
	return; 
	} 
	finally 
	{
	System.out.println( "Finally" ); 
	} 
	} 
	
	public String abcd(){
		try{
			return null;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
}
