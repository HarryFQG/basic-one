package com.it.inner3;

public class Personer {

	public Personer(){
		System.out.println("员工的无参构造函数");
	}
	
	
	public void doSomething(Manager m,String str){
		System.out.println("员工做事儿:"+str);
		m.callPhone("已经做完了");
	}
	
	
}
