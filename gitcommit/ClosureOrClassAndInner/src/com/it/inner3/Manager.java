package com.it.inner3;

public class Manager {

	private Manager  m;

	public Manager(Personer p){
		System.out.println("Manager的构造函数");
		p.doSomething(this,"码代码");
	}
	
	public void callPhone(String str){
		System.out.println("员工做的结果");
	}
	
}
