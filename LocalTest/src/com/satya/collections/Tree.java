package com.satya.collections;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		
		
		Set<Pojo> set=new TreeSet<Pojo>();
		//set.add(null);
		Pojo pojo=new Pojo();
		Pojo pojo1=new Pojo();
		pojo.setName("satyajit");
		pojo.setRoll("1234");
		
		pojo1.setName("satyajit123");
		pojo1.setRoll("1234456");
		
		
		set.add(pojo);
		set.add(pojo1);
		System.out.println(set);
		
		Map  map =new TreeMap();
		map.put("123", "abcd");
		
		
		
		
		Map  map1 =new TreeMap();
		map1.put("sae","1234");
		map1.put(new Integer(0),"1234");
		
		System.out.println(set);
		
		
	}
	
	
	
}

class Pojo{
	private String name;
	private String roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	
	
	
	
}
