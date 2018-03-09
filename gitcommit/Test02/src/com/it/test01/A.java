package com.it.test01;

public abstract class A {

	static{
		System.out.println("Astatic");
		
	}
	
	int a=10;
	public A(){
		System.out.println("-------A的构造方法-------");
		
	}
	
	public void dec(){
		System.out.println("------父类的方法-----");
		
	}
}
