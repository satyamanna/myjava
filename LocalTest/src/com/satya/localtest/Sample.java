package com.satya.localtest;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	public static void main(String args[]) { 
	    /*String s1 = "abc";
	    String s2 = new String("abc");

	    if(s1 == s2.intern())
	        System.out.println(1);
	    else
	        System.out.println(2);
	    if(s1.equals(s2))
	        System.out.println(3);
	    else
	        System.out.println(4);
	    }*/
		
		//System.out.println(Math.abs(-90.1798 - 29.7826));
		/*
		 * Map<String,String> map = new HashMap<String, String>() ; map.put(null,
		 * "asasa"); map.put(null, "asasa1234"); System.out.println(map.get(null));
		 */
		
		CustomHashMap<String, String> map = new CustomHashMap<String, String>() ;
		map.put("1", "lisa");
		map.put("1", "lisa1");
		map.put("2", "lisa11");
		System.out.println(map.getValue("2"));
		
		
	}
		
}
