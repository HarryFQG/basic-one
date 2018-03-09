package com.itcast.demo1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**					���͵Ĳ���
 *  ����
 *  	���弯���࣬����String
 *  	Ҫ���򼯺������Integer����
 * @author Feng
 * ���䷽ʽ����ȡ������ArrayList���class�ļ�����
 * 		ͨ��class�ļ����󣬵���add����
 * 
 * ���飺�Լ��ϵ����
 */
public class ReflectDemo9 {

	public static void main(String[] args) throws Exception {
		ArrayList<String> list=new ArrayList<String>();
		list.add("String1");
		//list.add(1);����
		//���䷽ʽ����ȡ������ArrayList���class�ļ�����
		Class c=list.getClass();
		//��ȡArrayList.class�ļ��еķ���add
		Method method = c.getMethod("add", Object.class);
		System.out.println(method);
		//ʹ��invoke����ArrayList����add
		method.invoke(list, 15);
		method.invoke(list, 150);
		method.invoke(list, 1500);
		System.out.println(list);
		
		
	}
	
	
}
