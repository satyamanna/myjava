package com.satya.object;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public  class User2 {

	private String name;
	private String roll;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		boolean flag =false; 
		if(obj==this) flag =true;
		if(null!=obj &&  obj.getClass()==this.getClass()) flag =true;
		if(null!=obj &&  obj.getClass()==this.getClass()) flag =true;
		if(null!=obj){
			User2 user=(User2)obj;
			if(user.getName().equals(this.name) && user.getRoll().equals(this.roll)){
				flag =true;
			}
		}
		return flag;
		}*/
		@Override
			public int hashCode() {
				int result =100 ; 
				result =result + (20 * 100 ) * + this.name.hashCode();
				result =result + (20 * 100 ) * + this.roll.hashCode();
				System.out.println(result);
				return result;
			}
	
	
	public static void main(String[] args) {
		User2 user2=new User2();
		user2.setName("abcd");
		user2.setRoll("12");
		
		User2 user3=new User2();
		user3.setName("abcd");
		user3.setRoll("12");
		
		Map<User2,String> map =new HashMap<User2,String>();
		map.put(user2, user2.getName());
		map.put(user3, user3.getName());
		
		
		System.out.println(map);
		
		if(user2.equals(user3)){
			System.out.println("true");
		}
		
		else
			System.out.println("false");
		}
	}


