package com.it2.am.a4;
/**
 * 模拟死锁
 * 		使用A锁和B锁
 * @author Feng
 */
public class DeadLock implements Runnable{
	private int i=0;
	@Override
	public void run() {
		while(true){//必须是死循环，不然可能一个就获取两把锁
			if(i%2==0){
				//线程进入A同步，再进入B同步
				synchronized (LockA.lock) {
					System.out.println("进入if....locka锁");
					synchronized (LockB.lock) {
						System.out.println("进入if....lockb锁");
					}
				}
			}else{
				//线程进入B同步，再进入A同步
				synchronized (LockB.lock) {
					System.out.println("进入else....lockb锁");
					synchronized (LockA.lock) {
						System.out.println("进入else....locka锁");
					}
				}
			}
			i++;
		}
		
	}

}




