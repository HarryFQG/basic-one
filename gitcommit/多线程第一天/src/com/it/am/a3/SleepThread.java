package com.it.am.a3;

/**
 * ʹ��Sleep,
 * ֻҪ���̵߳ĵط��Ϳ���Sleep.sleep�Ǿ�̬�ķ�����
 * @author Feng
 *
 */
public class SleepThread extends Thread{

	public void run(){
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(1000);//����1��
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
		
	}
}
