package com.satya.emun;

 enum TestEnum {

	test1 ,
	test2 ;
	public static void test3(){
		System.out.println("This is test method in enumclass");
	}
	
}

 /**
 * @author satyajit
 *
 */

public class Test{
	
	 
	public static void main(String[] args) {
		//Test.test1
		
		for(TestEnum nn:  TestEnum.values()){
			System.out.println("Values in Enum"+nn);
		}
		TestEnum.test3();
		
	}
	 
}