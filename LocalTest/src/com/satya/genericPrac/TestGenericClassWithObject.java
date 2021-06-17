package com.satya.genericPrac;

public class TestGenericClassWithObject {

	//  if we are creating generic class with object params then we have to explicitly use type conversion for object
	//  note :  if we pass Object type like for example : GenericClassWithObject<integer> genericClassObj = new GenericClassWithObject<integer>() ;during initiazation we done have to do type conversion 
	
	public static void main(String[] args) {
		testInteger();
		testString();
	}
	
	public static void testInteger(){
		GenericClassWithObject<Object> genericClassObj = new GenericClassWithObject<Object>() ;
		genericClassObj.add(10);
		Integer a =(Integer) genericClassObj.get() ;
		System.out.println("This from testInteger"+a);
	}
	public static void testString() {
		GenericClassWithObject<Object> genericClassObj = new GenericClassWithObject<Object>() ;
		genericClassObj.add("satya");
		String st = (String) genericClassObj.get() ;
		System.out.println("This from testInteger"+genericClassObj.get());
	}
}
