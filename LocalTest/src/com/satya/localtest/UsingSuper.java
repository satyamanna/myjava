package com.satya.localtest;

public class UsingSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UsingSuper usingSuper = new UsingSuper();
		 B ob = new B() ; 
		 
		 
	}

	
	
	
}


class A  {
	int x= 0 ; 
	int y=0;
	A(){
	System.out.println("A");
	this.x = 10 ;
	this.y =20;
	}
}

class B extends  A{
	
	public B(){
		//super();
		System.out.println("B");
		System.out.println(super.x);
	}
}