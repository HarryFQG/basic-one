package com.it2.am.a1;
 /**
 * 模拟售票
 * @author Feng
 *缺点：没有实现同步锁。通过线程休眠出现问题。
 *解决：通过同步技术，但会降低运行速度
 *公式：synchronize(任意对象){//同步代码块
 *				//线程要操作的共享数据
 *				
 *			}
 *
 */
public class Ticket  implements Runnable{
	//成员变量随对象存在堆中
	private int a=100;//假设有100张票
	
	private Object obj=new Object();//为了同步块实现而键。不能使用匿名对象,编译时没有问题，运行时有问题
	@Override
	public  void run() {
		while (true) {//为了看到效果，就来个死循环
			 synchronized (obj) {//同步代码块
				 if(a>0){
						try {
							Thread.sleep(10);			//睡眠1秒	
						} catch (InterruptedException e) {					
							e.printStackTrace();
						}
						System.out.println("线程：--"+Thread.currentThread().getName()+"\t,售出第----"+a--);
					}
			}  
		}
		
	}

}





