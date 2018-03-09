package com.it.closure;

public class Test1 {

	public static void main(String[] args) {
		
		TeachableProgramer1 tp=new TeachableProgramer1("李刚",123);
		//直接调用TeachableProgramer1类从Programma类继承到的worker方法
		
		tp.work();
		
		//表上调用的是Closure的worker方法
		//实际上是回调TeachableProgramer1的teach方法
		tp.getCallbackReference().work();
		
	}
	
}
