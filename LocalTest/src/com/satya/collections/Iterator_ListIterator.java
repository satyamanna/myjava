package com.satya.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_ListIterator {

			public static void main(String[] args) throws Exception {
					
				List<String> list=new CustomArrayList<String>();
			/*	Field fields=list.getClass().getDeclaredField("DEFAULT_CAPACITY");
				fields.setAccessible(true);
				System.out.println("BEFORE  DEFAULT_CAPACITY :::: "+fields.get(list.getClass()));*/
				
				list.add("abcd");
				list.add("abcd123");
				list.add("abcd1234");
				/// ----
				list.add("abcd");
				list.add("abcd123");
				list.add("abcd1234");
				/// ----- 
				list.add("abcd");
				list.add("abcd123");
				list.add("abcd1234");
				/// ---- 
				list.add("abcd");
				list.add("abcd123");
				list.add("abcd1234");
				/// ---- 
				/// ---- 
			    list.add("abcd");
				list.add("abcd123");
				list.add("abcd1234");
				/// ---- 
				/// ---- 
				list.add("abcd");
				/*list.add("abcd123");
				list.add("abcd1234");
				/// ---- 
				
				/// ---- 
				list.add("abcd");
				list.add("abcd123");
				list.add("abcd1234");
				/// ---- 
				/// ---- 
				list.add("abcd");
				list.add("abcd123");
				list.add("abcd1234");*/
				/// ---- 
				//list.re//
				/*System.out.println("BEFORE  DEFAULT_CAPACITY :::: "+fields.get(list.getClass()));*/
				
				
				/*Iterator it=list.iterator();
				
				while(it.hasNext()){
					String t= (String) it.next();
					if(t.equals("abcd")){
					//it.remove(); // remove "abcd" string
				//	list.remove("abcd");
					//break;
					}
					//System.out.println(t); // 
				}*/
				
				///System.out.println(list);
				List<String> list1 = new ArrayList<String>() ;
				list1.add("ram") ;  
				list1.add("rahim") ;  
				ListIterator<String> lit=list1.listIterator();
				while(lit.hasNext()){
					
					//lit.add("efgh");
					System.out.println("-----------"+lit.next());
				}
				//System.out.println(list);
				while(lit.hasPrevious()){
					System.out.println("-----------"+lit.previous());
				}
				
				
				
			}
			
			


}
