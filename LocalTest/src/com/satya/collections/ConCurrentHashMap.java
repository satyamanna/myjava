package com.satya.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMap {

	
	
	public static void main(String[] args) {
		
		
		Map<String,String>  conCurrent= new ConcurrentHashMap<>();
		conCurrent.put("1","staya1");
		conCurrent.put("2","staya");
		
		for (Map.Entry<String, String> st:  conCurrent.entrySet()) {
			System.out.println(st.getValue());
			conCurrent.put("3", "ssjdjsgsjdgsj");
		}
		
	}
	
}
