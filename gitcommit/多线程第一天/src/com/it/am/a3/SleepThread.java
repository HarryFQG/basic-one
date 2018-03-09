package com.it.am.a3;

/**
 * 使用Sleep,
 * 只要有线程的地方就可以Sleep.sleep是静态的方法。
 * @author Feng
 *
 */
public class SleepThread extends Thread{

	public void run(){
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(1000);//休眠1秒
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
		
	}
}
