package com.satya.designpattern.template;

public class Main {

	 public static void main(String[] args) {
		EmailTemplate email = new RegistrationEmail("UAT deployment", "Hello world", "satyajit.manna@oup.com") ;
		email.doSendMail();
	}
}
