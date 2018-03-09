package com.it.inner2;

public class Test1 {

	public static void main(String[] args) {
		ACaller call=new ACaller();
		call.setCall(new CallBack(){

			@Override
			public void method() {
				// TODO 自动生成的方法存根
				
			}});
		call.call();
	}
	
}
