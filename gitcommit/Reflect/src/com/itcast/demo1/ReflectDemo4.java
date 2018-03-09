package com.itcast.demo1;

import java.lang.reflect.Constructor;

/**
 * �����ȡ˽�еĹ��췽��
 * 		���Ƽ����ƻ��˳���ķ�װ�ԣ���ȫ��
 * @author Feng
 *
 */
public class ReflectDemo4 {
	
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		//getDeclaredConstructor()������еĹ��췽��������˽�е�
		Constructor[] cons1=c.getDeclaredConstructors();
		for(Constructor cons:cons1 ){
			System.out.println(cons);			
		}
		
		/*
		 * ���ָ�������б�Ĺ��췽����
		 * 		Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)  
		 */
		Constructor con2 = c.getDeclaredConstructor(int.class,String.class,float.class);
		
		//Constructor��ĸ���AccessibleObject,���巽��setAccessible��boolean��
		con2.setAccessible(true);//Ȩ�޼��
		
		
		Object obj=con2.newInstance(1,"����",123.3f);
		System.out.println(obj);
	}
	
	
}
