package com.it.inner;

public abstract class FatherClass {
	public int id=0;
	public FatherClass(){
		System.out.println("F无参构造");
	}
	public FatherClass(int id){
		this.id=id;
		System.out.println("F有参构造"+id);
	}
	
	public void getName(){
		System.out.println("F方法："+id*10);
	}
	
	public abstract int getId(int id);
}
