package com.it.am.a6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 实现线程池的第三个方式，实现Callable接口方式
 * 	实现步骤：
 * 		工厂类Executors静态方法newFixedThreadPool方法，创建线程池
 * 		线程池对象ExecutorService接口实现类，调用方法submit提交线程
 * @author Feng
 *
 */
public class ThreadPool1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es =Executors.newFixedThreadPool(2);
		Future<String> sb = es.submit(new ThreadPoolRunnable1());//返回一个Future接口的实现类
		String s=sb.get();
		System.out.println(s);
		
	}
	
}











