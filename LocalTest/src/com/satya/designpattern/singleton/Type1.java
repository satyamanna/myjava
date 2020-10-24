package com.satya.designpattern.singleton;

public class Type1 {

	
	public static void main(String[] args) {
		System.out.println(Connection.getInstance());
	}
	
}



class  Connection{
	private static Connection con = null;
	private Connection() {
	  System.out.println("This is connection class");
	}
	
	static Connection getInstance(){
		if(con==null) { 
			con = new Connection();
		}
		return con;
	}
	
	
	
}