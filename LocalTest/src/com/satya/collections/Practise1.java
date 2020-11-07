package com.satya.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practise1 {

	 public static void main(String[] args) {
		
		 Set<String> treeSet = new TreeSet<String>();
		 treeSet.add("12");
		 treeSet.add("15");
		 System.out.println(((TreeSet<String>) treeSet).headSet("15").size());
		 
		 List<String> list = new ArrayList<>();
		 list.add("12");
		 list.add("13");
		
		 System.out.println(list.toArray()[0]);
		 for(String ss: list) {
			 
		 }
		 
		 
	}
}
