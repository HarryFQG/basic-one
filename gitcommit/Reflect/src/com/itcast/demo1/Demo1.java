package com.itcast.demo1;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//1 �����ȡ
		Person p=new  Person();
		Class c1=p.getClass();
		System.out.println(c1);//��ӡ����ȫ����
		//2  ������ȡ
		//ÿһ�����ͣ��������������ã����ḳ���������һ����̬������,��������.class
		Class c2=Person.class;
		System.out.println("\n��ʽ2��"+c2);
		System.out.println(c1==c2?"���":"�����");
		System.out.println(c1.equals(c2)?"���":"�����");
		
		//3  Class��ľ�̬������ȡ		forName();
		Class c3=Class.forName("com.itcast.demo1.Person");
		System.out.println("\nC3:"+c3);
	}
	
}
