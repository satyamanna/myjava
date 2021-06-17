package com.satya.java8.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FI_as_params {

	
	public static void main(String[] args) {
		FI_as_params fip = new FI_as_params() ;
		System.out.println(fip.method2( value -> fip.method1(value)) );
		List<UserPojo> list = new ArrayList<UserPojo>() ;
		LocalDate dt = LocalDate.of(2020, 8, 01) ;
		System.out.println(dt.getDayOfWeek().toString());
		for(UserPojo user : list) {
			
		}
		// using lamda 
		list.forEach(user-> {
			System.out.println(user.getName());
		});
		
	}
	
	public String method1(String st) {
		String name ="Satyajit";
		return st+" "+name;
	}
	public <R> R method2(Function<String, R> function) {
	 return	function.apply("Hello") ;
	}
}



