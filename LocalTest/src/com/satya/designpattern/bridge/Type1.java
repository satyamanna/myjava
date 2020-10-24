package com.satya.designpattern.bridge;

public class Type1 {
	public static void main(String[] args) {
	  A1 child = new A1Child();
	 new BridgeImple(child).add1();;
	  
	  
	  
}
}


interface A1{
	public void add();
}


class A1Child  implements A1{
	@Override
	public void add() {
		System.out.println("This is parent of A");
	}
}

 interface A1Bridge {
	public void add1(); 
}
 
 class BridgeImple implements A1Bridge  {
	
	 A1 a;
	 BridgeImple(A1 a) {
		 this.a=a;
	 }
	 @Override
	 public void add1(){
		a.add();
	}
}
 
 

 

