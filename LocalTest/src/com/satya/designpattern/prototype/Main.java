package com.satya.designpattern.prototype;



public class Main {

	public static void main(String[] args) {
		Bean bean =new Bean();
		bean.setStudentName("ARYA");
		bean.setClassName("FIVE");
		System.out.println("After "+bean.toString());
		Bean bean1=(Bean)bean.getprototyep();
		System.out.println("Before "+bean1.toString());
		
	}
	

	
	 
    
}
