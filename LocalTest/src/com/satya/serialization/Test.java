package com.satya.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name ;
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
	private String roll;
	
	
	public static void main(String[] args) throws Exception {
		Test ob = new Test();
		ob.setName("satya");
		ob.setRoll("007");
		FileOutputStream fouut=new  FileOutputStream(new File("E:\\newfile.txt"));
		ObjectOutputStream object=new ObjectOutputStream(fouut);
		object.writeObject(ob);
		//fouut.write(byte[]object);
		fouut.flush();
		fouut.close();
		
		
		
	}
	
	        
}
