package com.satya.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCustomArrayList {

	
	 public static void main(String[] args) {
		CustomArrayList ob =new CustomArrayList();
		ob.add("Satya");
		ob.add("Satya123");
		ob.add("Satya1234");
		ob.add("Satya");
		ob.add("Satya123");
		ob.add("Satya1234");
		ob.add("Satya");
		ob.add("Satya123");
		ob.add("Satya1234");
		ob.add("Satya");
		ob.add("Satya123");
		ob.add("Satya1234");
		@SuppressWarnings("rawtypes")
		Iterator it = ob.getIterator();
		while(it.hasNext()) {
			System.out.println("This is iterator :: "+it.next());
		}
	}
}
