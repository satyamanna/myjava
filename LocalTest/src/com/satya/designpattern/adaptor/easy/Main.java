package com.satya.designpattern.adaptor.easy;


/*
 * 
 *  this is adaptor pattern ..  we are making pen inteface and it's implementation  ..  
 *  by using this pen inteface and its implentation we are able to the implemented 
 *  method form pencil ..  finally we are creating pencilimpl  instance 
 *  and calling the pen interface method
 * 
 * */
public class Main {

	public static void main(String[] args) {
		Pen p =new PenImpl(); // 1
		PencilImpl pencil = new PencilImpl(p); // 2
		pencil.writeWithPen(); // 
		
		
	}
	 
}
