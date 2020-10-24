package com.satya.designpattern.decorator;



/*
 * decorated pattern example
 */
public class Type1 {
       
	public static void main(String[] args) {
		Template temp =new A();
		temp =   new A1(temp);
		System.out.println(temp.cost());
		
	}
	
      
}


interface  Template{
	public int cost();
	
	
}

class A implements Template{
    @Override
	public int cost() {
		return 100;
		
	}
	
}

/*
 * this is the decoration  class 
 */
abstract  class  ExtendedTemplate implements Template{
	
	Template template;
	@Override
	public int cost() {
		return template.cost();
	}
}

//  this is the decorated class
class A1 extends ExtendedTemplate{
	Template template ; 
	A1(Template template){
		this.template=template;
	}
	
	@Override
	public int cost() {
		return 100+template.cost();
	}
	
	
}

