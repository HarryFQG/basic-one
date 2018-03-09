package com.itcast.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo8 {
	
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		Constructor cons1 = c.getConstructor();
		Object obj = cons1.newInstance();
		Method method = c.getDeclaredMethod("run", int.class,String.class);
		method.setAccessible(true);
		
		
		method.invoke(obj, 1000,"²½£¡");
	}
	
}
