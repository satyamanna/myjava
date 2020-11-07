package com.satya.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.satya.comaparator.Student;

public class Use {

	
	
	
	public static void main(String[] args) {
		List<Student> list =new ArrayList<Student>();
		/*StudentWithComparable ob = new StudentWithComparable();
		ob.setName("Satyajit");
		ob.setRoll(12);
		StudentWithComparable ob1 = new StudentWithComparable();
		ob1.setName("awasti");
		ob1.setRoll(01);
		StudentWithComparable ob2 = new StudentWithComparable();
		ob2.setName("pawan");
		ob2.setRoll(05);
		list.add(ob);list.add(ob2);list.add(ob1);
		Collections.sort(list);
		for (Object gg :  list) {
			System.out.println("Name :  "+gg.getName() + "   Roll :  "+gg.getRoll());
		}
		*/
		
		if(null!= list  && !list.isEmpty())
		list.clear();
		
		Student ob = new Student();
		ob.setName("b");
		ob.setRoll(12);
		Student ob1 = new Student();
		ob1.setName("a");
		ob1.setRoll(01);
		Student ob2 = new Student();
		ob2.setName("p");
		ob2.setRoll(05); 
		
		list.add(ob);list.add(ob2);list.add(ob1);
		Comparator<Student> ff=  new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int flag = 0 ; 
				if(o1.getName().compareTo(o2.getName()) >  0 )    flag = 1 ; 
				if(o1.getName().compareTo(o2.getName()) <  0 )    flag = -1 ; 
				return flag;
			}
		};
		
		Collections.sort(list, ff);
		
		for (Student gg :  list) {
			System.out.println("Name :  "+gg.getName() + "   Roll :  "+gg.getRoll());
		}
		
		
	}
}
