package com.it.am.a6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK1.5的新特性
 * 	使用线程的工厂类：Executors类中的静态方法创建线程池对象，指定线程的个数。
 * 			static ExecutorService newFixedThread(int 个数);//返回线程池对象
 * 			返回的是ExecutorService接口的实现类（线程池对象） 
 * 			接口实现类对象，调用方法Submit(Runnable r)提交线程执行顺序
 * @author Feng
 *
 */


public class ThreadPool {

	public static void main(String[] args) {
		//step1:调用工厂的静态方法，创建线程池对象		
		ExecutorService es = Executors.newFixedThreadPool(2);//返回线程池对象，是返回的接口
		//调用接口实现类对象es中的submit方法。
		es.submit(new ThreadPoolRunnable());//将Runnable接口实现类的对象，传递
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());//这一个不会去创建，只会去调用里面的现有线程
		es.shutdown();//销毁线程池，一般不去用。
	}
	
	
	
	
	
	
	
}
