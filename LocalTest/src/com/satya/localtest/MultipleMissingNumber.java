package com.satya.localtest;

public class MultipleMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input  = {1,1,2,3,5,5,7,9,9,9,10,12} ;
		int[] register =  new int [13] ; 
		
		for(int i :  input ) {
			register[i] = 1;
		}
		
		for(int l:  register) {
			System.out.println(l);
		}
		
		

	}

}
