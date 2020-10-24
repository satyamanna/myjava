package com.satya.threadtest;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ProducerConsumer {


	
	public static void main(String agv[]){
	  
	  try{
		  
		  producerAndConsumer proCus=new producerAndConsumer();
		  Thread producer=new Thread(new Runnable() {
			
			@Override
			public void run() {
				proCus.producer();
				
			}
		});
		  
		  Thread consumer=new Thread(new Runnable() {
				
				@Override
				public void run() {
					proCus.consumer();
					
				}
			});
		  
		  
		  producer.start();
		  consumer.start();
		  
		  producer.join();
		  consumer.join();
		  
	  }
	  catch(final Exception e){
		  e.printStackTrace();
	  }
	  
	  
	  
	  
  }

}
class  producerAndConsumer{
	
	List<Integer> list=new ArrayList<Integer>();
    int bufferSize=2;
    int number =1 ;
    
	public void producer(){
		
		
		try {
			
		while(true) {
			
		 synchronized(this){
			
				// if buffer size is full	
				if(null!=list && !list.isEmpty() && bufferSize==list.size()){
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Waiting  for  Consumer to consume data>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					wait();
				}
				// is list is empty 
				if(null==list || list.isEmpty()){
					list.add(new Integer(number));
					System.out.println("Producer produce number : "+number);
					number ++ ;
					notify();
					Thread.sleep(100);
				}
				
				if (null!=list && !list.isEmpty() && bufferSize!=list.size() ){
					list.add(new Integer(number));
					System.out.println("Producer produce number :"+number);
					number ++ ;
					notify();
					Thread.sleep(100);
				}
			}
			
			
		}	
		
		
		
		
		
		}
		catch(final Exception e){
			e.printStackTrace();
		}
	}
	
	
public void consumer(){
		
		
		try {
			
		 while(true) {
			
			 synchronized(this){
				// if buffer size is full	
				if(null!=list && !list.isEmpty() && bufferSize==list.size()){
					
					for (int step = 0 ; (   step < ( bufferSize  )) ; step++) {
						System.out.println("Consumer discards number "+list.get(0));
						list.remove(0);
						//System.out.println(" Size of List"+step+": "+list.size());
						
						
						
						//list.removeFirst();
					}
					notify();
					Thread.sleep(100);
					
				}
				// is list is empty 
				if(null==list || list.isEmpty()){
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Waiting  for  Producer to produce data >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					wait();
				}
				
				
			}
			
			
		}	
		
		
		
		
		
		}
		catch(final Exception e){
			e.printStackTrace();
		}
	}
	
	
	
}