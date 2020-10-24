package com.satya.oops;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Parent  ob = new  Child() ; 
		ob.add();
	}
	
	
	

}


class Parent {
	
	public void add(){
		System.out.println("This is add in parent:::");
	}
	
	
}

class Child extends Parent{
	
	@Override
	public void add(){
		System.out.println("This is add in child:::");
	}
	
}