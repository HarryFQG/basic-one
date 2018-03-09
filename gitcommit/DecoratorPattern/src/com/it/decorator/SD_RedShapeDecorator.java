package com.it.decorator;

public class SD_RedShapeDecorator extends ShapeDecorator {

	
	
	public SD_RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		
	}

	public void draw(){
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	public void setRedBorder(Shape decoratedShape){
		System.out.println("Border Color:red");
	}
	
}
