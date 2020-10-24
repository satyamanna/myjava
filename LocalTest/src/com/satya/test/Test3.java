package com.satya.test;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("sadaskdjkdjakjdk");
		Base  ob = new Derived();
		//ob.sameMethod(); // it will call the same  method
		ob.onlyBaseClass(); //  it will show only base  class method bc it is referencing base class only  overrided method will be executed as Drived class
		//System.out.println(ob.a); /// it does not override variables  
		
	}
	 
}


class Base{
	
	public int a =10 ;
	
	public Base(){
		sameMethod();
	}
	
	private void sameMethod(){ // if the method is private then no override is occured
		System.out.println("in sameMethod  of Base Classs");
		
	}
	
	
	public void onlyBaseClass(){
		System.out.println("in onlyParentClass  of Base Classs");
		sameMethod();
	}
	
}

class Derived extends Base{
	
	public int a =20 ;
	public void sameMethod(){
		System.out.println("in sameMethod  of Derived Classs");
		
	}
	
	
	
	public void onlyDerivedClass(){
		System.out.println("in onlyDerivedClass  of Derived Classs");
	}
	
	
}