package Calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

/**calender类封装日历信息，主要作用在于其方法可以对时间分量进行运算；
 * 						是一个抽象类，其具体子类针对不同国家的日历系统，其中应用组广泛是GregorianCalendar（格里高里历，对应世界上大多数国家的标准日历系统）
 * @author Feng
 * 只要获取时间钟的分量，时间，计算等就可以用，比时间类：date类强大 
 */
public class calendar {
	/**
	 * Calendar类的测试方法
	 */
	//@Test
	public void CalendarTest(){
		/*******Calendar类是一个抽象类，，不能直接实例化********/
		Calendar c=Calendar.getInstance();
		/**GeogorianCaldenar类是calendar的子类，
		 * 可以直接实例化时间对象，同时指定具体时间**/
		//GregorianCalendar gc=new GregorianCalendar(2016,5-1,24);
		GregorianCalendar ga=new GregorianCalendar(2016,6-1,24,20,34);
		System.out.println(ga.getTime());
		/**getTime()方法：获得日历对象中的毫秒数，重新封装为一个Date类型对象中
		 * 
		 * 强调：日历计算中，月份是从0开始的，到十一月结束
		 * 			年：与现实保持不变
		 * 			月：比现实少一，因为是从0开始，11月就是最后一个月
		 * 			日：从1开始，到31结束
		 * 			时分秒：都是从0开始，到进制-1结束；和现实吻合，不需要加减一修正
		 * ***/
	}
	
	
	/**
	 * 获取时间中某个分量的值
	 */
	//@Test
	public void getTest(){
		
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		 int month=c.get(Calendar.MONTH)+1;//月加一修正
		 int date=c.get(Calendar.DATE);
		 int week=c.get(Calendar.DAY_OF_WEEK)-1;//取星期要-1修正
		 int hour=c.get(Calendar.HOUR);
		 int minute=c.get(Calendar.MINUTE);
		 System.out.println(c.getTime());
		 System.out.println(year+"年"+month+"月"+date+"日  星期"+week+"\t"+hour+"时"+ minute+"分");
	}
	/*
	 * 强调：日期中的第二个坑：
	 * 星期的数值从1开始，但是    星期日为一周的第一天
	 * 				日		一		二		三		四		五		六
	 * 				1		2		3		4		5		6		7
	 * 所以要进行减一修正
	 */
	
	
	/**
	 * 设置时间某个分量的值
	 */
	@Test
	public void setTest(){
		/*时间计算三步走：取分量，做计算，set回分量
		 * 需求：计算下个月今天是星期几？*/
		Calendar c=Calendar.getInstance();
		/*int month=c.get(Calendar.MONTH);
		month+=1;
		c.set(Calendar.MONTH, month);*/
		
		
		c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);
		
		
		/*
		 * set方法直接修改原日期对象，不会创建新对象
		 */
		int week=c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("下个月今天是星期："+week);
	}
	
	/**
	 * 按月底倒推计算时间,获得每个月的最后一天getActualMaximum（）方法
	 */
	@Test
	public void getActualMaximumTest(){
		/*
		 * 需求：每月最后三天停止报销，求本月后一天报销的日期
		 * 思路：
		 * 			Step1:获得本月最后一天
		 * 			Step2:本月的最后一天-3
		 * 			Step3:设置回日立对象中
		 */
		/*Calendar c=Calendar.getInstance();//今天
		int maxData=c.getActualMaximum(Calendar.DATE);//获得本月最后一天
		maxData-=3;
		c.set(Calendar.DATE, maxData);*/
		//System.out.println(c.getTime());
		
		
		/*
		 * 需求变更：每个月最后三个工作日，停止报销。求可以报销的最后 一天？
		 * 思路：从最后一天开始，循环倒退3次
		 * 				判断每天的星期：
		 * 					如果碰到是周日（1），就一次倒退2天
		 * 					如果碰到事周六（7），就一次倒退1天
		 * 				每循环一次，固定都要倒退1天
		 */
		Calendar c=Calendar.getInstance();
		//将日期设置为最后一天
		c.set(Calendar.DATE, c.getActualMaximum(Calendar.DATE) );
		for(int i=0;i<3;i++){
			int week=c.get(Calendar.DAY_OF_WEEK);
			if(week==1){//周日
				c.set(Calendar.DATE,c.get(Calendar.DATE)-2);
			}else if(week==7){//周六
				c.add(Calendar.DATE , -1);
				//c.set(Calendar.DATE,c.get(Calendar.DATE)-1);
			}
			
		
		//每次循环一次，日期向前倒退1天
		c.set(Calendar.DATE,c.get(Calendar.DATE)-1);
		}
		System.out.println(c.getTime());
	}
	
	
	
	/**
	 * void add(int field,int mount)为给定的时间分量的值加上给定得值，若给定的值为负数则是减去给定的值
	 * 												可以避免三步走，但是getActualMaximum()方法是独特的
	 */
	
	/**
	 * Date getTime():使用Date描述Calendar表示的日期并且返回，将Calendar类型转换为date 类型
	 * Void setTime(Date d)：是Calendar表示date所描述的日期，将date类型转换为Calendar类型
	 * SimpleDateFormat（）：格式化的时间翻译器，不论是人写的时间给机器看还是机器的时间给人看，都得用其转换；而且时间翻译器只是别date类型的时间
	 */
	/**
	 * 计算合同续签时间
	 * @throws ParseException 
	 */
	//@Test
	public void ContractTest() throws ParseException{
		String hiredate="2012-4-29";
		//只要日期格式转换就要使用SimpleDateFormat("···")转换器对象，里面有两个主要方法：parse（String）方法，从文本获取时间；Format（目标时间）方法，转换为简易时间输出
		SimpleDateFormat sdf=new  SimpleDateFormat ("y-M-d");
		//得到时间中的事件对象
		Date d=sdf.parse(hiredate);
		//只要进行复杂的时间计算，就要使用Calendar类型
		Calendar c=Calendar.getInstance();
		/*将Date类型的对象，转化为Calendar类型的对象*/
		c.setTime(d);;//setTime()方法直接修改原日历对象，不需要变量接住
		//Step1:计算合同结束时间：+3年
		c.add(Calendar.YEAR, 3);
		//将Calendar类型的对象，转换为Date类型的对象
		//因为format 方法，只认date类型变量
		String str=sdf.format(c.getTime());
		System.out.println("合同结束时间："+str);
		//step2:计算续签时间，结束时间-1月
		c.add(Calendar.MONTH, -1);
		//获得续签日期的星期
		int week=c.get(Calendar.DAY_OF_WEEK);
		if(week==1){
			c.add(Calendar.DATE, -2);
		}else if(week==7){
			c.add(Calendar.DATE, -1);
		}
		str=sdf.format(c.getTime());
		System.out.println("合同结束时间："+str);
		//step3:计算提醒续签时间，续签日期-7
		//c.add(Calendar.DATE,-7);
		c.add(Calendar.WEEK_OF_MONTH,-1);//一个月的星期-1
		str=sdf.format(c.getTime());
		System.out.println("提醒续签时间："+str);
	}
	
}



