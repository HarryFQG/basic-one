package com.it.inner5Closure;

public class Student {
	int sum=0;
	public int doingThing(Teacher tea){
		
		tea.waitThing(null,new FunctionInterface(){

			@Override
			public int add(int a, int b) {	
				sum=a+b;
				return sum;
			}

			@Override
			public int des(int a, int b) {
				// TODO �Զ����ɵķ������
				return a-b;
			}});
		return sum;
	}
	
}
