package com.it.am.a6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK1.5��������
 * 	ʹ���̵߳Ĺ����ࣺExecutors���еľ�̬���������̳߳ض���ָ���̵߳ĸ�����
 * 			static ExecutorService newFixedThread(int ����);//�����̳߳ض���
 * 			���ص���ExecutorService�ӿڵ�ʵ���ࣨ�̳߳ض��� 
 * 			�ӿ�ʵ������󣬵��÷���Submit(Runnable r)�ύ�߳�ִ��˳��
 * @author Feng
 *
 */


public class ThreadPool {

	public static void main(String[] args) {
		//step1:���ù����ľ�̬�����������̳߳ض���		
		ExecutorService es = Executors.newFixedThreadPool(2);//�����̳߳ض����Ƿ��صĽӿ�
		//���ýӿ�ʵ�������es�е�submit������
		es.submit(new ThreadPoolRunnable());//��Runnable�ӿ�ʵ����Ķ��󣬴���
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());//��һ������ȥ������ֻ��ȥ��������������߳�
		es.shutdown();//�����̳߳أ�һ�㲻ȥ�á�
	}
	
	
	
	
	
	
	
}
