package com.satya.designpattern.template;

public class RegistrationEmail extends EmailTemplate{

	public String  subjectLine ;
	public String  body ;
	public String  toList ;
	
	RegistrationEmail(String  subjectLine ,String body ,  String toList){
		this.subjectLine =  subjectLine ;
		this.body=body; 
		this.toList = toList ;
	}
	
	
	@Override
	void setSubject() {
		if(null!=subjectLine &&  !subjectLine.isEmpty()) {
			System.out.println("Subject has been  set to "+subjectLine);
		}
		else{
			System.out.println("Subject can noe be null");
		}
		
	}

	@Override
	void setEmailBody() {
		if(null!=body &&  !body.isEmpty()) {
			System.out.println("Body has been  set to "+body);
		}
		else{
			System.out.println("Body can noe be null");
		}
		
	}

	@Override
	void setTolist() {
		// TODO Auto-generated method stub
		if(null!=toList &&  !toList.isEmpty()) {
			System.out.println("toList has been  set to "+toList);
		}
		else{
			System.out.println("toList can noe be null");
		}
	}

	
	
	
}
