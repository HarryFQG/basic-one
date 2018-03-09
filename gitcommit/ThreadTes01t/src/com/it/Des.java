package com.it;

public class Des implements Runnable {
	Method01 method;
	public Des(Method01 method){
		this.method=method;
	}
	@Override
	public void run() {
		for(int i=0;i<method.current;i++){
			method.flag=true;
			method.des(method);
		}

	}

}
