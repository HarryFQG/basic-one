package com.itcast.demo1;

import java.lang.reflect.Field;

/**
 * �����ȡ��Ա���������޸�ֵ
 * Person���еĳ�ԱString name;
 * @author Feng
 *
 */
public class ReflectDemo5 {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		Object obj=c.newInstance();
		//��λ�ȡ��Ա������
		/*
		 * ��ȡ��Ա����Class��ķ���getFields() class �ļ��е����й�����Ա����
		 * ����ֵ��Field[]  	Field�����������������
		 */
		
		Field[] f1 = c.getFields();//ȡ���й����ģ�public���Σ���Ա����
		for(Field f: f1){
			Class<?> type = f.getType();
			
			
			//Object d = type.newInstance();
			System.out.println("------d--:"+type.toString());
			
			System.out.println(f+",-----"+f.getType());//�����public java.lang.String com.itcast.demo1.Person.name
		}
		Field[] f2 = c.getDeclaredFields();//ȡ�������еĳ�Ա����
		for(Field f: f2){
			System.out.println(f);//�����public java.lang.String com.itcast.demo1.Person.name
		}
		
		//-------------------------------------------------------------
		//��ȡָ���ĳ�Ա���� String name;
		//Class ��ķ��� getField(�����ַ������͵ı���)	��ȡָ���ĳ�Ա����
		
		Field f3=c.getField("name");
		System.out.println("���ָ���ĳ�Ա����:"+f3);
		//Field ��ķ��� void set(Object obj,Object value),�޸ĳ�Ա������ֵ
		//Object obj	�����ж����֧�֣�Object value �޸ĺ��ֵ
		f3.set(obj, "����");
		System.out.println(obj);
		
		
		
		
	}
}
