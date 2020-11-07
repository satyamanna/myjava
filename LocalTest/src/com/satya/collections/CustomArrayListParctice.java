package com.satya.collections;

import java.util.Arrays;


public class CustomArrayListParctice<E> {

	
	transient  int  DEFAULT_SIZE= 16;
	transient int size=0;
	Object[] element =  null;
	
	
	public CustomArrayListParctice(){
		this.element= new Object[DEFAULT_SIZE];
	}
	
	
	
	public void add(E element) {
		
		if(this.element.length ==  size) {
			increaseSize();
		}
		else {
			this.element[size++] =element;
		}
	}
	
	public void increaseSize() {
		DEFAULT_SIZE= DEFAULT_SIZE * 2; 
		element = Arrays.copyOf(element, DEFAULT_SIZE);
		
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		if(this.element.length <  index) throw new ArrayIndexOutOfBoundsException();
		return (E) element[index];
	}
	
	
}

 