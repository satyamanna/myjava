package com.satya.threadtest;

public class ThreadJoin  {

	public static void main(String[] args) throws Exception{
		Thread t1= new Thread(new A1());
		Thread t2= new Thread(new B());
		
		t1.start();
		t2.start();
		t1.join();
	}
	 
}

class A1 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("class A" + i);
		}
		
	}
	
}

class B extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("class B" + i);
		}
		
	}
	
}