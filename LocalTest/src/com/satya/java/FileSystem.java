package com.satya.java;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileSystem {

	
	public static void main(final String[] args) {
		
		try{
			File file=new File("ReadMe.txt");
			FileInputStream fileInput=new FileInputStream(file);
			int  i=0;
			
			/*Before  file write */
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< BEFORE FILE IS APPENED>>>>>>>>>>>>>>>>>>>>>>>>>>");
			while (  (i =fileInput.read()) != -1){
				System.out.print( (char)(i));
			}
			fileInput.close();
			FileOutputStream fileOutPut=new FileOutputStream(file,true);
			String  addTect="This  is additional Text ";
			byte[] whatToWrite=addTect.getBytes();
			fileOutPut.write(whatToWrite);
			fileOutPut.close();
			
			System.out.println("");
			/* After  file write*/ 
			
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< AFTER FILE IS APPENED>>>>>>>>>>>>>>>>>>>>>>>>>>");
			fileInput=new FileInputStream(file);
			i=0;
			while (  (i =fileInput.read()) != -1){
				System.out.print( (char)(i));
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		catch(final Exception e){
			
		}
		
	}
	
	
}
