package com.it2.am.a5;
/**
 * 输出线程，对资源对象Resource中的成员变量，输出值
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
			synchronized (r) {//注意：和要要操作同步的资源线程拿的同一个锁。 
				if(!r.flag){
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
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
