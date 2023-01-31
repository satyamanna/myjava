package com.satya.old.exception.superclassrelated;

import java.io.IOException;

// when super class method  does not throw exception   
// subclass  can throw unchecked exception  
//  subclass cannot throw checked exception 
public class SubclassExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class A  {
	
	
	//  it doesn't throw exception  
	void add() {
		System.out.println("The mother");
	}
	
}

class B  extends  A {
	
	//  this IO  exception  can not compatible with IO exception    
	@Override
	void add() throws IOException{
		System.out.println();
	}
}