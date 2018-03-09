package com.it;

public abstract class Demo1 implements Interface1{
	protected Interface1 demo12;
	public Demo1(){
		
	}
	public Demo1(Interface1 demo2){
		this.demo12=demo2;		
	}
	public void draw(int x,int y){
		demo12.draw(x, y);
		
	} 
	
	
}
