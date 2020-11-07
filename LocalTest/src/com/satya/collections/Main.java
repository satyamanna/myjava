package com.satya.collections;

public class Main {

	  public static void main(String[] args) {
		CustomHashMap<String, String> map = new CustomHashMap<String, String>(); 
		 map.put("abcfd", "ahdjhdjashdjhdas");
		 map.put("abcfd12344", "ahdjhdjashdjhda121212s");
		// System.out.println(  "------ "+map.get("abcfd").value);
		 System.out.println(  "------ "+map.get("abcfd12344").value);
	}
}
