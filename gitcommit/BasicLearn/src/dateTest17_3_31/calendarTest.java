package dateTest17_3_31;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class calendarTest {
	/**
	 * ��ȡʱ���е�ĳ��������ֵ
	 */
	//@Test
	public void getTest(){
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;//�·�Ҫ��1
		int date=c.get(Calendar.DATE);
		int week=c.get(Calendar.DAY_OF_WEEK)-1;//��ȡ������Ҫ��һ��������
		int hour=c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		System.out.println(year+"��"+month+"��"+date+"��  ����"+week+ "   "+hour+":"+minute);
		/**
		 * ǿ����
		 * 		��һ���ӣ��·ݵļ�1��������Ϊ�Ǵ�0��ʼ����11����
		 * 
		 * 		�����еĵڶ�����
		 * 			���ڵ���ֵ�Ǵ�1��ʼ�ġ�����������Ϊһ�ܵĵ�һ��
		 * 			��		һ		��		��		��		��		��
		 * 					1
		 */
		
	}
	
	
	/**
	 * ����ʱ��ĳ��������ֵ
	 */
	//@Test
	public void setTest(){
		/*
		 * �������裺
		 * 			step1:��ȡʱ��
		 * 			step2:������
		 * 			step3:set��ʱ��
		 */
		//���󣺼����¸��µĽ��������ڼ���
		Calendar c=Calendar.getInstance();
		int month =c.get(Calendar.MONTH);
		month+=1;
		c.set(Calendar.MONTH, month);
		int week=c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("�¸��µĽ���������"+week);
		
	}
	
	
	/**
	 * ���µ׵��Ƽ���ʱ��
	 * int getActuaMaxmum(int field)������ĳ�������ϵ����ֵ
	 *
	 */
	//@Test
	public void getActuaMaxmumTest(){
		/**
		 * ����ÿ�µ��������ֹͣ���������µĿɱ�������
		 * ���裺
		 * 			step1:��ñ��µ����һ��
		 * 			step2���������һ��-3
		 * 			step3:���û�ʱ�������
		 */
		Calendar c=Calendar.getInstance();
		int maxDay=c.getActualMaximum(Calendar.DATE);
		//System.out.println(maxDay);
		c.set(Calendar.DATE, maxDay-3);
		//System.out.println(c.getTime());
		/**
		 * ��������ÿ�����������������ֹͣ�����������������
		 *���裺
		 *			step1:�����һ�쿪ʼ��ѭ������3��
		 *							�ж�ÿһ������ڣ�
		 *									����������գ�1������һ�ε���2��
		 *									�������������7��;��һ�ε���1��
		 *								ÿѭ��һ�Σ��̶���Ҫ����1��
		 *	
		 */
		c=Calendar.getInstance();
		c.set(Calendar.MONTH,5-1);
		c.set(Calendar.DATE,c.getActualMaximum(Calendar.DATE));//����������Ϊ���µ����һ��
		for(int i=0;i<=3;i++){
			int week=c.get(Calendar.DAY_OF_WEEK);
			if(week==1){//������
				c.set(Calendar.DATE,c.get(Calendar.DATE)-2);
			}else if(week==7){//������
				c.set(Calendar.DATE,c.get(Calendar.DATE)-1);
			}
			
			//ÿѭ��һ�Σ�������ǰ����һ��
			if(i!=3){
			//c.set(Calendar.DATE,c.get(Calendar.DATE)-1);
				c.add(Calendar.DATE,-1);//��Ч������һ�����}			
		}
		System.out.println(c.getTime());
		}
	
	}
	
	/**
	 * 						setTime()������ getTime()����
	 * Date getTime()
	 * 			ʹ��Date����Calendar��ʾ�����ڲ�����
	 * void setTime(Date())
	 * 			ʹ��Calendar��ʾDate������������
	 * 
	 * 							ͨ��Date�����������ڣ��ڻ�ȡ����
	 * 	Calendar calendar=Calendar.getInstance();
	 * 	Date date=new Date();
	 * 	calendar.setTime(date);
	 * 	date=calendar.getTime();
	 * 
	 * 
	 * SimpleDateFormat���������ܵ��βξ���Date���ͣ�������Calendar����
	 * 
	 */
	
	/*
	 * �����ĸ���
	 * 			1����ǩ������ǰһ������
	 * 			2�������ǩ������������������ǰһ��������
	 * 			3��������ǩ����
	 * 			4��
	 */
	
	/**
	 * ��ͬ��ǩʱ��
	 */
	//@Test
	public void contractTest(){
		String hireDate="2014-4-29";//��ְʱ��
		//ֻҪ�����ڸ�ʽ��ת����Ҫʹ��SimpleDateFormat����
		SimpleDateFormat sdf=new SimpleDateFormat("y-M-d");
		//��ý���õ�ʱ��תΪ���������ʱ��
		try {
			Date d=sdf.parse(hireDate);
			//ֻҪ�ǽ��и��ӵ�ʱ����㣬��Ҫʹ��Calendar ���͵Ķ���
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(d);
			//step1:�����ͬ������ʱ��+3
			calendar.add(Calendar.YEAR, 3);
			//System.out.println(calendar.getTime());
			
			//��calendar���͵Ķ���ת��ΪDate���͵Ķ�����ΪForDate f������ֻ��Date���Ͷ���
			String str=sdf.format(calendar.getTime());
			//System.out.println(str);�����2015-4-29
			//step2:������ǩʱ�䣺����ʱ��-1��
			calendar.add(Calendar.MONTH,-1);
			//�����ǩ���ڵ�����
			int week=calendar.get(Calendar.DAY_OF_WEEK);
			if(week==1){//���գ���������
				calendar.add(Calendar.DATE, -2);				
			}else if(week==7){//����������һ��
				calendar.add(Calendar.DATE, -1);				
			}
			str=sdf.format(calendar.getTime());
			System.out.println(str);
			//step3������������ǩʱ�䣺��ǩʱ��-7
			calendar.add(Calendar.DATE, -7);//��Ч��䣺calendar.get(Calendar.WEEK_OF_MONTH,-1);
			str=sdf.format(calendar.getTime());
			System.out.println("׼����ǩʱ�䣺"+str);
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * ����1000���Ľ��������죿
	 */
	
	@Test
	public void numberTest(){
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.YEAR, -2);//2015-9-14
		calendar.add(Calendar.MONTH, 5);
		calendar.add(Calendar.DATE, 10);
		calendar.add(Calendar.DATE, 1000);
		String formate="y-M-d";
		SimpleDateFormat sdf=new SimpleDateFormat(formate);
		Date date=new Date();
		String str=sdf.format(calendar.getTime());
		System.out.println(str);
	}
}
