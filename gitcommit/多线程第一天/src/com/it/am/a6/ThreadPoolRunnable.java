package com.it.am.a6;

public class ThreadPoolRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("线程任务提交1："+Thread.currentThread().getName());
		
	}

}
