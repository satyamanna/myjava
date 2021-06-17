package com.satya.genericPrac;

public class TestGenericClassWithType {

	// if we are using T instead of Object in generic class , we do not have to do type conversion explicitly during compile time so it will leads to clean code 
	
	public static void main(String[] args) {
		testInteger();
		testString();
	}
	
	public static void testInteger(){
		GenericClassWithType<Integer> genericClassObj = new GenericClassWithType<Integer>() ;
		genericClassObj.add(10);
		Integer a = genericClassObj.get() ;
		System.out.println("This from testInteger"+a);
		
	}
	public static void testString() {
		GenericClassWithType<String> genericClassObj = new GenericClassWithType<String>() ;
		genericClassObj.add("satya");
		String st  =  genericClassObj.get() ;
		System.out.println("This from testString"+st);
	}
}
