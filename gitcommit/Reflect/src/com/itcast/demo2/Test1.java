package com.itcast.demo2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 		学生类去调用Worker、Person对象的方法
 * 		问题：类不清楚，方法也不清楚
 * 		解决：通过配置文件实现此功能
 * 					运行的类名和方法名字，以键值对的形式，写在文本中。运行哪个类，读取配置文件即可。
 * 		实现步骤：
 * 				step1:准备配置文件，键值对
 * 				step2:IO流读取配置文件 Reader
 * 				step3:文件中的键值对存储到集合中的Properties
 * 						  集合保存的键值对，就是类名和方法名
 * 				step4:反射获取指定类的class文件对象
 * 				step5:class文件对象，获取指定的方法
 * 				step6:运行方法
 * @author Feng
 *
 */
public class Test1 {
	
	public static void main(String[] args) throws Exception, SecurityException {
		//IO流读取配置文件
		FileReader r=new FileReader("config.properties");
		//创建集合对象
		Properties p=new Properties();
		//调用集合方法load,传递流对象
		p.load(r);
		r.close();
		//通过键获取值
		String className=p.getProperty("className");
		String methodName=p.getProperty("methodName");
		//反射获取指定类的class文件对象
		Class  c = Class.forName(className);
		Object obj = c.newInstance();
		//获取指定的方法名
		Method method = c.getMethod(methodName);
		method.invoke(obj);
		
		
		
		
		
		
		
	}
	
}
