package com.satya.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Comparator1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("efgh");
		list.add("abcd");
		list.add("ijkl");
		list.remove(0);
		
		@SuppressWarnings("rawtypes")
		Comparator	ob =new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				return (int)o1.toString().compareTo((String) o2.toString());
			}
		};
		Collections.sort(list,ob);
		System.out.println(list);
	}
	
}
