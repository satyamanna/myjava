package com.satya.collections;

public class StudentBean implements Comparable<StudentBean> {
		 private String name ; 
		 private int roll ;
		 
		 
		 public StudentBean(final String name ,final int roll) {
				
			 	this.name= name;
				this.roll= roll;
			}
		 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		@Override
		public int compareTo(StudentBean ob) {
			int returnNumber =  0 ;
			if ( ( this.getRoll() -  ob.getRoll())> 0 ) returnNumber= 1;
			if ( ( this.getRoll() -  ob.getRoll())< 0 ) returnNumber= -1;
			if ( ( this.getRoll() -  ob.getRoll()) ==  0 ) returnNumber= 0;
			return returnNumber;
			
			/*int compareQuantity = ((StudentBean) ob).getRoll();

			//ascending order
			return this.roll - compareQuantity;*/
		}
		 
		 
		 
}
