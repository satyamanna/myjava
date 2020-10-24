package com.satya.threadtest;

public class ThreadTest {

	static {
		System.out.println("This is statis block ");
		Thread t=new Thread(new A());
		t.setDaemon(true);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		System.exit(0);
	}
	
	
	
	/*public static void main(String[] args) {
		//Thread t=new Thread(new A());
		//t.setDaemon(true);
		//t.setPriority(Thread.NORM_PRIORITY);
		System.out.println("This is main class");
		
	}*/
	
}


class A extends Thread { 
	
	@Override
	public void run() {
	System.out.println("Child thread");
	}
	
}
