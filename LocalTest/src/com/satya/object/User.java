
package com.satya.object;

public class User {

	private String name;
	private String roll;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		if(obj==this) flag=true;
		if(!obj.equals(this)) flag=false;
		User user=(User)obj;
		if(user.getName().equals(this.name)
				&& user.getRoll().equals(this.roll) ) flag=true;
		return flag;
	}
}
