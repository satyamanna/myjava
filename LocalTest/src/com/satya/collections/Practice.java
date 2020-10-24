package com.satya.collections;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		
		Map<String,String > map=new HashMap<String,String>();
		map.put(new String("abcd"), "satyajit");
		System.out.println(   map.get(new String("abcd"))   );
		
		
		
	}
}
