package com.satya.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AccessClass{
    
	
	public static void main(String argv[]){
		try{
			Class className=Class.forName("com.satya.test.PrivateClass");
			Constructor[] c = className.getDeclaredConstructors();
			c[0].setAccessible(true);
			c[0].newInstance();
			
			Method mothod=className.getDeclaredMethod("abc1qq");
			//mothod.setAccessible(true);
			mothod.invoke(className.newInstance());
			
			
			
		}
		catch(Exception e){
				e.printStackTrace();
		}
		
	}
	
}
