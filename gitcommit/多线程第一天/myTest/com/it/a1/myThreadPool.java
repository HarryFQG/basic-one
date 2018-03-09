package com.it.a1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class myThreadPool {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Future> resultList=new ArrayList<Future>();
		
		ExecutorService es=Executors.newFixedThreadPool(3);//创建线程的个数
		Future f = es.submit(new ThreadPoolRunnable());
		resultList.add(f);
		for(Future fu:resultList){
			System.out.println(fu.isDone()+"="+fu.get()+"="+fu.isDone());
		}
		/*String str=f.get();
		System.out.println(str);*/
	
	}
	
}
