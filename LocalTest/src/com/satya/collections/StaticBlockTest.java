package com.satya.collections;

public class StaticBlockTest {

	static{
		int i =10 ;
	}
	{
		System.out.println("this is astyajie123");
	}
	class  StaticBlockTestInner{
		
		{
			System.out.println("this is astyajieInner123");
		}
	}
	
	public static void main(String[] args) {
		StaticBlockTest ob = new StaticBlockTest();
		
	}
	
}
