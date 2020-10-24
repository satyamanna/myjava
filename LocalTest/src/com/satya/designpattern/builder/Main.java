package com.satya.designpattern.builder;

public class Main {
				public static void main(String[] args) {
					StudentBuilder builder=new StudentBuilder();
					builder.setName("satya");
					System.out.println(builder.getStudent());
					
				}
}
