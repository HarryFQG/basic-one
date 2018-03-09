package com.it2.am.a3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 模拟售票
 * @author Feng
 * 使用JDK1.5的接口Lock,替换同步代码块，实现线程的安全性
 * 		LOCK接口的方法：
 * 			lock():上锁 
 * 			unlock():释放锁
 * 		实现类：ReetrantLock
 */
public class Ticket  implements Runnable{
	//成员变量随对象存在堆中
	private int a=100;//假设有100张票
	
	//在类的成员变量位置，创建Lock接口的实现类对象
	private Lock lock=new ReentrantLock();
	
	
	
	@Override
	public  void run() {
		while (true) {//为了看到效果，就来个死循环
			 		//调用Lock接口方法lock获取锁
			lock.lock();			
				 if(a>0){
						try {
							Thread.sleep(10);			//睡眠1秒	
							System.out.println("线程：--"+Thread.currentThread().getName()+"\t,售出第----"+a--);
						} catch (InterruptedException e) {					
							e.printStackTrace();
						}finally{
							lock.unlock();
						}
						
					}
				 //释放锁，调用Lock方法的unlock方法
			
		}
		
	}

}





