package dateTest17_3_31;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class DateTest {
	/**
	 * date���͵Ĳ��Է���
	 */
	//@Test
	public void datetest(){
		Date d=new Date();
		/*ʵ�����˶�������������£�
		 * 		1��ʵ����һ���������͵Ķ���ʹ��ǰ��Ҫʵ�����������͵Ķ���
		 * 		2����õ�ǰϵͳʱ�����1970��Ԫ���ĺ���������õ�ǰϵͳʱ�� 
		 */
		
		/*getTime()�������Ի��date�����з�װ�ľ��뵱ǰϵͳ����1970��Ԫ���ĺ�����*/
		System.out.println(d.getTime());
		
		
		/*
		 * ����1������ʱ����ƣ��������ǰ�����
		 * 			step1:������/1000/60/60/24/365       �ꣿ
		 *									��		��	  ʱ   ��   ��
		 *ǿ�����������õ��̲������2017���õ��Ľ��Ǻ�1970�����ݲ�
		 * 
		 */
		long years=d.getTime()/1000/60/60/24/365;//ֵΪ����1970�����ݲ�
		System.out.println(years);
		System.out.println("�����ǣ�"+(years+1970)+"�ꡣ");
		
		/*
		 * ����2������long�����ܹ�����ʱ�������
		 * 			step1:���long���͵����ֵ---��Long.MAX_VALUE
		 * 			step2:���ݽ��ƻ�������
		 * 			step3����1970+��ֲ�
		 */
		long max=Long.MAX_VALUE;
		years=max/1000/60/60/24/365;
		System.out.println("�����ǣ�"+(years+1970)+"�ꡣ");
		
		/*����3������date�����еĺ�����Ϊ0
		 * 			step1:
		 *
		 *ǿ������Ϊ���ڶ����еĺ���������final���͵�
		 *			setTime()����ֱ���޸Ķ����еĺ����������ط����µ����ڶ���
		 */
		d.setTime(0);
		System.out.println(d);//��Ĭ�ϵĸ�ʽ���ʱ���ʽ
		//Thu   Jan   01   08:00:00    CST   1970
		//����   �·�  ��    ʱ  ��  ��    ʱ��
		
		/**
		 * ����4����������һ���Ż�ȯ��8��������Ч�����ڰ��죩����Ч�ڵ����һ�죿
		 * 			���ڼ���Ĺ̶�ģʽ��
		 * 					step1����õ�ǰʱ��ĺ�����
		 * 					step2:����ʱ�����ĺ��������ú������Ӽ�		
		 * 					step3�����������ĺ�����setTime���������ڶ�����
		 */
		d=new Date();
		long time =d.getTime()+(8*24*60*60*1000);//���ǼӼ�һ������
		d.setTime(time);
		System.out.println(d);
		
		
		/**����5
		 * �������ڶ���Ƚ����
		 */
		Date d1=new Date();
		Date d2=new Date();
		System.out.println(d1.getTime()==d2.getTime()?"���������":"�����");
		System.out.println(d1.equals(d2)?"�������":"���ڲ����");
		//���ڵıȽϲ��������Ⱥţ�Ҫ��equals������
		
	}
	
	
	/**
	 * �������ʱ����˿������ǽ������ʱ��ת��Ϊ�ַ���
	 */
	//@Test
	public void formatTest(){
		/*ֻҪת�����ڵĸ�ʽ����Ҫ��simpleDateFormat��
		 * 			�����û����������ʱ���ʽ
		 * 		 */
		SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		Date d=new Date();
		String str=sdf.format(d);//���ص���һ����ʽ�������ַ���
		System.out.println(str);
		String format="yyyy��MM��dd�� E a hh:mm:ss";//Ҳ�ɼ�д�ɣ�"y��M��d�� E a h:m:s"
		SimpleDateFormat  sdf1=new SimpleDateFormat(format);
		str=sdf1.format(d);//���ص���һ����ʽ�������ַ���
		System.out.println(str);
	}
	
	
	
	/**
	 * ���ַ���ת��Ϊ�����ʱ���ʽ����Ҫ��parse
	 * @throws ParseException 
	 */
	@Test
	public void parseTest() throws ParseException{
		Scanner sc=new Scanner(System.in);
		String inputStr= sc.nextLine();
		//Date d=new Date();
		/**
		 * �������ʱ��ת��Ϊ�����ʱ��
		 * 			step1��ʵ����һ��simpleDateFormat���󣬹涨�����ʱ���ʽ
		 * 			step2��ʹ��parse()��������������ַ���ת��Ϊһ��Date���͵Ķ���
		 * ǿ�������������ַ�����涨��ģʽ��ƥ�䣬�ͻ��׳��쳣
		 */
		//String format="yyyy��MM��dd�� E a hh:mm:ss";
		//��ʾ�����û�����ʱ���ǣ�Խ��Խ��
		String format="y/M/d";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
	
			Date d=sdf.parse(inputStr);
		
		
		System.out.println(d.getTime());
		System.out.println(sdf.format(d));
	}

}
