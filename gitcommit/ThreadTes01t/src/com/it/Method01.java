package com.it;

public class Method01 {
	public int current=10;
	public boolean flag=false;
	public synchronized void inc( Method01 method){
		if(method.flag){
			method.current++;
			System.out.println("加法："+Thread.currentThread().getName()+":"+method.current);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			method.flag=false;
		}
		notify();
	}
	public synchronized void des(Method01 method){
		if(method.flag){
			method.current--;
			System.out.println("减法："+Thread.currentThread().getName()+":"+method.current);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		notify();
	}
	
	
}
