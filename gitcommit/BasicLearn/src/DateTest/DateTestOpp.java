package DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTestOpp {
	
	
	//@Test
	public void dateTest(){
		
		/*Date ��д��toString()��������һ���ַ���������ǰDate��������ʾ��ʱ��
		 * Date��д��equals()���������ڱȽ�����ʱ���Ƿ���ȡ���ʵ�Ƚϵ�ʱ����1970Ԫ���ĺ������Ƿ����
		 * */
		Date d=new Date();
		
						/**getTime����ר�Ż��Date�����еĴ�1970��Ԫ�·ݵ����ڵķ�װ�ĺ�����*/
		System.out.println(d.getTime());
		/*���任��Ϊ�꣬��ǰΪ���룬1��=1000���룬����������*/
		long years=d.getTime()/1000/60/60/24/365;//getTime���ص���long����
		System.out.println("��1970�굽���������"+years+"�꣡");
		
		        	/**setTime����ר����������Date�����еĺ�����*/
		//����date�����еĺ�����Ϊ��
		d.setTime(0);//ǿ������Ϊ���ڶ����еĺ���������final���͵�
		//����setTime()����ֱ���޸Ķ����еĺ����������ط����µ����ڶ���
		
								/** ��дtoString()���� **/
		//Date��д��toString()��������һ���ַ�����������ǰdate��������ʾ��ʱ��
		System.out.println(d);//���ֱ�Ӵ�ӡd,����Ĭ�ϵĸ�ʽ������ڶ����е�ʱ���
		//�����Thu Jan 01 08:00:00 CST 1970
		//		����    ��   ��  ʱ ��  ��  ʱ��  ��  
	
		
		
	//��������һ���Ż�ȯ��8������Ч���õڰ��죩������Ч�����һ��
	/**
	 * �������̶���·��
	 * 		Step1:��õ�ǰʱ��ĺ�����
	 * 		Step2������ʱ�����ĺ��������ú��������Ӽ�
	 * 		Step3:������Ľ��������setTime�ع鵽������
	 */
		d=new Date();//��õ�ǰϵͳ��ʱ��
		System.out.println(d);
		long time=d.getTime()+(8-1)*24*60*60*1000;//ע���ʱ�������
		d.setTime(time);
		System.out.println(d);
	
	
	
	
								/**��дequals()����*/
	//���ڱȽ����������Ƿ����ֻ����equals������ʵ�ʱȽϾ���1970��ĺ������Ƿ���ȡ�����ʹ�á�==������Ϊʹ��ʱ�������ͣ��������ǵ�ַ������ֱ�ӡ�==��
	Date d1=new Date();
	Date d2=new Date(System.currentTimeMillis());
	System.out.println(d1.getTime()==d2.getTime()?"���������":"�����������");
	//System.out.println(d1==d2?"�������":"���ڲ����");
	System.out.println(d1.equals(d2)?"�������":"���ڲ����");
	}
	
	
	
	// ���������ʱ�������SimpleDateFormat������������������ʱ����prase()����
	
	/**
	 * �������ʱ����˿�
	 */
	@Test
	public void formatTest(){
		Date d=new Date();
		/*ֻҪת�����ڵĸ�ʽ����Ҫ��SimpleDateFormat����
		 * 1������java.text.SimpleDateFormat����
		 * 2�������û��������������ַ�����ģʽ
		 * */
		//Ҫ��4λ��2λ��2λ�� ���� ��/�� 12Сʱ��ʱ���֣���
		//String format="yyyy��MM��dd�� E a hh:mm:ss";
		//��Ч�ڣ����򻯰棩 ������ĳ��������Ϊ��λ�����ͻ�ȥ���������
		String format="y��M��d�� E a h:m:s";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		/*���ڶ�����˿���sdf.format(date)
		 * ���ظ�ʽ������ַ���
		 * */
		System.out.println(sdf.format(d));
	}
}
