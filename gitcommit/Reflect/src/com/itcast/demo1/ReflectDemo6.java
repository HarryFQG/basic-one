package com.itcast.demo1;

import java.lang.reflect.Method;

/**
 * 	反射获取成员方法并运行
 * 		运行public void eat();
 * @author Feng
 *
 */
public class ReflectDemo6 {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		//获取class对象中的成员方法：
		/*			getMethod()获取的是class文件中的所有公共的方法，包括继承的
		 * 			method类是描述成员方法的对象
		 */
		Object obj=c.newInstance();
		Method[] m1 = c.getMethods();//只能是公共的、继承的方法
		for(Method m:m1){
			System.out.println(m);
		}
		
		//获取指定的方法eat运行
		//Method getMethod(String methodName,方法的参数列表);参数列表有顺序
		Method method = c.getMethod("eat");
		System.out.println("\n运行指定的方法："+method);
		//使用Method类的invoke(Object obj,Object...obj)运行方法
		Object invoke = method.invoke(obj);
		System.out.println(invoke);
	}
	
	
}
