package com.satya.genericPrac;

public class GenericClassWithType<T> {

	
	T obj  ;
	void add(T obj ) {
		this.obj =obj ;
	}
	T get() {
		return this.obj ;
	}
}
