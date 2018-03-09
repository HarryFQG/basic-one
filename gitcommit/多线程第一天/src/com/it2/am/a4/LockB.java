package com.it2.am.a4;
/**
 * B锁对象
 * @author Feng
 *和A锁对象一起模拟死锁
 */
public class LockB {
	
	private LockB(){//确保A锁只有一个,单例模式
		
	}
		public final static  LockB lock=new LockB();//外部可以获取，但不能修改
		
	
}






