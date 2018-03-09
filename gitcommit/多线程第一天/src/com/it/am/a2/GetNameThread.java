package com.it.am.a2;

/**
 * 获取线程名字，父类Thread方法
 * 		String  getName();
 * @author Feng
 *
 */
public class GetNameThread extends Thread{
	
	public void run(){
		
		
		System.out.println(super.getName());
		Thread t=Thread.currentThread();//获得正在执行的线程
		System.out.println(t.getName());
		
		
		
	}
	
}
