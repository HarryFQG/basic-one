package com.it2.am.a2;
 /**
 *����ͬ��������ʽ������̵߳İ�ȫ����
 *�ô����������Ƚϼ��
 *		���̵߳Ĺ������ݣ���ͬ������ȡ��һ��������
 *ͬ������������
 *		�У�ͬ�������еĶ��������Ǳ����������this��
 *		��������Ǿ�̬�ģ�ͬ��Ҳ������������this�����Ǳ����Լ�(����.class)��
 */
public class Ticket  implements Runnable{
	//��Ա�����������ڶ���
	//private int a=100;//������100��Ʊ
	private static int b=100;
	@Override
	public  void run() {
		payTicket();
		
	}
	
	/**
	 * �ڷ����ķ������͵Ĺؼ���֮ǰ����ͬ���ؼ���
	 */
	/*public static  void payTicket(){
		synchronized (Ticket.class) {
			while (true) {//Ϊ�˿���Ч������������ѭ��
				
				 if(b>0){
						try {
							Thread.sleep(10);			//˯��1��	
						} catch (InterruptedException e) {					
							e.printStackTrace();
						}
						System.out.println("�̣߳�--"+Thread.currentThread().getName()+"\t,�۳���----"+b--);
					}
			
			}
		}
		
	}*/
	
	public synchronized void payTicket(){//����ͬ���Ͳ����ͷ���
		
		while (true) {//Ϊ�˿���Ч������������ѭ��
				
			 if(b>0){
					try {
						Thread.sleep(10);			//˯��1��	
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
					System.out.println("�̣߳�--"+Thread.currentThread().getName()+"\t,�۳���----"+b--);
				}
			
			
		}
		
	}
}





