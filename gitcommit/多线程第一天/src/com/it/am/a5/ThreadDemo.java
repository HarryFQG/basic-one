package com.it.am.a5;
/**
 * ʹ�������ڲ��࣬ʵ�ֶ��̳߳���
 * 	ǰ�᣺�̳нӿڻ���ʵ�ֽӿ�
 * 		new �����ӿ�(){
 * 				��д���󷽷�
 * 		}
 * @author Feng
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		//��ʽһ���̳з�ʽ XXX extends Thread(){ public void run(){}}
		new Thread (){
			public void run(){				
				System.out.println("Thread�����ڲ��࣡");
			}
			
		}.start();;
		//��ʽ����ʵ�ֽӿڵķ�ʽ  XXX implements Runnable(){public void run(){}s}		
		
		Runnable r= new Runnable(){

			@Override
			public void run() {
				System.out.println("ʵ�ֽӿ�Runnable�������ڲ��ࡣ");
				
			}};
			new Thread(r).start();;
		//��ʽ������϶���
			
			new Thread(new Runnable(){

				@Override
				public void run() {
				System.out.println("ʵ�ֽӿڻص��������߶������");
					
				}}).start();;
			
	}
	
	
}






