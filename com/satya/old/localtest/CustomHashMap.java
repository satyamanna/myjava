package com.satya.old.localtest;

import java.util.Map;


public class CustomHashMap<K,V> {

	int default_size   =  0    ; 
	Entry<K,V>[]  table ; 
	@SuppressWarnings("unchecked")
	public  CustomHashMap() {
		 default_size =  16 ; 
		 table = new  Entry[default_size] ; 
		}
	
		public void put(K key,V value) {
			int  getIndex  =   indexFor(hash(key.hashCode()), default_size); 
			//System.out.println(" === key for  "+key+"== Value ==  "+value +" == index of "+ getIndex);
			if(table.length == 0 )
			table[getIndex] =  new Entry<K,V>(key,value ,null);
			else {
				// if there is value  
				
				
				//  if index same  for key and value  
				if(table[getIndex] !=null ) {
					
					Entry<K,V> previousEntry= table[getIndex];  
					if(key.equals(previousEntry.key))
						table[getIndex] =  new Entry<K,V>(key,value ,null);
					else
					     previousEntry.setNextEntry(key, value);
					
				}
				else 
					table[getIndex] =  new Entry<K,V>(key,value ,null);
			}
			
		}
	
	
		static int hash(int h) {
		 	h ^= (h >>> 20) ^ (h >>> 12);
	        return h ^ (h >>> 7) ^ (h >>> 4);

	    }

	  static int indexFor(int h, int length) {
	 		return h & (length-1);

	    }
	
	 	public V getValue(K key) {
	 		int  getIndex  =   indexFor(hash(key.hashCode()), default_size); 
	 		return (table[getIndex] !=null)? table[getIndex].getValue() : null ;  
		/*
		 * if(table[getIndex] !=null) return table[getIndex].getValue() ; else return
		 * null;
		 */
	 	}
	 	
		
	static class  Entry<K,V> implements Map.Entry<K, V>{
       private K key ;
       private V value ;
       private Entry<K,V> entry  ; 
       
       public Entry(K key, V value, Entry<K, V> entry) {
		super();
		this.key = key;
		this.value = value;
		this.entry = entry;
	}
       public void setNextEntry(K key ,V value) {
    	   this.entry =  new Entry<K,V>(key,value,null) ;
       }
		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}

		@Override
		public V getValue() {
			// TODO Auto-generated method stub
			return this.value;
		}

		@Override
		public V setValue(V value) {
			// TODO Auto-generated method stub
			this.value = value ; 
			return this.value;
		}
		
		@Override
			public boolean equals(Object obj) {
				if(obj ==null  ||  obj instanceof CustomHashMap.Entry<?,?>) {
					return false   ;
				}
				else  {
					Entry< K, V> entry  =(Entry<K, V>) obj ;
					if(entry.getKey().equals(this.key) && entry.getValue().equals(this.value)) 
						return true ;
				}
				return false ;
			}
		@Override
			public int hashCode() {
				
			return (key==null   ? 0 : key.hashCode()) ^ (value==null ? 0 : value.hashCode());
			}
		
		
		
		
	}
	 
	
	
}
