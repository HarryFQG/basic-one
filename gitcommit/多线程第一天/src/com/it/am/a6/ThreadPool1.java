package com.it.am.a6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ʵ���̳߳صĵ�������ʽ��ʵ��Callable�ӿڷ�ʽ
 * 	ʵ�ֲ��裺
 * 		������Executors��̬����newFixedThreadPool�����������̳߳�
 * 		�̳߳ض���ExecutorService�ӿ�ʵ���࣬���÷���submit�ύ�߳�
 * @author Feng
 *
 */
public class ThreadPool1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es =Executors.newFixedThreadPool(2);
		Future<String> sb = es.submit(new ThreadPoolRunnable1());//����һ��Future�ӿڵ�ʵ����
		String s=sb.get();
		System.out.println(s);
		
	}
	
}











