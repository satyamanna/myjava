package com.satya.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Enumeration_Iterator {

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abcd");
		list.add("abcdf");
		list.add("abcde");
		
		list.remove("abcd");
		
		///  // 
		System.out.println("##############Iterators###################");
		Iterator<String> it =  list.iterator() ;
		while(it.hasNext()){
			
			System.out.println(it.next());
			list.add("rtrrt");
		}
		
		System.out.println("##############Enumeration###################");
		// Enumeration //
		Enumeration<String> enu=Collections.enumeration(list); 
		
		while(enu.hasMoreElements()){
		  //  list.add("ffofofo");
			System.out.println(enu.nextElement());
		}
 		
		
	}
	 
}
