package com.it2.am.a2;

public class ThreadDemo {
	public static void main(String[] args) {
		//����Runnable�ӿڵ�ʵ����
		Ticket ticket=new Ticket(); 
		//�����������󴫵�Runnable�ӿ�ʵ��
		Thread t0=new Thread(ticket,"����");
		Thread t1=new Thread(ticket,"̩��");
		Thread t2=new Thread(ticket,"����û");
		t0.start();
		t1.start();
		t2.start();
		
	}
}
