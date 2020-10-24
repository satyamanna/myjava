package com.satya.test;

public class Test2 {

	public static void main(String[] args) {
		C ob=new C();
}
	
	
	public void add(int s){
		System.out.println(s);
	}
	
}


class A{
	
	B ob=new B();
	A(){
		System.out.println("in A");
	}
	
}

class B {
  
	B(){
		System.out.println("In B");
	}
	
	
}

class C extends A {
	B ob=new B();
		C(){
		System.out.println("In C");	
		}
}

