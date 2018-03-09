package com.it.am.a7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用线程池技术求和？
 * 两个线程，一个线程计算1+100，另外一个计算1+200的和
 * @author Feng
 *多线程的异步计算
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



