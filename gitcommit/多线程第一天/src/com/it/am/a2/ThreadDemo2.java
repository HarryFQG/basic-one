package com.it.am.a2;
/**
 * 获取线程的名字
 * @author Feng
 *每个线程，都有自己的名字。
 *		运行方法main时，名字就是"mian"
 *		运行其他的新线程也有名字默认为："Thread-0","Thread-1","Thread-2","Thread-3","Thread-n",
 *
 *JVM开启主线程，运行方法Main,主线程也是线程，是线程就是Thread类对象，
 *		Thread类中，静态方法static Thread currentThread()返回正在执行的线程对象
 *
 */

public class ThreadDemo2 {
	public static void main(String[] args) {
		GetNameThread nt=new GetNameThread();	
		nt.setName("旺财");//修改线程的名字通常在开启之前修改
		//nt.run();//这样写是单线程，从报错可以知道。main
		nt.start();
		Thread t=Thread.currentThread();//获得正在执行的线程
		System.out.println(t.getName());
		
		
	}
	
	
}
