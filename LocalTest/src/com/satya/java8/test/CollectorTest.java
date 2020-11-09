package com.satya.java8.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorTest {

	 // need to know about stream.collect , Collectors.groupingBy, Collectors.collectingAndThen Collectors.maxBy 
	  public static void main(String[] args) {
		UserPojo user1  = new UserPojo("adam" ,  "101" ,  "napatty barowary tala", 10097l , 9087l,"type1") ;
		UserPojo user2  = new UserPojo("adam1" ,  "101" ,  "napatty barowary tala", 10097l , 9088l,"type1") ;
		UserPojo user3  = new UserPojo("adam2" ,  "101" ,  "napatty barowary tala", 10099l , 9089l,"type3") ;
		List<UserPojo> list = new ArrayList<UserPojo>() ; 
		list.add(user1);
		list.add(user2);
		list.add(user3);
		Collection<UserPojo>  lastupdate  =  list.stream().collect(Collectors.groupingBy(UserPojo::getEffectiveDate ,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(UserPojo::getTxnTime)), Optional::get))).values() ;
		//list.stream().collect(supplier, accumulator, combiner) -- 
		//list.stream().collect(collector)
		//Collectors.groupingBy(classifier, mapFactory, downstream) -- returns collectors
		
		for(UserPojo user :  lastupdate) {
			System.out.println(user.toString());
		}
	}
}



