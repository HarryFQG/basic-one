package com.it.maven;

import org.junit.Assert;
import org.junit.Test;

public class TestMaven02 {

	@Test
	public void testSayHell(){
		Maven03 maven=new Maven03();
		String sayHello = maven.sayHello("wang wu");
		
		Assert.assertEquals("hellow wang wu", sayHello);
	}
	
	
}
