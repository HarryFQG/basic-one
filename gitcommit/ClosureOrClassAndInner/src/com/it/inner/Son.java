package com.it.inner;

public class Son {
	private int sid; 
	public Son() {
		System.out.println("S�޲ι���");
	}
	public Son(int sid){
		this.sid=sid;
		System.out.println("S�вι���");
	}
	
	public void getInc(FatherClass f){
		f.getName();
		sid=f.getId(f.id);
		System.out.println(sid);
	}
	
	public void getSex(Interface1 inter, FatherClass f){
		inter.getSex(f);
		System.out.println();
	}
	
	
	
	
	public void getname(FatherEntry f){
		f.getName();
	} 
	
	
	
}
