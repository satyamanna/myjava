package com.satya.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test7 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		//System.out.println(list.size());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		List<Integer> list1=new ArrayList<>();
		list1.add(3);
		list1.add(4);
		List<Integer> list3=new ArrayList<>();
		list3.addAll(list);
		list3.addAll(list1);
		for (Integer i : list3 ){
			for (Integer i1 : list1 ){
				if(i.equals(i1)){
					list.remove(i1);
				}
			}
		}
			
		//System.out.println(list);
		
		
		List<String> list4=new ArrayList<>();
		list4.add("a");
		list4.add(0,"b");
		System.out.println(list4);
		
		
		
		
	}
	
}
