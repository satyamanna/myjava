package com.satya.InnerClass;

public class StaticInnerClass {
	static int data=30;  
	static class Inner{
		Inner(){
			 System.out.println("data is "+data);  
		}
		
	}
	
	
	public static void main(String[] args) {
		StaticInnerClass.Inner ob =new StaticInnerClass.Inner();
	}
	
	
}
