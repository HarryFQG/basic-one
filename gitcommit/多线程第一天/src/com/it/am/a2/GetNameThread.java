package com.it.am.a2;

/**
 * ��ȡ�߳����֣�����Thread����
 * 		String  getName();
 * @author Feng
 *
 */
public class GetNameThread extends Thread{
	
	public void run(){
		
		
		System.out.println(super.getName());
		Thread t=Thread.currentThread();//�������ִ�е��߳�
		System.out.println(t.getName());
		
		
		
	}
	
}
