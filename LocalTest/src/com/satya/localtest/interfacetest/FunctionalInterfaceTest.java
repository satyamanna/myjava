package com.satya.localtest.interfacetest;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		FunctionalInterface  ob  =  (int x,int y) -> {
			return x+y ; 
		} ;
		System.out.println(ob.add(5, 6));
		List<String> list  = new ArrayList<String>();
		list.add("first") ;
		list.add("second") ;
		list.forEach(gg   ->  {
			System.out.println(gg);
		});
		
	}
	
	
	
	
}

interface  FunctionalInterface {
	  int  add (int x, int y );
}