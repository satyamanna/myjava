package com.satya.designpattern.singleton;

public class Typ2 {

	public static void main(String[] args) {
	  A.show();	
	}
	
	
}

class  A{
	static String st= null;;
	static void show(){
		System.out.println("before"+st);
		if(st==null) {
			st= "abcd";
		}
		System.out.println("after"+st);
	}
	
}