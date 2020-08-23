package com.satya.localtest;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Poly ob =new Poly();
			System.out.println(ob.add(new Integer(10), new Integer(10)));
	}

}


class Poly {
	
	
	public int add (int  a, long b) {
		
		return  1 ;
	}
	
	
	  public int add (Integer b , Integer a) { return 2 ; }
	 
}

/*
 * class ChildPoly extends Poly{
 * 
 * @Override public int add (int a, int b) { return 2 ; } }
 */