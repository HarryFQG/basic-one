package com.it2.am.a4;
/**
 * ģ������
 * 		ʹ��A����B��
 * @author Feng
 */
public class DeadLock implements Runnable{
	private int i=0;
	@Override
	public void run() {
		while(true){//��������ѭ������Ȼ����һ���ͻ�ȡ������
			if(i%2==0){
				//�߳̽���Aͬ�����ٽ���Bͬ��
				synchronized (LockA.lock) {
					System.out.println("����if....locka��");
					synchronized (LockB.lock) {
						System.out.println("����if....lockb��");
					}
				}
			}else{
				//�߳̽���Bͬ�����ٽ���Aͬ��
				synchronized (LockB.lock) {
					System.out.println("����else....lockb��");
					synchronized (LockA.lock) {
						System.out.println("����else....locka��");
					}
				}
			}
			i++;
		}
		
	}

}




