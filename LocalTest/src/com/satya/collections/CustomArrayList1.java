package com.satya.collections;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayList1<E> {

	
	private int DEFAULT_CAPACITY= 20;
	private Object[] element= new Object[DEFAULT_CAPACITY];
	private int size =0 ;
	private static int i=0;
	
	public CustomArrayList1(){
		
	}
	
	public Iterator getIterator() {
		return new Iterate();
	}
	
	public void add(E e) {
		  if(element.length == (size)) {
			  // increase size 
			  increaseSize(element);
		  }
		  element[size++]=  e;
	}
	
	
	private void increaseSize(Object [] element) {
		
		int newSize= DEFAULT_CAPACITY * 2;
		this.element =  Arrays.copyOf(element, newSize);
		
	}
		
	public E get(int index) {
		if(element.length!=0) {
			if(index >  element.length) throw new ArrayIndexOutOfBoundsException();
			else return (E)element[index];
		}
		else{
			return (E) "Sorry No element found";
		}
	}
	
	
	private int getSize() {
		int count = 0; 
		for (Object ob :  element) {
			if(ob instanceof Object) ++count;
		}
		System.out.println(count);
		return count;
	}
	
	@SuppressWarnings("rawtypes")
	private class Iterate implements Iterator{
		private int listSize =  getSize();
		private int cursor =  i + 1;
		@Override
		public boolean hasNext() {
			if(cursor<=listSize ) return true ;
			else return false;
		}

		@Override
		public Object next() {
			Object ob=element[i++];
			cursor = i + 1;
			return ob;
		}
		
	}
}
