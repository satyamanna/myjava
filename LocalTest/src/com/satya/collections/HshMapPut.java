package com.satya.collections;

import java.util.HashMap;
import java.util.Map;

public class HshMapPut {
			public static void main(String[] args) {
						
				Map<String,String> map=new HashMap<String,String>();
			    System.out.println(map.put("a", "amit"));
			    System.out.println(map.put("b", "amit1"));
			    System.out.println(map.put("a", "amit"));// this is the main technique of hashmap .. and it is followed by hashset  
				
				
				
				
			}
}
