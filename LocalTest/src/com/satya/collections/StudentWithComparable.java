package com.satya.collections;

public class StudentWithComparable implements Comparable<StudentWithComparable>{
	private String name  ; 
	private int  roll ;
	
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

	@Override
	public int compareTo(StudentWithComparable o) {
		int flag = 0 ; 
		if( this.roll> o.getRoll()) flag = 1 ;
		if( this.roll< o.getRoll()) flag = -1 ;
		return flag;
	}

	
	
	
	
}
