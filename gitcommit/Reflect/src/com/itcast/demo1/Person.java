package com.itcast.demo1;

import java.util.Date;

public class Person {
	public int s;
	public String name;
	public Date d;
	public boolean b;
	public double d1;
	private int age;
	private float f;
	
	
	
	
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(){}
	{
		System.out.println("�����");
	}
	static{
		System.out.println("��̬�����");
	}
	public Person(String name,int age,float f ){
		this.name=name;
		this.age=age;
		this.f=f;
	}
	private Person(int age,String name ,float f ){
		this.name=name;
		this.age=age;
		this.f=f;
	}
	
	public void eat(){
		System.out.println("�˿����Լ�������");
	}
	
	public void sleep(int a,String s,double d){
		System.out.println("˯��:"+a+",---"+s+",---"+d);
	}
	
	private void run(int i,String str){
		System.out.println("����"+","+i+str);
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", f=" + f + "]";
	}
	
}
