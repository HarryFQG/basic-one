package com.it2.am.a2;

public class ThreadDemo {
	public static void main(String[] args) {
		//创建Runnable接口的实现类
		Ticket ticket=new Ticket(); 
		//创建三个对象传递Runnable接口实现
		Thread t0=new Thread(ticket,"旺财");
		Thread t1=new Thread(ticket,"泰迪");
		Thread t2=new Thread(ticket,"撒手没");
		t0.start();
		t1.start();
		t2.start();
		
	}
}
