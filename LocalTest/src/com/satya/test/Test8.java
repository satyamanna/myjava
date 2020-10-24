package com.satya.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test8 {
	 public static void main(String[] args) {
	 String[] declaration = { "I", "Came", "I", "Saw", "I", "Left" };
	 Map<String, Integer> firstIndex = new HashMap<>();
	 for (int i = declaration.length - 1; i >= 0; i--)
	 firstIndex.put(declaration[i], i);
	 int inMap = 0;
	 for (String word : declaration)
	 if (firstIndex.con)
	 inMap++;
	 System.out.println(inMap);
	 }
	}
