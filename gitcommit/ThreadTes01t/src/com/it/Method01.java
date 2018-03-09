package com.it;

public class Method01 {
	public int current=10;
	public boolean flag=false;
	public synchronized void inc( Method01 method){
		if(method.flag){
			method.current++;
			System.out.println("�ӷ���"+Thread.currentThread().getName()+":"+method.current);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			method.flag=false;
		}
		notify();
	}
	public synchronized void des(Method01 method){
		if(method.flag){
			method.current--;
			System.out.println("������"+Thread.currentThread().getName()+":"+method.current);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		notify();
	}
	
	
}
