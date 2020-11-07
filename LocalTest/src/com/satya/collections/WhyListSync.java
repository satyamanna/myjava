package com.satya.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhyListSync {

	
	 static int count =0 ; 
	 static List<Integer> list = new ArrayList<Integer>();
	 @SuppressWarnings("static-access")
	public WhyListSync() {
		// System.out.println("Thisis ");
		Collections.synchronizedList(this.list);
	 }

	public static void main(String[] args) throws Exception{
		Thread ob  =new Thread(new Thread1());
		Thread ob1  =new Thread(new Thread2());
		
		ob.start();
		ob1.start();
		ob1.join();
		
		
		for (Integer i :  list) {
			System.out.println(i);
		}
				
	}
}


class Thread1  extends WhyListSync implements  Runnable{
	 
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		int i = 0 ;
		for ( i = super.count ; i < (super.count +  10 ) ; i ++   ) { //System.out.println("n threda 1");
		super.list.add(i);}
		super.count=i;
	}
	
	/*@Override
	public void run() {
		for(int i =  0 ;  i < 5 ; i ++ ) {
				System.out.println("This is Thread1  ");
	}
	}*/
}

class Thread2  extends WhyListSync implements  Runnable{
	 
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		int i = 0;
		for ( i = super.count ; i < (super.count +  10 ); i ++   ) { // System.out.println("n threda 2a"); 
		super.list.add(i);}
		super.count=i;
	}
	
	/*@Override
	public void run() {
		for(int i =  0 ;  i < 5 ; i ++ ) {
			System.out.println("This is Thread2 ");
}
	}*/
}