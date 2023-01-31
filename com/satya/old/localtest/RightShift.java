package com.satya.localtest;

public class RightShift {

	
	  public static void main(String[] args) {
		  int[] arr= {5,6,4,7};
		  for(int i = 0 ; i<2  ;i++) {
			  for(int  j =0 ;j< (arr.length-1) ;j++) {
				 int temp = arr[j+1] ;
				 arr[j+1] = arr[j] ; 
				 arr[j]=  temp;
				 
			  }
		  }
		  
		  for(int a :  arr) {
			  System.out.print(a+" ");
		  }
		  
	}
}
