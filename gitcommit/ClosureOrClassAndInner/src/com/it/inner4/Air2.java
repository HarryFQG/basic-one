package com.it.inner4;

public class Air2 {

	public void dosomeThing(Air1 air){
		air.waitDoThing(new CallBack(){
			@Override
			public void getResult() {
				System.out.println("Air2正在做事···");
				
			}});
	}
	
}
