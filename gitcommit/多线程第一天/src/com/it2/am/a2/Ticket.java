package com.it2.am.a2;
 /**
 *采用同步方法形式，解决线程的安全问题
 *好处：代码量比较简洁
 *		将线程的共享数据，和同步，抽取到一个方法中
 *同步方法有锁吗？
 *		有，同步方法中的对象锁，是本类对象引用this。
 *		如果方法是静态的，同步也有锁，但不是this，锁是本类自己(类名.class)。
 */
public class Ticket  implements Runnable{
	//成员变量随对象存在堆中
	//private int a=100;//假设有100张票
	private static int b=100;
	@Override
	public  void run() {
		payTicket();
		
	}
	
	/**
	 * 在方法的返回类型的关键字之前加上同步关键字
	 */
	/*public static  void payTicket(){
		synchronized (Ticket.class) {
			while (true) {//为了看到效果，就来个死循环
				
				 if(b>0){
						try {
							Thread.sleep(10);			//睡眠1秒	
						} catch (InterruptedException e) {					
							e.printStackTrace();
						}
						System.out.println("线程：--"+Thread.currentThread().getName()+"\t,售出第----"+b--);
					}
			
			}
		}
		
	}*/
	
	public synchronized void payTicket(){//不出同步就不会释放锁
		
		while (true) {//为了看到效果，就来个死循环
				
			 if(b>0){
					try {
						Thread.sleep(10);			//睡眠1秒	
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
					System.out.println("线程：--"+Thread.currentThread().getName()+"\t,售出第----"+b--);
				}
			
			
		}
		
	}
}





