package com.it.inner;

public abstract class FatherClass {
	public int id=0;
	public FatherClass(){
		System.out.println("F�޲ι���");
	}
	public FatherClass(int id){
		this.id=id;
		System.out.println("F�вι���"+id);
	}
	
	public void getName(){
		System.out.println("F������"+id*10);
	}
	
	public abstract int getId(int id);
}
