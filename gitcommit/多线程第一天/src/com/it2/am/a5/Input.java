package com.it2.am.a5;
/**
 * �����߳�
 * 		��Resource�еĳ�Ա����
 * 		һ�θ�ֵ����������
 * 		�´θ�ֵ�����ģ�Ů
 * @author Feng
 *
 */
public class Input implements Runnable {

	private Resource r;
	
	public Input(Resource r) {
		super();
		this.r = r;
	}
	private int i=0;
	@Override
	public void run() {		
		while(true){
			synchronized (r) {	
				if(r.flag){//Ϊtrueʱ��˵����ֵ���
					try {
					r.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}}
				if(i%2==0){
					r.name="����";
						r.sex="��";
				}else{
					r.name="����";
					r.sex="Ů";							
				}
				i++;
				//���Է��̻߳��ѣ����Ϊtrue
				r.flag=true;
				r.notify();
			}
		}
		
		
	}

}
