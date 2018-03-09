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
		System.out.println("代码块");
	}
	static{
		System.out.println("静态代码块");
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
		System.out.println("人可以自己做饭吃");
	}
	
	public void sleep(int a,String s,double d){
		System.out.println("睡觉:"+a+",---"+s+",---"+d);
	}
	
	private void run(int i,String str){
		System.out.println("奔跑"+","+i+str);
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", f=" + f + "]";
	}
	
}
