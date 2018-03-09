package com.it.maven;

import org.junit.Assert;
import org.junit.Test;

public class TestMaven02 {

	@Test
	public void testSayHell(){
		Maven02 maven=new Maven02();
		String sayHello = maven.sayHello("wang wu");
		
		Assert.assertEquals("hellow wang wu", sayHello);
	}
	
	
}
