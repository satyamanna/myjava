package com.satya.designpattern.adaptor;

import java.lang.reflect.Method;

public class DoCharge {
     public static void main(String[] args) throws Exception {
		Plug p = new Adaptor(Apple.class,"charge",Nokia.class);
		p.charge();
    	 
    	 /*Method method=Nokia.class.getMethod("charge", String.class);
		method.invoke(Nokia.class.newInstance(),"adasd");*/
		
		
	}
}
