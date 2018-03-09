package com.it2.am.a4;

public class DeadDemo {
	public static void main(String[] args) {
		DeadLock dead=new DeadLock();
		Thread t0=new Thread(dead,"Íú²Æ");
		Thread t1=new Thread(dead,"ÈöÊÖÃ»");
		t0.start();
		t1.start();
	}
}
