package com.satya.designpattern.prototype;

public class Bean implements Prototype{
    
	
	@Override
	public String toString() {
		return "Bean [studentName=" + studentName + ", className=" + className + "]";
	}
	private String studentName ;
    private String className;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public Prototype getprototyep() {
		// TODO Auto-generated method stub
		return this;
	}
}
