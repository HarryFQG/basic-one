package com.it.maven;

import org.junit.Test;

import junit.framework.Assert;

public class TestMaven01 {

	@Test
	public void testSayHell(){
		MavenFirst maven=new MavenFirst();
		String sayHello = maven.sayHello("wang wu");
		
		Assert.assertEquals("hellow wang wu", sayHello);
	}
	
}
