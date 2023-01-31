package com.satya.old.localtest;

import java.util.HashSet;

public class Pair {

	
	public static void main(String[] args) {
		int[] arr = {10,20,56,20} ;
		int sum  =30 ; 
		HashSet<Integer> set =  new HashSet<Integer>();
		for(int  i =0   ; i <  arr.length  ; i++) {
			if(set.contains(sum -arr[i])) {
				System.out.println((sum-arr[i])+" "+arr[i]);
			}
			else {
				set.add(arr[i]);
			}
		}
	}
}
