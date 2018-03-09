package Calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

/**calender���װ������Ϣ����Ҫ���������䷽�����Զ�ʱ������������㣻
 * 						��һ�������࣬�����������Բ�ͬ���ҵ�����ϵͳ������Ӧ����㷺��GregorianCalendar���������������Ӧ�����ϴ�������ҵı�׼����ϵͳ��
 * @author Feng
 * ֻҪ��ȡʱ���ӵķ�����ʱ�䣬����ȾͿ����ã���ʱ���ࣺdate��ǿ�� 
 */
public class calendar {
	/**
	 * Calendar��Ĳ��Է���
	 */
	//@Test
	public void CalendarTest(){
		/*******Calendar����һ�������࣬������ֱ��ʵ����********/
		Calendar c=Calendar.getInstance();
		/**GeogorianCaldenar����calendar�����࣬
		 * ����ֱ��ʵ����ʱ�����ͬʱָ������ʱ��**/
		//GregorianCalendar gc=new GregorianCalendar(2016,5-1,24);
		GregorianCalendar ga=new GregorianCalendar(2016,6-1,24,20,34);
		System.out.println(ga.getTime());
		/**getTime()������������������еĺ����������·�װΪһ��Date���Ͷ�����
		 * 
		 * ǿ�������������У��·��Ǵ�0��ʼ�ģ���ʮһ�½���
		 * 			�꣺����ʵ���ֲ���
		 * 			�£�����ʵ��һ����Ϊ�Ǵ�0��ʼ��11�¾������һ����
		 * 			�գ���1��ʼ����31����
		 * 			ʱ���룺���Ǵ�0��ʼ��������-1����������ʵ�Ǻϣ�����Ҫ�Ӽ�һ����
		 * ***/
	}
	
	
	/**
	 * ��ȡʱ����ĳ��������ֵ
	 */
	//@Test
	public void getTest(){
		
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		 int month=c.get(Calendar.MONTH)+1;//�¼�һ����
		 int date=c.get(Calendar.DATE);
		 int week=c.get(Calendar.DAY_OF_WEEK)-1;//ȡ����Ҫ-1����
		 int hour=c.get(Calendar.HOUR);
		 int minute=c.get(Calendar.MINUTE);
		 System.out.println(c.getTime());
		 System.out.println(year+"��"+month+"��"+date+"��  ����"+week+"\t"+hour+"ʱ"+ minute+"��");
	}
	/*
	 * ǿ���������еĵڶ����ӣ�
	 * ���ڵ���ֵ��1��ʼ������    ������Ϊһ�ܵĵ�һ��
	 * 				��		һ		��		��		��		��		��
	 * 				1		2		3		4		5		6		7
	 * ����Ҫ���м�һ����
	 */
	
	
	/**
	 * ����ʱ��ĳ��������ֵ
	 */
	@Test
	public void setTest(){
		/*ʱ����������ߣ�ȡ�����������㣬set�ط���
		 * ���󣺼����¸��½��������ڼ���*/
		Calendar c=Calendar.getInstance();
		/*int month=c.get(Calendar.MONTH);
		month+=1;
		c.set(Calendar.MONTH, month);*/
		
		
		c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);
		
		
		/*
		 * set����ֱ���޸�ԭ���ڶ��󣬲��ᴴ���¶���
		 */
		int week=c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("�¸��½��������ڣ�"+week);
	}
	
	/**
	 * ���µ׵��Ƽ���ʱ��,���ÿ���µ����һ��getActualMaximum��������
	 */
	@Test
	public void getActualMaximumTest(){
		/*
		 * ����ÿ���������ֹͣ���������º�һ�챨��������
		 * ˼·��
		 * 			Step1:��ñ������һ��
		 * 			Step2:���µ����һ��-3
		 * 			Step3:���û�����������
		 */
		/*Calendar c=Calendar.getInstance();//����
		int maxData=c.getActualMaximum(Calendar.DATE);//��ñ������һ��
		maxData-=3;
		c.set(Calendar.DATE, maxData);*/
		//System.out.println(c.getTime());
		
		
		/*
		 * ��������ÿ����������������գ�ֹͣ����������Ա�������� һ�죿
		 * ˼·�������һ�쿪ʼ��ѭ������3��
		 * 				�ж�ÿ������ڣ�
		 * 					������������գ�1������һ�ε���2��
		 * 					���������������7������һ�ε���1��
		 * 				ÿѭ��һ�Σ��̶���Ҫ����1��
		 */
		Calendar c=Calendar.getInstance();
		//����������Ϊ���һ��
		c.set(Calendar.DATE, c.getActualMaximum(Calendar.DATE) );
		for(int i=0;i<3;i++){
			int week=c.get(Calendar.DAY_OF_WEEK);
			if(week==1){//����
				c.set(Calendar.DATE,c.get(Calendar.DATE)-2);
			}else if(week==7){//����
				c.add(Calendar.DATE , -1);
				//c.set(Calendar.DATE,c.get(Calendar.DATE)-1);
			}
			
		
		//ÿ��ѭ��һ�Σ�������ǰ����1��
		c.set(Calendar.DATE,c.get(Calendar.DATE)-1);
		}
		System.out.println(c.getTime());
	}
	
	
	
	/**
	 * void add(int field,int mount)Ϊ������ʱ�������ֵ���ϸ�����ֵ����������ֵΪ�������Ǽ�ȥ������ֵ
	 * 												���Ա��������ߣ�����getActualMaximum()�����Ƕ��ص�
	 */
	
	/**
	 * Date getTime():ʹ��Date����Calendar��ʾ�����ڲ��ҷ��أ���Calendar����ת��Ϊdate ����
	 * Void setTime(Date d)����Calendar��ʾdate�����������ڣ���date����ת��ΪCalendar����
	 * SimpleDateFormat��������ʽ����ʱ�䷭��������������д��ʱ������������ǻ�����ʱ����˿�����������ת��������ʱ�䷭����ֻ�Ǳ�date���͵�ʱ��
	 */
	/**
	 * �����ͬ��ǩʱ��
	 * @throws ParseException 
	 */
	//@Test
	public void ContractTest() throws ParseException{
		String hiredate="2012-4-29";
		//ֻҪ���ڸ�ʽת����Ҫʹ��SimpleDateFormat("������")ת��������������������Ҫ������parse��String�����������ı���ȡʱ�䣻Format��Ŀ��ʱ�䣩������ת��Ϊ����ʱ�����
		SimpleDateFormat sdf=new  SimpleDateFormat ("y-M-d");
		//�õ�ʱ���е��¼�����
		Date d=sdf.parse(hiredate);
		//ֻҪ���и��ӵ�ʱ����㣬��Ҫʹ��Calendar����
		Calendar c=Calendar.getInstance();
		/*��Date���͵Ķ���ת��ΪCalendar���͵Ķ���*/
		c.setTime(d);;//setTime()����ֱ���޸�ԭ�������󣬲���Ҫ������ס
		//Step1:�����ͬ����ʱ�䣺+3��
		c.add(Calendar.YEAR, 3);
		//��Calendar���͵Ķ���ת��ΪDate���͵Ķ���
		//��Ϊformat ������ֻ��date���ͱ���
		String str=sdf.format(c.getTime());
		System.out.println("��ͬ����ʱ�䣺"+str);
		//step2:������ǩʱ�䣬����ʱ��-1��
		c.add(Calendar.MONTH, -1);
		//�����ǩ���ڵ�����
		int week=c.get(Calendar.DAY_OF_WEEK);
		if(week==1){
			c.add(Calendar.DATE, -2);
		}else if(week==7){
			c.add(Calendar.DATE, -1);
		}
		str=sdf.format(c.getTime());
		System.out.println("��ͬ����ʱ�䣺"+str);
		//step3:����������ǩʱ�䣬��ǩ����-7
		//c.add(Calendar.DATE,-7);
		c.add(Calendar.WEEK_OF_MONTH,-1);//һ���µ�����-1
		str=sdf.format(c.getTime());
		System.out.println("������ǩʱ�䣺"+str);
	}
	
}



