package com.itcast.demo1;

/**
 * �����ȡ���췽������ݷ�ʽ��
 * 		ǰ�᣺
 * 				1  ��������������пղ������췽����
 * 				2  ���췽��Ȩ�ޱ����ǹ���Ȩ�ޣ�public��
 * 				
 * @author Feng
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		//Class���ж��巽��,T newInstance()ֱ�Ӵ�����������Ķ���ʵ��
		
		Object obj = c.newInstance();
		
		System.out.println(obj);
		
		
		
	}
	
	
	
}
