package com.satya.collections;

public class ComparatorClass implements java.util.Comparator<StudentBean> {

	@Override
	public int compare(StudentBean o1, StudentBean o2) {
		
		int returnNumber =  0 ;
		if ( ( o1.getRoll() -  o2.getRoll())> 0 ) returnNumber= 1;
		if ( ( o1.getRoll() -  o2.getRoll())< 0 ) returnNumber= -1;
		if ( ( o1.getRoll() -  o2.getRoll()) ==  0 ) returnNumber= 0;
		return returnNumber;
		
		
	}
}
