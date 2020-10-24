package com.satya.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest{

 public static void main(String[] args) {
	 StudentBean bean= new StudentBean("abcd", 23);
		StudentBean bean1= new StudentBean("efgh", 21);
		
		List<StudentBean> liist= new ArrayList<StudentBean>();
		
		liist.add(bean1);
		liist.add(bean);
		//Collections.sort(liist);
		Collections.sort(liist, new ComparatorClass());
		
		for(StudentBean b :  liist){
			System.out.println(b.getName());
		}
	}
}


