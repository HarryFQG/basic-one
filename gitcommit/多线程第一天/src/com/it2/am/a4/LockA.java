package com.it2.am.a4;
/**
 * A对象锁
 * @author Feng
 *和B锁对象一起模拟死锁
 */
public class LockA {
	private LockA(){//确保A锁只有一个,单例模式
		
	}
		public final static  LockA lock=new LockA();//外部可以获取，但不能修改
		
		
	
	
}















