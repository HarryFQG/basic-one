package com.it.closure;

public class Test1 {

	public static void main(String[] args) {
		
		TeachableProgramer1 tp=new TeachableProgramer1("���",123);
		//ֱ�ӵ���TeachableProgramer1���Programma��̳е���worker����
		
		tp.work();
		
		//���ϵ��õ���Closure��worker����
		//ʵ�����ǻص�TeachableProgramer1��teach����
		tp.getCallbackReference().work();
		
	}
	
}
