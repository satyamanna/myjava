package com.satya.java;
import java.io.FileInputStream;
 public class FileInputStreamTest {

	public static void main(String argv[]){
		try{
		@SuppressWarnings("resource")
		FileInputStream fileInputStream=new FileInputStream("ReadMe.txt");
		int data=fileInputStream.read();
		System.out.println(data);
		while(data!=-1){
			System.out.print((char)data);
			data=fileInputStream.read();
		}
		}
		catch(Exception E){
			E.printStackTrace();
		}
	}
	
}
