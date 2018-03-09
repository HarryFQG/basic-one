package com.it.inner2;

public class ACaller {

	private CallBack call;
	public void setCall(CallBack call){
		this.call=call;
		
	}
	
	
	public void call(){
		this.call.method();
	}
}
