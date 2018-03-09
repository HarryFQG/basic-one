package com.it.inner;

public class FatherEntry {
	public String name;
	
	public FatherEntry(){
		System.out.println("无参构造");
	}
	
	public FatherEntry( String name){
		this.name=name;
		System.out.println("有参构造");
	}
	
	public void getName(){
		System.out.println("名字是："+name);
	}
	
}
