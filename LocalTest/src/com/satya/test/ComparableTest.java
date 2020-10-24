package com.satya.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bean bean =new  Bean("satyajit", 12);
		Bean bean1 =new  Bean("amit", 10);
		Bean bean2 =new  Bean("joy", 13);
		List<Bean> list=new ArrayList<Bean>();
		list.add(bean);
		list.add(bean1);
		list.add(bean2);
		Collections.sort(list); 
		//Collections.sort(arg0);
		for(Bean list1: list){
			System.out.println(list1.getName());
		}
		
	}

}


class Bean implements Comparable<Bean>{
	public String name;
	public int roll;
	
	public Bean(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
	
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
	public int compareTo(Bean o) {
		if(this.roll == o.getRoll())return  0;
		else if(this.roll > o.getRoll())return  1;
		else
		return -1;
	}
	
	
	
	
	
}
