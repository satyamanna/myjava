package com.satya.localtest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_Test {

	
	
	
	 public static void main(String[] args) {
		String[] arr  = {"1","2","1","5","6","5"};
		Map<String,Integer> map= new HashMap<String, Integer>(); 
		//  first process 
		map.put(arr[0], new Integer(1)) ;
		for(String a  : arr ) { 
			if(map.containsKey(a)) {
				
				map.put(a, map.get(a) + new Integer(1)) ;
			}
			else {
				map.put(a, new Integer(1)) ;
			}
			
		}
		
		// second process 
		
		Set<String> set = new  HashSet<String>();
		System.out.println("Duplicates are:::");
		for(String a :  arr) {
			if(!set.add(a) ) {
				System.out.println(a);
			}
			else {
				set.add(a) ;
			}
		}
		
		
	}
}
