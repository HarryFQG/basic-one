package com.it2.am.a3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ģ����Ʊ
 * @author Feng
 * ʹ��JDK1.5�Ľӿ�Lock,�滻ͬ������飬ʵ���̵߳İ�ȫ��
 * 		LOCK�ӿڵķ�����
 * 			lock():���� 
 * 			unlock():�ͷ���
 * 		ʵ���ࣺReetrantLock
 */
public class Ticket  implements Runnable{
	//��Ա�����������ڶ���
	private int a=100;//������100��Ʊ
	
	//����ĳ�Ա����λ�ã�����Lock�ӿڵ�ʵ�������
	private Lock lock=new ReentrantLock();
	
	
	
	@Override
	public  void run() {
		while (true) {//Ϊ�˿���Ч������������ѭ��
			 		//����Lock�ӿڷ���lock��ȡ��
			lock.lock();			
				 if(a>0){
						try {
							Thread.sleep(10);			//˯��1��	
							System.out.println("�̣߳�--"+Thread.currentThread().getName()+"\t,�۳���----"+a--);
						} catch (InterruptedException e) {					
							e.printStackTrace();
						}finally{
							lock.unlock();
						}
						
					}
				 //�ͷ���������Lock������unlock����
			
		}
		
	}

}





