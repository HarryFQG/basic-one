package com.it;

public class Test01 {
	
	public static void main(String[] args) {
		Method01 method=new Method01();
		Inc inc=new Inc(method);
		Des des=new  Des(method);
		Thread t;
		for(int i=0;i<2;i++){
			t=new Thread(inc);
			t.start();
			t=new Thread(des);			
			t.start();
		}
		
		
	}
	
}
