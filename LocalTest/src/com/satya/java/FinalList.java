package com.satya.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FinalList {
public static void main(String argv[]){
	final List<String> ob=new ArrayList<String>();
	// ob=new ArrayList<String>(); we can not do with it
	ob.add("satyajit");
	ob.add("Ayan");
	System.out.println(ob);
	
	final Map<String,String> mp=new HashMap<String,String>();
	mp.put("1", null);
	mp.put("1", null);
	
	
}
}
