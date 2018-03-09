package Demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Reflect1 {

	public static Student createStu(){
		final  Student stu=new Student();
		final Person person=new Person();
		Student proxyStu=(Student) Proxy.newProxyInstance(Reflect1.class.getClassLoader(), stu.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args ) throws Throwable {
				//前执行
				person.worker(1000);
				//中间执行
				Object invoke = method.invoke(stu, args);
				person.getInfo();
				return null;
			}
		});
		
		return proxyStu;
	}
	
}
