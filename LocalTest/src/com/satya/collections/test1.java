package com.satya.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class test1 {

		public static void main(String[] args) 
				throws CloneNotSupportedException {
			Bean ob=new Bean();
			ob.setA("abcd");
			ob.setB("abcd1");
			Bean ob1=new Bean();
			ob1.setA("efgh");
			ob1.setB("efgh1");
			List<Bean> list=new ArrayList<Bean>();
			list.add(ob);
			list.add(ob1);
			List<Bean> list1=new ArrayList<Bean>();
			//list1.addAll(list);
			for(Bean obhj : list){
				Bean gg= (Bean) obhj.clone();
				gg.setA("kkkkkkk");
				list1.add(gg);
				
			}
			list1.remove(0);
			for(Bean obhj : list){
				System.out.println(obhj.getA() +"++---++" + obhj.getB());
			}
			for(Bean obhj : list1){
				System.out.println(obhj.getA() +"++---++" + obhj.getB());
			}
			
			
			
			
			
			
		}

	
	
}

class Bean implements Cloneable {
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	private String a;  private String b ;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}