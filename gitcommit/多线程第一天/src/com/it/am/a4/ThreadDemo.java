package com.it.am.a4;
/**
 * 实现接口方式的Thread
 * @author Feng
 *		创建Thread 类对象，通过构造方法，传递Runnable接口实现类
 *		调用Thread类的Start方法
 */
public class ThreadDemo {
	
	public static void main(String[] args) {
		SubRunnalble sr=new SubRunnalble();
		SubRunnalble sr1=new SubRunnalble();		
		//构造器有方法的重载
		Thread tr=new Thread(sr);//不带线程名字
		Thread tr1=new Thread(sr1,"小仓");//带线程名字
		tr.start();
		tr1.start();
		for(int i=0;i<50;i++){
			System.out.println("main--"+i);
		}
		
		/**
		 * 自己写的，可以使用匿名内部类
		 */
		Thread t=new Thread(new Runnable(){
			@Override
			public void run() {
				
				System.out.println(Thread.currentThread().getName());
				
			}},"匿名内部类的线程：");
		t.start();
		
		
	}
	
	
	
	
}
