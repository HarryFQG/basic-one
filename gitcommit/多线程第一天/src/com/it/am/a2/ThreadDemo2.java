package com.it.am.a2;
/**
 * ��ȡ�̵߳�����
 * @author Feng
 *ÿ���̣߳������Լ������֡�
 *		���з���mainʱ�����־���"mian"
 *		�������������߳�Ҳ������Ĭ��Ϊ��"Thread-0","Thread-1","Thread-2","Thread-3","Thread-n",
 *
 *JVM�������̣߳����з���Main,���߳�Ҳ���̣߳����߳̾���Thread�����
 *		Thread���У���̬����static Thread currentThread()��������ִ�е��̶߳���
 *
 */

public class ThreadDemo2 {
	public static void main(String[] args) {
		GetNameThread nt=new GetNameThread();	
		nt.setName("����");//�޸��̵߳�����ͨ���ڿ���֮ǰ�޸�
		//nt.run();//����д�ǵ��̣߳��ӱ������֪����main
		nt.start();
		Thread t=Thread.currentThread();//�������ִ�е��߳�
		System.out.println(t.getName());
		
		
	}
	
	
}
