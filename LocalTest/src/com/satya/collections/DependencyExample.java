package com.satya.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class DependencyExample {

	
	
	public static void main(String[] args) {
		A ob =new A();
		ob.display();
		
	
}
}

class A{
	
	B  b= null;
	public A(){
		b=new B();
	}
	
	void display(){
		b.display();
		System.out.println("This is class A");
	}
	
}
class B{
	 void display(){
		 System.out.println("This is class B"); 
	 }
	
}