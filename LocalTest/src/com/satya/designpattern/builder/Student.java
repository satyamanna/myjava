package com.satya.designpattern.builder;

public class Student {

	private String name;
	private String roll ;
	public Student(String name, String roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
		
}
