package com.it.inner3;

public class Manager {

	private Manager  m;

	public Manager(Personer p){
		System.out.println("Manager�Ĺ��캯��");
		p.doSomething(this,"�����");
	}
	
	public void callPhone(String str){
		System.out.println("Ա�����Ľ��");
	}
	
}
