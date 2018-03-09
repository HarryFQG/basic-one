package com.itcast.demo1;

import java.lang.reflect.Constructor;

/**
 * 反射获取私有的构造方法
 * 		不推荐，破坏了程序的封装性，安全性
 * @author Feng
 *
 */
public class ReflectDemo4 {
	
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		//getDeclaredConstructor()获得所有的构造方法，包括私有的
		Constructor[] cons1=c.getDeclaredConstructors();
		for(Constructor cons:cons1 ){
			System.out.println(cons);			
		}
		
		/*
		 * 获得指定参数列表的构造方法：
		 * 		Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)  
		 */
		Constructor con2 = c.getDeclaredConstructor(int.class,String.class,float.class);
		
		//Constructor类的父类AccessibleObject,定义方法setAccessible（boolean）
		con2.setAccessible(true);//权限检查
		
		
		Object obj=con2.newInstance(1,"王五",123.3f);
		System.out.println(obj);
	}
	
	
}
