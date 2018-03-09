package com.itcast.demo1;

import java.lang.reflect.Field;

/**
 * 反射获取成员变量，并修改值
 * Person类中的成员String name;
 * @author Feng
 *
 */
public class ReflectDemo5 {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		Object obj=c.newInstance();
		//如何获取成员变量？
		/*
		 * 获取成员变量Class类的方法getFields() class 文件中的所有公共成员变量
		 * 返回值是Field[]  	Field类描述变量对象的类
		 */
		
		Field[] f1 = c.getFields();//取类中公共的（public修饰）成员变量
		for(Field f: f1){
			Class<?> type = f.getType();
			
			
			//Object d = type.newInstance();
			System.out.println("------d--:"+type.toString());
			
			System.out.println(f+",-----"+f.getType());//输出：public java.lang.String com.itcast.demo1.Person.name
		}
		Field[] f2 = c.getDeclaredFields();//取类中所有的成员变量
		for(Field f: f2){
			System.out.println(f);//输出：public java.lang.String com.itcast.demo1.Person.name
		}
		
		//-------------------------------------------------------------
		//获取指定的成员变量 String name;
		//Class 类的方法 getField(传递字符串类型的变量)	获取指定的成员变量
		
		Field f3=c.getField("name");
		System.out.println("获得指定的成员变量:"+f3);
		//Field 类的方法 void set(Object obj,Object value),修改成员变量的值
		//Object obj	必须有对象的支持，Object value 修改后的值
		f3.set(obj, "王五");
		System.out.println(obj);
		
		
		
		
	}
}
