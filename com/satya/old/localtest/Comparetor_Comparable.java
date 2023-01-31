package com.satya.old.localtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparetor_Comparable {

	
	
	 /*amy 100
	david 100
	heraldo 50
	aakansha 75
	aleksa 150

	Sample Output

	aleksa 150
	amy 100
	david 100
	aakansha 75
	heraldo 50
	*/

	
	public static void main(String[] args) {
		List<MyBean> list  = new ArrayList<MyBean>();
		list.add(new MyBean("amy",100));
		list.add(new MyBean("david",100));
		list.add(new MyBean("heraldo",50));
		list.add(new MyBean("aakansha",75));
		list.add(new MyBean("aleksa",150));
		
		// list.sort(new NameComparator());
		list.sort(new NameComparator());
		// list.sort(new ScoreComparator());
		 
		 
		
		
		
		  for(MyBean a : list) { System.out.println(a.getName() + " " +a.getscore()); }
		 
		
		
		/*
		 * List<MyBean1> list1 = new ArrayList<MyBean1>() ; list1.add(new
		 * MyBean1("ayan","park-street")); list1.add(new MyBean1("aiikat","purulia"));
		 * Collections.sort(list1); for(MyBean1 a : list1) {
		 * System.out.println(a.getName()); }
		 */
		
		
	}
	
	
	
}






class MyBean{
	
	private String name ;
	private int score ;
	public MyBean(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getscore() {
		return score;
	}
	public void setscore(int score) {
		this.score = score;
	} 
	
	
	
	
}



class MyBean1 implements  Comparable<MyBean1>{
	
	private String name ;
	private String score ;
	public MyBean1(String name, String score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getscore() {
		return score;
	}
	public void setscore(String score) {
		this.score = score;
	}
	@Override
	public int compareTo(MyBean1 o) {
		// TODO Auto-generated method stub
		if(this.getName().compareTo(o.getName()) >   0) return  1 ;
		if(this.getName().compareTo(o.getName()) <  0) return -1;
		else  
		return 0;
	} 
	
	
	
	
}






class  NameComparator  implements Comparator<MyBean> {

	@Override
	public int compare(MyBean o1, MyBean o2) {
		if(o1.getName().compareTo(o2.getName()) > 0) {
			if(o1.getscore() - o2.getscore() < 0){
				return  1 ;
			}
			if(o1.getscore() - o2.getscore()>0){
				return  -1 ;
			}
			else {
				return  0 ;
			}
			
		}
		if(o1.getName().compareTo(o2.getName()) < 0) {
			if(o1.getscore() - o2.getscore() < 0){
				return  1 ;
			}
			if(o1.getscore() - o2.getscore()>0){
				return  -1 ;
			}
			else {
				return  0 ;
			}
		}
		else return 0; 
	}
	
}

class  ScoreComparator  implements Comparator<MyBean> {

	@Override
	public int compare(MyBean o1, MyBean o2) {
		if((o1.getscore() - o2.getscore()) < 0 && o1.getName().compareTo(o2.getName()) > 0 ) return 1 ;
		if((o1.getscore() - o2.getscore()) > 0 && o1.getName().compareTo(o2.getName()) < 0) return -1 ;
		else return 0; 
	}
	
}


