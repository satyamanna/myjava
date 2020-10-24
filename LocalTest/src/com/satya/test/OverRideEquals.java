package com.satya.test;

public class OverRideEquals {

	private String name ;
	private String className;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	@Override
	public boolean equals(Object o){
		if(o==this) return true;
		if( ! (o instanceof OverRideEquals) ) return false;
		OverRideEquals overRideEquals = (OverRideEquals)o;
		return  this.name.equals(overRideEquals.getName()) && 
				this.className.equals(overRideEquals.getClass());
		}
	
	
	
}
