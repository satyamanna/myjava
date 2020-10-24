package com.satya.searching;

public class FindNegetiveNumber {

	public static void main(String[] args) {
		
		int[] a ={1,2,-2,3};
		
		int previousValue = 0 ; 
		int temp=0; 
		for (int i=0;i<a.length;i++){
			if(i==0) temp=a[i];
			else {
				if(temp > a[i] ){
					temp = a[i];
				}
			}
			}
		System.out.println("smallest number  is " +  temp);
		
	}
}
