package com.it.closure;

public class TeachableProgramer1 extends Programmer{

	public TeachableProgramer1(){}
	public TeachableProgramer1(String name,Integer id){
		super(name,id);
	}
	private void teach(){
		System.out.println(getName()+"教师在讲台讲课···");
	}
	
	private class Closure implements Teachable1{
		/**
		 * 非静态内部类回调外部类实现worker方法，
		 * 非静态内部类引用的作用仅仅是向客户类提供一个回调外部类的途径
		 */		
		@Override
		public void work() {
			teach();
		}		
	} 
	
	public Teachable1 getCallbackReference(){
		return new Closure();
	}
	
}
