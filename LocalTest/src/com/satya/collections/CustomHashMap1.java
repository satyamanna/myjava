package com.satya.collections;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class CustomHashMap1<K,V> {

	
	Entry<K,V>[]  bucket ;
	transient static int DEFAULT_SIZE = 16 ;
	
	public CustomHashMap1(){
		bucket =  new Entry[DEFAULT_SIZE];
	}
	
	
	public void put(K key , V value ) {
		
		
		// getting index of the bucket 
		int index =  this.generateIndex(key);
		
		//  inserting into  Entry arrays
		
		 
		if (bucket[index]==null) {
			bucket[index]= new Entry<>(key, value, null);
		}
		// index is same  bc of generating same hashcode value for different key
		else {
			// to be continue 
			Entry<K, V> current =   bucket[index];
			Entry<K,V>  insertedValue  = new Entry<>(key, value, null);; 
			if(current.next == null)
			current.next= insertedValue;
			else {
				Entry<K, V> lastEntry=  current.next; 
				lastEntry.next= insertedValue;
			}
	    }
		
		
		
	}
	
	
	public Entry<K,V> get(K key ) {
		
		Entry<K,V> result= null ;
		
		if(bucket != null && bucket.length != 0) {
			int index=  this.generateIndex(key);
			if (null!= bucket[index]  && bucket[index].key.equals(key))
				result =  bucket[index];
			else {
				Entry<K,V> temp  =  bucket[index] ;
				while (temp != null )
					if (this.hasNext(temp)) {
					   result =  this.next(temp);
					   if(result.key.equals(key)) { result =  bucket[index] ; break ;}
					   else  temp= this.next(temp).next;
				   }
					else temp  = null ; 
				}
			}
			
		
		return result ; 
	}
	private int generateHasCode(K key) {
		return (31 +  key.hashCode());
	}
	
	
	@SuppressWarnings("unused")
	private int generateIndex(K key) {
		return ( this.generateHasCode( key) % DEFAULT_SIZE ); 
	}
	
	
	static class  Entry<K,V>{
	     K key ;
	     V value ;
	     Entry<K,V> next ;
		public Entry(K key, V value, Entry<K, V> next) {
			super();
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
		
		
		
	     
	  }
	
	
		
	
			public boolean hasNext(Entry<K,V> entry) {
				boolean flag = false ; 
				if( entry.next != null ) flag=  true;
				return flag;
			}
			
			public Entry<K, V> next(Entry<K,V> entry) {
				return entry.next;
			}
			
			
	
	
	
	
}
