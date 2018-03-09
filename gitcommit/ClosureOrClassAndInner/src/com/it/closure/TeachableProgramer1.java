package com.it.closure;

public class TeachableProgramer1 extends Programmer{

	public TeachableProgramer1(){}
	public TeachableProgramer1(String name,Integer id){
		super(name,id);
	}
	private void teach(){
		System.out.println(getName()+"��ʦ�ڽ�̨���Ρ�����");
	}
	
	private class Closure implements Teachable1{
		/**
		 * �Ǿ�̬�ڲ���ص��ⲿ��ʵ��worker������
		 * �Ǿ�̬�ڲ������õ����ý�������ͻ����ṩһ���ص��ⲿ���;��
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
