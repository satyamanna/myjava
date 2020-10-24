package com.satya.annonomousInnerClass;

public class Main {

	public static void main(String argv[]){
		AnnomomousClass ob=new AnnomomousClass() {
			
			@Override
			public void add() {
				System.out.println("This is inner Class");
			}
		};
		ob.add();
	}
	
}
