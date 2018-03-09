package com.it.am.a4;
/**
 * 实现线程的另外一种形式，
 * 实现接口Runnable，要重写run方法。
 * @author Feng
 *
 */
public class SubRunnalble implements Runnable{

	@Override
	public void run() {

		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"---"+i);
			
		}
		
		
	}
	
	
	

}
