package com.it.decorator;

public class Test1 {

	public static void main(String[] args) {
		Shape circle=new S_Circle();
		Shape redCircle=new SD_RedShapeDecorator(new S_Circle());
		Shape redRectangle=new SD_RedShapeDecorator(new S_Rectangle());
		System.out.println("Circle with normal border:");
		circle.draw();
		System.out.println("\nCircle of red Border:");
		redCircle.draw();
		System.out.println("\nRectangle of red Border:");
		redRectangle.draw();
		
	}
	
}
