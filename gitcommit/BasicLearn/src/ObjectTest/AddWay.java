package ObjectTest;

import java.util.Scanner;

import org.junit.Test;

/**
 *��:��Сѧ�����ӷ�
 *API:1:������ʽ��matches��ƥ�䣬���������(regex)����
 *	  2�����		��split����֣����룩(regex);
 *
 *��:�Զ�װ���������Ĳ���
 */
public class AddWay {
	/**
	 * ��Сѧ�����ӷ�
	 */
	//@Test
	public void addTest(){
		//Step1:ʵ����scanner����
		Scanner sc=new Scanner(System.in);
		//Step2:Ҫ�뷴������͵�����ѭ��
		while(true){
			//Step2:��ʾ���벢�һ�������ַ���
			System.out.println("������ӷ���ʽ��");
			String input=sc.next();
			//Step4:�ж��Ƿ��˳�
			if(input.equals("exit")){
				System.out.println("С�����ټ�������");
				break;
			}else{ 
				//Step5:��֤������ַ�����ʽ   ��ֻҪ��֤������ַ����ĸ�ʽһ�㶼��������ʽ��
				//������ʽ(regex)��\d+��\+\d+��+[���ĸ��Ӻű�ʾԲ�������ٳ���һ�Ρ�"\+"ת��Ϊ��ͨ�ַ�]
				if(input.matches("\\d+(\\+\\d+)+")){
					//Step6���ԼӺ�Ϊ�ָ�������ַ���
					String[] nums=input.split("\\+");
					//�ӣ������쳣
					//ԭ��split�����Ĳ�����һ��������ʽ��
					//    "+"������ʽ�������⺬��
					//	   Ҫ�ԡ�+��ԭ����Ϊ�ָ����ʹ�á�\��ת��
					//Step7:���������������������ַ��������ۼӵ���������sum��
					int sum=0;
					for(String f:nums ){
						/*�����ַ�������ǰ�������õ�����ת��*/
						sum +=Integer.parseInt(f);
					}
					//Step8:���������
					System.out.println("="+sum);
					
				}else{
					System.out.println("������Ĺ�ʽ��ʽ����");
				}
			}
			
			
		}
	}
	
	
	/**
	 * �Զ�װ���������Ĳ���
	 */
	@Test
	public void autoboxTest(){
		Integer a=100;//װ��
		//��Ч��
		a=new Integer(100);
		Integer b=200;//װ�����
		//��Ч��
		b=new Integer(200);
		Integer c=a+b;//�Ȳ��䣬��װ�䡣
		//��+����������ʵ�ʶ����ڽ�����ֵ���㡣
		//���䣺 a.intValue() ���Ӷ�����ȡ����ֵ
		//	   b.intValue();�Ӷ�����ȡ����ֵ
		//	   a����ֵ+b����ֵ=��ֵ
		//װ�䣺new Intgeter(a����ֵ+b����ֵ=��ֵ) ����ֵ ��װ����װ����
		System.out.println(c);
		double d=c;//����   		��ߣ����������		�ұ�:����
		//��Ч��
		d=c.doubleValue();//�Ӷ���c ȡ����ֵ��ת��Ϊdouble��������
		System.out.println(d);//װ��   d�ǻ������ͣ�println��object���Ĳ�����object����
		//new Double��d��-->object 
	}
	
	
}
