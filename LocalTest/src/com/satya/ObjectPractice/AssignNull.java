package com.satya.ObjectPractice;

//  This is null assignment to string , object etc .  
// test case 1 -> only we have method with string and object and we pass null from calling method , 
// it will call  string because Object is the mother class of all  classes when JVM searches for particular method , 
// it founds String is quite obvious class for null not the Object class and in hierarchy it is nearest class than Object ,
// if we use Integer instead of String , 
// the result will be same <--  test case 1 end 

//  test case 2 >>  if we create method Integer as well as String it will  throw ambiguous compilation error because 
// it can not find which one is suitable for null value String or Integer both comes first before  Object class <--  test case 2 end 

public class AssignNull {

	public static void main(String[] args) {
		AssignNull ob = new AssignNull() ;
		ob.assignNull(null); 

	}
	
//	void assignNull(String ob) {
//		System.out.println("Assign NUll in String");
//	}
	void assignNull(Object ob) {
		System.out.println("Assign NUll in Object");
	}
	void assignNull(Integer ob) {
		System.out.println("Assign NUll in Integer");
	}

}
