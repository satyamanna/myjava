package com.satya.designpattern.adaptor;

import java.lang.reflect.Method;

public class Adaptor implements Plug{
	Class<?> targetclassName=null;
	Class<?> sourceclassName=null;
	String methodName =null;

	public Adaptor(Class<?> targetclassName, String methodName,Class<?> sourceclassName) {
		this.targetclassName=targetclassName;
		this.methodName=methodName;
		this.sourceclassName=sourceclassName;
		
	}
	
	@Override
	public void charge() {
		try{
			@SuppressWarnings("unchecked")
			Method method=targetclassName.getMethod(methodName, String.class);
			method.invoke(targetclassName.newInstance(),sourceclassName.getName());
		}
		catch(final Exception e){
			//System.out.println(e.getMessage());
			//e.getMessage();
		}
		//className.newInstance().charge(p);
        	
        }

	
}
