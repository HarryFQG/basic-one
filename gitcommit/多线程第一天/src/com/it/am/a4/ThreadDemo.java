package com.it.am.a4;
/**
 * ʵ�ֽӿڷ�ʽ��Thread
 * @author Feng
 *		����Thread �����ͨ�����췽��������Runnable�ӿ�ʵ����
 *		����Thread���Start����
 */
public class ThreadDemo {
	
	public static void main(String[] args) {
		SubRunnalble sr=new SubRunnalble();
		SubRunnalble sr1=new SubRunnalble();		
		//�������з���������
		Thread tr=new Thread(sr);//�����߳�����
		Thread tr1=new Thread(sr1,"С��");//���߳�����
		tr.start();
		tr1.start();
		for(int i=0;i<50;i++){
			System.out.println("main--"+i);
		}
		
		/**
		 * �Լ�д�ģ�����ʹ�������ڲ���
		 */
		Thread t=new Thread(new Runnable(){
			@Override
			public void run() {
				
				System.out.println(Thread.currentThread().getName());
				
			}},"�����ڲ�����̣߳�");
		t.start();
		
		
	}
	
	
	
	
}
