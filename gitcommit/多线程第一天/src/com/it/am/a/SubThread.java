package com.it.am.a;
/**
 * ��������̳и���
 * @author Feng
 */
public class SubThread extends Thread{
	
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("sub---"+i);
		}
		
	}
	
}
