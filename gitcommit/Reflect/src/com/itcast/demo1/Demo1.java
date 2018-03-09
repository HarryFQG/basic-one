package com.itcast.demo1;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//1 对象获取
		Person p=new  Person();
		Class c1=p.getClass();
		System.out.println(c1);//打印的是全类名
		//2  类名获取
		//每一个类型，包括基本和引用，都会赋予这个类型一个静态的属性,属性名字.class
		Class c2=Person.class;
		System.out.println("\n方式2："+c2);
		System.out.println(c1==c2?"相等":"不想等");
		System.out.println(c1.equals(c2)?"相等":"不想等");
		
		//3  Class类的静态方法获取		forName();
		Class c3=Class.forName("com.itcast.demo1.Person");
		System.out.println("\nC3:"+c3);
	}
	
}
