package com.satya.java8.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparingTest {

	
	
	
	 public static void main(String[] args) {
		 // String name, String id, String address, Long effectiveDate, long txnTime ,String trnType
		 UserPojo user1  = new UserPojo("adam" ,  "101" ,  "napatty barowary tala", 10065l , 9087l,"type1") ;
			UserPojo user2  = new UserPojo("adam1" ,  "101" ,  "napatty barowary tala", 10064l , 9086l,"type1") ;
			UserPojo user3  = new UserPojo("adam2" ,  "101" ,  "napatty barowary tala", 10099l , 9089l,"type3") ;
			List<UserPojo> list = new ArrayList<UserPojo>() ; 
			list.add(user1);
			list.add(user2);
			list.add(user3);
			System.out.println("before sorting");
			for(UserPojo user :  list) {
				System.out.println(user.toString());
			}
			//list.sort(Comparator.comparing(UserPojo::getEffectiveDate).thenComparing(UserPojo::getTxnTime));
			System.out.println("after sorting");
			for(UserPojo user :  list) {
				System.out.println(user.toString());
			}
			System.out.println("sorting approach before java 8");
			//  before java 8 
			list.sort(new Comparator<UserPojo>() {

				@Override
				public int compare(UserPojo o1, UserPojo o2) {
					if (o1.getEffectiveDate() > o2.getEffectiveDate()) return 1 ;
					else if (o1.getEffectiveDate() < o2.getEffectiveDate()) return -1 ;
					else return 0;
				}
			});
			
			for(UserPojo user :  list) {
				System.out.println(user.toString());
			}
			
	}
}
