package com.satya.designpattern.adaptor.easy;

public class PencilImpl implements Pencil{

	Pen pen ;
	
	PencilImpl(Pen pen)
	{
		this.pen=pen;
	}
	
	@Override
	public void writeWithPencil() {
		System.out.println("I am writibng with a pencil");
		
		
	}
	
	public void writeWithPen() {
		
		pen.writeWithPen();
		
		
	}

	
	
}

