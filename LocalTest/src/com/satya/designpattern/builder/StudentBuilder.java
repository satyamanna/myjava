package com.satya.designpattern.builder;

public class StudentBuilder {

	private String name;
	private String roll ;
	
	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public StudentBuilder setRoll(String roll) {
		this.roll=roll;
		return this;
	}
	
	public Student getStudent(){
		return new Student(name,roll); 
	}
	
	
}
