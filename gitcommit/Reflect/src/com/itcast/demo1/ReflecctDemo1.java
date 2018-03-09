package com.itcast.demo1;

import java.lang.reflect.Constructor;

/**
 * 通过反射获取class文件中的构造方法，运行构造方法
 * 运行构造方法，创建对象
 * @author Feng
 * 步骤:
 *		第一步：获取class文件
 *		第二步：从class 文件对象中，获取需要的成员
 *
 *Constructor 描述构造对象类
 *
 */
public class ReflecctDemo1 {
	public static void main(String[] args) throws Exception {
		//步骤一：
		Class c=Class.forName("com.itcast.demo1.Person");//
		//使用class文件对象，获取类中的构造方法
		//获得构造器的第一种：Constructor[]  getConstructors	获取class文件对象中的所有公共权限（public）的构造方法。
		Constructor[] constructors = c.getConstructors();
		for(Constructor cons:constructors){
			System .out.println(cons);			
		}
		
		//获得构造器的第二种：
		//		获得指定的构造方法，空参数的构造方法
		
		Constructor cons=	c.getConstructor();
		System.out.println(cons);
		//运cons空参数构造方法，Constructor类的方法newInstance()运行获取到的构造方法
		Object obj = cons.newInstance();
		System.out.println(obj);
		Person p=(Person)obj;
		p.eat();
	
	
	}
}
