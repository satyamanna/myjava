package com.satya.InnerClass;

public class LocalInnerClass {

	
	public void  method(){
		class Inner {
			public Inner(){
				System.out.println("This is local inner class");
			}
		}
		
		Inner  ob =new Inner();
	}
	
	
	public static void main(String[] args) {
		LocalInnerClass ob=new LocalInnerClass();
		ob.method();
	}
	
	
}
