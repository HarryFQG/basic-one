package com.it.am.a;
/**
 * 定义子类继承父类
 * @author Feng
 */
public class SubThread extends Thread{
	
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("sub---"+i);
		}
		
	}
	
}
