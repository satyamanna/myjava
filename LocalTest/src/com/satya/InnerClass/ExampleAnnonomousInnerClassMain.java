package com.satya.InnerClass;

public class ExampleAnnonomousInnerClassMain {

	static Class1 ob=new Class1(){
		public  void add(){
			System.out.println("This is ExampleAnnonomousInnerClassMain class and method is add");
		}
	};
	
	public void dd( Interface1 ob){
		System.out.println("This is dd method ");
		
	}
	public static void main(String argv[]){
		ob.add();
		
		ExampleAnnonomousInnerClassMain ExampleAnnonomousInnerClassMain=new ExampleAnnonomousInnerClassMain();
				ExampleAnnonomousInnerClassMain.dd(new Interface1() {
					
					@Override
					public void show() {
						// TODO Auto-generated method stub
						System.out.println("this is show method");
					}
				});
		
	}
	
	
}
