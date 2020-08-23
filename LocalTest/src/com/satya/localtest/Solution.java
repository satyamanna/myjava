package com.satya.localtest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
		/*
		 * String n = scanner.nextLine(); if(Solution.isProbablePrime(new
		 * BigInteger(n))){ System.out.println("prime"); } else {
		 * System.out.println("not prime"); }
		 * 
		 * scanner.close();
		 */
    	
		/*
		 * for(BigInteger i = new BigInteger("2") ; i.compareTo(new
		 * BigInteger("4901971054862853523"))<=0; i=i.add(new BigInteger("1")) ){
		 * System.out.println(i);
		 * 
		 * }
		 */
    }

   static  public Boolean isProbablePrime(BigInteger number1){
        boolean flag =true; 
       
		/*
		 * for(BigInteger i = new BigInteger("2") ; i.compareTo(number1)<=0; i.add(new
		 * BigInteger("1")) ){ if(number1.mod(i).equals(BigInteger.ZERO) &&
		 * !i.equals(number1) ) { flag = false ; break ; }
		 * 
		 * }
		 */
        return  number1.isProbablePrime(1) ;
    }
}

