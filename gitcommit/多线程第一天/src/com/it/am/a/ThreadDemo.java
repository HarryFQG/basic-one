package com.it.am.a;

/**
 * ��δ���������һ���߳�
 * 			����Thread����Ķ���
 * 			����������start ����
 * 			 ���̳߳���ִ��,JVM�����߳��е�run����
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
