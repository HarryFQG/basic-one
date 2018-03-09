package com.itcast.demo1;

import java.lang.reflect.Constructor;

/**
 * ͨ�������ȡclass�ļ��еĹ��췽�������й��췽��
 * ���й��췽������������
 * @author Feng
 * ����:
 *		��һ������ȡclass�ļ�
 *		�ڶ�������class �ļ������У���ȡ��Ҫ�ĳ�Ա
 *
 *Constructor �������������
 *
 */
public class ReflecctDemo1 {
	public static void main(String[] args) throws Exception {
		//����һ��
		Class c=Class.forName("com.itcast.demo1.Person");//
		//ʹ��class�ļ����󣬻�ȡ���еĹ��췽��
		//��ù������ĵ�һ�֣�Constructor[]  getConstructors	��ȡclass�ļ������е����й���Ȩ�ޣ�public���Ĺ��췽����
		Constructor[] constructors = c.getConstructors();
		for(Constructor cons:constructors){
			System .out.println(cons);			
		}
		
		//��ù������ĵڶ��֣�
		//		���ָ���Ĺ��췽�����ղ����Ĺ��췽��
		
		Constructor cons=	c.getConstructor();
		System.out.println(cons);
		//��cons�ղ������췽����Constructor��ķ���newInstance()���л�ȡ���Ĺ��췽��
		Object obj = cons.newInstance();
		System.out.println(obj);
		Person p=(Person)obj;
		p.eat();
	
	
	}
}
