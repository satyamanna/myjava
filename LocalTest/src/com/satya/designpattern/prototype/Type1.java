package com.satya.designpattern.prototype;

public class Type1 implements  Cloneable{

	  public static void main(String[] args) {
		
	}
	
	
}


class Prototype implements  Cloneable{
	public void show(){
			System.out.println("This is prototype class");
	}
	
	public Object getProtoType(){
		Object ob= null;
		try {
			ob= this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ob;
	}
}



