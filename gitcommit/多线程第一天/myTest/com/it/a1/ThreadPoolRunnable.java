package com.it.a1;

import java.util.concurrent.Callable;

public class ThreadPoolRunnable implements Callable{

	@Override
	public String  call() throws Exception {
		// TODO �Զ����ɵķ������
		return "Hellow Word!!";
	}


}
