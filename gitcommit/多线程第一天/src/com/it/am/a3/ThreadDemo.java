package com.it.am.a3;

/**
 *  π”√Sleep
 * @author Feng
 *
 */
public class ThreadDemo {
	public static void main(String[] args)throws Exception {
		SleepThread sleep=new SleepThread();
		sleep.start();
	}
}
