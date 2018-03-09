package com.itcast.demo1;

import java.lang.reflect.Constructor;

/**
 * 通过反射，获取有参的构造方法并运行
 * @author Feng
 *
 */
public class ReflectDemo2 {

	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("com.itcast.demo1.Person");
		//获取常有的，String 和int 、float 参数的方法
		/*Constructor<T> getConstructor(Class<?>... parameterTypes)  :
		*			Class<?>... parameterTypes:传递要获取的构造方法的参数列表
		*
		*/
		Constructor cons = c.getConstructor(String.class , int.class,float.class );
		
		System.out.println(cons);
		//运行构造方法;
		/* 
		 * T newInstance(Object... initargs):
		 * 			  Object... initargs:运行构造方法后，传递的实际参数
		 *
		 */
		Object obj = cons.newInstance("张三",20,123.1f);
		System.out.println(obj);
		
	}
	
}
