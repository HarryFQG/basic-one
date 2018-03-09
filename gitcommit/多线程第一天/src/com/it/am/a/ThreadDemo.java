package com.it.am.a;

/**
 * 如何创键和启动一个线程
 * 			创建Thread子类的对象
 * 			子类对象调用start 方法
 * 			 让线程程序执行,JVM调用线程中的run方法
 * @author Feng
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		SubThread st=new SubThread();
		st.start();
		
		for(int i=0;i<50;i++){
			System.out.println("main---"+i);
		}
		
	}
	
	
	
	
	
}
