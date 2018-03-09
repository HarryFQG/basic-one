package com.itcast.demo1;

import java.lang.reflect.Constructor;

/**
 * ͨ�����䣬��ȡ�вεĹ��췽��������
 * @author Feng
 *
 */
public class ReflectDemo2 {

	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("com.itcast.demo1.Person");
		//��ȡ���еģ�String ��int ��float �����ķ���
		/*Constructor<T> getConstructor(Class<?>... parameterTypes)  :
		*			Class<?>... parameterTypes:����Ҫ��ȡ�Ĺ��췽���Ĳ����б�
		*
		*/
		Constructor cons = c.getConstructor(String.class , int.class,float.class );
		
		System.out.println(cons);
		//���й��췽��;
		/* 
		 * T newInstance(Object... initargs):
		 * 			  Object... initargs:���й��췽���󣬴��ݵ�ʵ�ʲ���
		 *
		 */
		Object obj = cons.newInstance("����",20,123.1f);
		System.out.println(obj);
		
	}
	
}
