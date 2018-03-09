package com.it2.am.a5;
/**
 * 输入线程
 * 		对Resource中的成员变量
 * 		一次赋值：张三，男
 * 		下次赋值：李四，女
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
				if(r.flag){//为true时，说明赋值完成
					try {
					r.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}}
				if(i%2==0){
					r.name="张三";
						r.sex="男";
				}else{
					r.name="李四";
					r.sex="女";							
				}
				i++;
				//将对方线程唤醒，标记为true
				r.flag=true;
				r.notify();
			}
		}
		
		
	}

}
