package com.it.inner4;

public class Air1 {
	
	
	public Air1(Air2 air){
		air.dosomeThing(this);
	}
	
	public void waitDoThing(CallBack call){
		System.out.println("managerҪ�����������");
		call.getResult();
	}
	public void getMethod(CallBack call){
		
	}
	
	
}
