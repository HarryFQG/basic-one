package com.it.test01;

public class B extends A{

	static{
		System.out.println("Bstatic");
		
	}
	int a=10;
	public B(){
		System.out.println("--------B的构造方法------");
	}
	
	public void dec(){
		System.out.println("----B的dec---");
		
	}
	
}
