package com.itcast.demo1;

/**
 * 反射获取构造方法，快捷方式：
 * 		前提：
 * 				1  被反射的类必须具有空参数构造方法，
 * 				2  构造方法权限必须是公共权限（public）
 * 				
 * @author Feng
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		//Class类中定义方法,T newInstance()直接创建被反射类的对象实例
		
		Object obj = c.newInstance();
		
		System.out.println(obj);
		
		
		
	}
	
	
	
}
