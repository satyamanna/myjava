package com.satya.test;

public class Test5 {
	public static void main(String[] args) {
		new ABCD().ABCD();
		System.out.println(new ABCD().hashCode());
	}
}
class ABCD{
	
	public ABCD(int i){
		System.out.println(1);
	}
	public ABCD(){
		this(10);
		System.out.println(2);
	}
	void ABCD(){
		ABCD(10);
		System.out.println(3);
	}
	void ABCD(int i){
		System.out.println(4);
	}
}