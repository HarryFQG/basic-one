package com.it2.am.a1;
 /**
 * ģ����Ʊ
 * @author Feng
 *ȱ�㣺û��ʵ��ͬ������ͨ���߳����߳������⡣
 *�����ͨ��ͬ�����������ή�������ٶ�
 *��ʽ��synchronize(�������){//ͬ�������
 *				//�߳�Ҫ�����Ĺ�������
 *				
 *			}
 *
 */
public class Ticket  implements Runnable{
	//��Ա�����������ڶ���
	private int a=100;//������100��Ʊ
	
	private Object obj=new Object();//Ϊ��ͬ����ʵ�ֶ���������ʹ����������,����ʱû�����⣬����ʱ������
	@Override
	public  void run() {
		while (true) {//Ϊ�˿���Ч������������ѭ��
			 synchronized (obj) {//ͬ�������
				 if(a>0){
						try {
							Thread.sleep(10);			//˯��1��	
						} catch (InterruptedException e) {					
							e.printStackTrace();
						}
						System.out.println("�̣߳�--"+Thread.currentThread().getName()+"\t,�۳���----"+a--);
					}
			}  
		}
		
	}

}





