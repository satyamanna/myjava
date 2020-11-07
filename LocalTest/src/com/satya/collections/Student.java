package com.satya.collections;

public class Student {

	
	
	private String name ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	private int roll ;
	
	
	
   @Override
public boolean equals(Object obj) {
	    boolean flag =  false  ; 
	    Student st= (Student) obj ; 
	    if(st.getName().equals(this.getName()) && st.getRoll()== this.getRoll() ) flag =  true ; 
	    return flag;
}
   
	
   
   
   
}
