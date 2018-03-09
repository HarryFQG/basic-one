package com.it2.am.a5;
/**
 * 开启输入线程和输出线程
 * @author Feng
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {
		Resource r=new Resource();
		Input in=new Input(r);
		Output out=new Output(r);
		
		Thread t0=new Thread(in);
		Thread t1=new Thread(out);
		t0.start();
		t1.start();
	}
}
