package com.itcast.demo1;

import java.lang.reflect.Method;

/**
 * 反射获取有参数的成员方法并执行
 * public void sleep(int a,String s,double d)
 */
public class ReflectDemo7 {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		Object obj=c.newInstance();
		
		Method method = c.getMethod("sleep", int.class,String.class,double.class);
		System.out.println(method);
		method.invoke(obj, 1,"23",123.9);
	}
	
}
