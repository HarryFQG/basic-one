package com.itcast.demo1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**					泛型的擦除
 *  需求：
 *  	定义集合类，泛型String
 *  	要求向集合中添加Integer类型
 * @author Feng
 * 反射方式：获取出集合ArrayList类的class文件对象
 * 		通过class文件对象，调用add方法
 * 
 * 考查：对集合的理解
 */
public class ReflectDemo9 {

	public static void main(String[] args) throws Exception {
		ArrayList<String> list=new ArrayList<String>();
		list.add("String1");
		//list.add(1);报错
		//反射方式，获取出集合ArrayList类的class文件对象
		Class c=list.getClass();
		//获取ArrayList.class文件中的方法add
		Method method = c.getMethod("add", Object.class);
		System.out.println(method);
		//使用invoke运行ArrayList方法add
		method.invoke(list, 15);
		method.invoke(list, 150);
		method.invoke(list, 1500);
		System.out.println(list);
		
		
	}
	
	
}
