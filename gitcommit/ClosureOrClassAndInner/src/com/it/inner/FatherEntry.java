package com.it.inner;

public class FatherEntry {
	public String name;
	
	public FatherEntry(){
		System.out.println("�޲ι���");
	}
	
	public FatherEntry( String name){
		this.name=name;
		System.out.println("�вι���");
	}
	
	public void getName(){
		System.out.println("�����ǣ�"+name);
	}
	
}
