package com.satya.java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateFunctionCall {

	public static void main(String argv[]) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method m=Class.forName("com.satya.java.PrivateFunctionContent").getDeclaredMethod("display", null);
		m.setAccessible(true); // calls private method accessible
		m.invoke(new PrivateFunctionContent(), null);
		 
		
	}
	
}
