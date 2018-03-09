package com.it.am.a5;
/**
 * 使用匿名内部类，实现多线程程序
 * 	前提：继承接口或者实现接口
 * 		new 父类或接口(){
 * 				重写抽象方法
 * 		}
 * @author Feng
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		//方式一：继承方式 XXX extends Thread(){ public void run(){}}
		new Thread (){
			public void run(){				
				System.out.println("Thread匿名内部类！");
			}
			
		}.start();;
		//方式二：实现接口的方式  XXX implements Runnable(){public void run(){}s}		
		
		Runnable r= new Runnable(){

			@Override
			public void run() {
				System.out.println("实现接口Runnable的匿名内部类。");
				
			}};
			new Thread(r).start();;
		//方式三：结合二者
			
			new Thread(new Runnable(){

				@Override
				public void run() {
				System.out.println("实现接口回调：将二者都结合了");
					
				}}).start();;
			
	}
	
	
}






