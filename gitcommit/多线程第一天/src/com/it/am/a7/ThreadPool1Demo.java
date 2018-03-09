package com.it.am.a7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ʹ���̳߳ؼ�����ͣ�
 * �����̣߳�һ���̼߳���1+100������һ������1+200�ĺ�
 * @author Feng
 *���̵߳��첽����
 */
public class ThreadPool1Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Future<Integer> f1 = es.submit(new GetSumCallable(101));
		Future<Integer> f2 = es.submit(new GetSumCallable(201));
		System.out.println(f1.get());
		System.out.println(f2.get());
	}
	
}



