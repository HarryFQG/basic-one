package com.itcast.demo2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 		ѧ����ȥ����Worker��Person����ķ���
 * 		���⣺�಻���������Ҳ�����
 * 		�����ͨ�������ļ�ʵ�ִ˹���
 * 					���е������ͷ������֣��Լ�ֵ�Ե���ʽ��д���ı��С������ĸ��࣬��ȡ�����ļ����ɡ�
 * 		ʵ�ֲ��裺
 * 				step1:׼�������ļ�����ֵ��
 * 				step2:IO����ȡ�����ļ� Reader
 * 				step3:�ļ��еļ�ֵ�Դ洢�������е�Properties
 * 						  ���ϱ���ļ�ֵ�ԣ����������ͷ�����
 * 				step4:�����ȡָ�����class�ļ�����
 * 				step5:class�ļ����󣬻�ȡָ���ķ���
 * 				step6:���з���
 * @author Feng
 *
 */
public class Test1 {
	
	public static void main(String[] args) throws Exception, SecurityException {
		//IO����ȡ�����ļ�
		FileReader r=new FileReader("config.properties");
		//�������϶���
		Properties p=new Properties();
		//���ü��Ϸ���load,����������
		p.load(r);
		r.close();
		//ͨ������ȡֵ
		String className=p.getProperty("className");
		String methodName=p.getProperty("methodName");
		//�����ȡָ�����class�ļ�����
		Class  c = Class.forName(className);
		Object obj = c.newInstance();
		//��ȡָ���ķ�����
		Method method = c.getMethod(methodName);
		method.invoke(obj);
		
		
		
		
		
		
		
	}
	
}
