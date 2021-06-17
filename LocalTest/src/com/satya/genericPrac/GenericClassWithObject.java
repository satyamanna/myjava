package com.satya.genericPrac;

public class GenericClassWithObject<Object> {

	
	Object obj  ;
	void add(Object obj ) {
		this.obj =obj ;
	}
	Object get() {
		return this.obj ;
	}
}
