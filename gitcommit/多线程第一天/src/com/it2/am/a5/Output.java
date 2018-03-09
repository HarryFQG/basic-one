package com.it2.am.a5;
/**
 * ����̣߳�����Դ����Resource�еĳ�Ա���������ֵ
 * @author Feng
 *
 */
public class Output implements Runnable {
	private Resource r;
	
	public Output(Resource r) {
		
		this.r = r;
	}

	@Override
	public void run() {
		while(true){
			synchronized (r) {//ע�⣺��ҪҪ����ͬ������Դ�߳��õ�ͬһ������ 
				if(!r.flag){
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				
				System.out.println(r.name+"----"+r.sex);		
				r.flag=false;
				r.notify();
			}
		}
	}

}
