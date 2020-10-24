package com.satya.java;

public class ChildClass extends ParentClass{

	@Override
	public void A(){
		System.out.println("This is Child class");
	}
	public void B(){
		System.out.println("This is Child class");
	}
	
	public static void main(String argv[]){
		ParentClass p=new ChildClass();
		((ChildClass) p).B();
	}
	
	
	
}
