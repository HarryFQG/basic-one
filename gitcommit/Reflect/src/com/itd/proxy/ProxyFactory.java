package com.itd.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	public static UserDao createUserServiceProxy(){
		final UserDao user=new UserDaoImpl();
		final Aspect1 aspect1=new Aspect1();
		UserDao userProxy=(UserDao) Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), user.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] obj) throws Throwable {
				aspect1.before();
				Object invoke = method.invoke(user, obj);
				for(Object i:obj){
					System.out.println("IL:"+i);
				}
				aspect1.after();
				System.out.println("invoke:"+invoke);
				//��������Ķ����з��صĲ������������
				return invoke;
			}
		});
		return userProxy;
	}
	
	
}
