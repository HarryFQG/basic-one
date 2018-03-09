package com.it.inner5Closure;

public class Test1 {
	public static void main(String[] args) {
		Student stu1=new Student();
		Teacher tea=new Teacher();
		System.out.println("老师不知题目："+10+"+"+10);
		Integer i=tea.waiting(stu1,10,10);
		System.out.println("结果是:"+i);
	}
}
