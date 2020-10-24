package com.satya.designpattern.template;


public abstract class EmailTemplate {

	
	
	abstract  void setSubject() ;
	abstract  void setEmailBody();
	abstract  void setTolist();
	
	public void doSendMail() {
	  setSubject();	
	  setEmailBody();
	  setTolist();
	}
	
	
	
	
}
