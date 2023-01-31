package com.satya.old.exception;

public class ExceptionCallingMethod {
    public static void main(String[] args) {
		A  a  = new A();
		a.methodA();
		
		//A1 a1  = new A1();
	//	a1.methodA1();
		
	}
}


class A  {
	
	 void methodA() {
		
		try { 
		B b  = new B()  ;
		b.methodB();
		}
		catch(Exception e) {
			System.out.println("I am here at class A");
		}
	}
	
}

class B  {
	
	void methodB() {
		try {
			C c  = new C();
			String st  =  c.methodC();;
			if(st!=null) {
			st.charAt(0) ;
			}
		}
		catch (NullPointerException e) {
			System.out.println("I am here at class B");
			
		}
	}
	
}

class C  {
	
	String methodC() {
		String st= null;
		try {
			
			int a = 10 /0 ;
			st ="abcd" ;
		}
		catch (ArithmeticException e) {
			System.out.println("I am here at class C");
			
		}
		return st ;
	}
	
}

class A1  {
	
	 void methodA1() {
		
		try { 
		B1 b1  = new B1()  ;
		b1.methodB1();
		}
		catch(Exception e) {
			System.out.println("I am here at class A1");
		}
	}
	
}

class B1  {
	
	void methodB1() {
		int a = 10 /0 ;
	}
	
}