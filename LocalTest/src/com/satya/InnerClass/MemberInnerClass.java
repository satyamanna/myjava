package com.satya.InnerClass;

public class MemberInnerClass {

	
	
	class Inner {
		Inner(){
			System.out.println("This is memeber Inner Class");
		}
	}
	
	
	public static void main(String[] args) {
		MemberInnerClass ob=new MemberInnerClass();
		MemberInnerClass.Inner innerClass=ob.new Inner(); //  this is member inner class
		
		
	}
	
	
	
}
