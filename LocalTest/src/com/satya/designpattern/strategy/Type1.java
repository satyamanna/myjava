package com.satya.designpattern.strategy;

public class Type1 {

	
	  public static void main(String[] args) {
		  Attack attack = new Attack(new Archer());
		  attack.doAction();
		  attack = new Attack(new Gaint());
		  attack.doAction();
		  
	}
}


interface Strategy{
	void action();
}

class  Archer  implements Strategy{

	@Override
	public void action() {
		System.out.println("Archer attack");
		
	}
	
}


class  Gaint  implements Strategy{
    @Override
	public void action() {
		System.out.println("Gain attack");
		
	}
	
}

class  Attack {
	
	Strategy s ;
	public Attack(Strategy s){
		this.s=s;
	}
	
	public void doAction(){
		s.action();	
	}
	
	
	
	
}
