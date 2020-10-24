package com.satya.designpattern.factory;

public class Main {
			public static void main(String[] args) {
				if(args[0].equalsIgnoreCase("CLASSA")){
					ClassDescription ob =new ClassA();
					ob.getclass();
				}
				if(args[0].equalsIgnoreCase("CLASSB")){
					ClassDescription ob =new ClassB();
					ob.getclass();
				}
			}
}
