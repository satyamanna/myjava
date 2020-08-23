package com.satya.localtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decimal_Binary {

	
	//   this program is for converting decimal to binary    
	public static void main(String[] args) {
		 Scanner  sc  =  new Scanner(System.in) ; 
		 try {
			int n   =  sc.nextInt();
			List<Byte> list  = new ArrayList<Byte>() ;
			while (n  !=0 ) {
				int temp   =  n   %  2 ;
				n  = n   /  2   ;
			    list.add(new Byte((byte) temp)) ;
			}
			System.out.println(list);
			
		} finally {
			 sc.close();
		}
		
		
      
		
	}
	
}
//  if we don't use catch block how system  is caching the exception  in java    