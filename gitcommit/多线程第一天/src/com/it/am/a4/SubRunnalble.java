package com.it.am.a4;
/**
 * ʵ���̵߳�����һ����ʽ��
 * ʵ�ֽӿ�Runnable��Ҫ��дrun������
 * @author Feng
 *
 */
public class SubRunnalble implements Runnable{

	@Override
	public void run() {

		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
			
		}
		
		
	}
	
	
	

}
