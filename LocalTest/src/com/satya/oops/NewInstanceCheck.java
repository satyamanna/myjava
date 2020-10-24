package com.satya.oops;


public class NewInstanceCheck {

 //Users 
	 public static void main(String[] args) {
		
		 // we are  creating the user  by using new oparetor 
		 // if we want to create obejct in  hard code manner   
		 Users user  =new Users();
		 
		 //  if  we want to create it dynamatically  we can use .newinStance() operator
		 try{
			 Class class_  = Class.forName("com.satya.oops.Users") ;
			 class_.newInstance();
		 }
		 catch(   Exception  e) {
			 
		 }
         
		
		
	}

}


class Users{
	public Users(int a) {
	 System.out.println("This is user");
	}
	
}