package com.itcast.demo1;

import java.lang.reflect.Method;

/**
 * 	�����ȡ��Ա����������
 * 		����public void eat();
 * @author Feng
 *
 */
public class ReflectDemo6 {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.itcast.demo1.Person");
		//��ȡclass�����еĳ�Ա������
		/*			getMethod()��ȡ����class�ļ��е����й����ķ����������̳е�
		 * 			method����������Ա�����Ķ���
		 */
		Object obj=c.newInstance();
		Method[] m1 = c.getMethods();//ֻ���ǹ����ġ��̳еķ���
		for(Method m:m1){
			System.out.println(m);
		}
		
		//��ȡָ���ķ���eat����
		//Method getMethod(String methodName,�����Ĳ����б�);�����б���˳��
		Method method = c.getMethod("eat");
		System.out.println("\n����ָ���ķ�����"+method);
		//ʹ��Method���invoke(Object obj,Object...obj)���з���
		Object invoke = method.invoke(obj);
		System.out.println(invoke);
	}
	
	
}
