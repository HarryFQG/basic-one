package dateTest17_3_31;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class calendarTest {
	/**
	 * 获取时间中的某个分量的值
	 */
	//@Test
	public void getTest(){
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;//月份要加1
		int date=c.get(Calendar.DATE);
		int week=c.get(Calendar.DAY_OF_WEEK)-1;//在取星期上要减一进行修正
		int hour=c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		System.out.println(year+"年"+month+"月"+date+"日  星期"+week+ "   "+hour+":"+minute);
		/**
		 * 强调：
		 * 		第一个坑：月份的加1修正。因为是从0开始，到11结束
		 * 
		 * 		日期中的第二个坑
		 * 			星期的数值是从1开始的。但是星期日为一周的第一天
		 * 			日		一		二		三		四		五		六
		 * 					1
		 */
		
	}
	
	
	/**
	 * 设置时间某个分量的值
	 */
	//@Test
	public void setTest(){
		/*
		 * 三个步骤：
		 * 			step1:获取时间
		 * 			step2:做计算
		 * 			step3:set回时间
		 */
		//需求：计算下个月的今天是星期几？
		Calendar c=Calendar.getInstance();
		int month =c.get(Calendar.MONTH);
		month+=1;
		c.set(Calendar.MONTH, month);
		int week=c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("下个月的今天是星期"+week);
		
	}
	
	
	/**
	 * 按月底倒推计算时间
	 * int getActuaMaxmum(int field)：返回某个分量上的最大值
	 *
	 */
	//@Test
	public void getActuaMaxmumTest(){
		/**
		 * 需求：每月的最后三天停止报销，求本月的可报销日期
		 * 步骤：
		 * 			step1:获得本月的最后一天
		 * 			step2：本月最后一天-3
		 * 			step3:设置回时间对象中
		 */
		Calendar c=Calendar.getInstance();
		int maxDay=c.getActualMaximum(Calendar.DATE);
		//System.out.println(maxDay);
		c.set(Calendar.DATE, maxDay-3);
		//System.out.println(c.getTime());
		/**
		 * 需求变更：每个月最后三个工作日停止报销，求最后报销日期
		 *步骤：
		 *			step1:从最后一天开始，循环倒退3次
		 *							判断每一天的星期：
		 *									如果是星期日（1）；就一次倒退2天
		 *									如果是星期六（7）;就一次倒退1天
		 *								每循环一次，固定都要倒退1天
		 *	
		 */
		c=Calendar.getInstance();
		c.set(Calendar.MONTH,5-1);
		c.set(Calendar.DATE,c.getActualMaximum(Calendar.DATE));//将日期设置为本月的最后一天
		for(int i=0;i<=3;i++){
			int week=c.get(Calendar.DAY_OF_WEEK);
			if(week==1){//星期日
				c.set(Calendar.DATE,c.get(Calendar.DATE)-2);
			}else if(week==7){//星期六
				c.set(Calendar.DATE,c.get(Calendar.DATE)-1);
			}
			
			//每循环一次，日期向前倒退一天
			if(i!=3){
			//c.set(Calendar.DATE,c.get(Calendar.DATE)-1);
				c.add(Calendar.DATE,-1);//等效于上面一句语句}			
		}
		System.out.println(c.getTime());
		}
	
	}
	
	/**
	 * 						setTime()方法与 getTime()方法
	 * Date getTime()
	 * 			使用Date描述Calendar表示的日期并返回
	 * void setTime(Date())
	 * 			使用Calendar表示Date所描述的日期
	 * 
	 * 							通过Date对象设置日期，在获取日期
	 * 	Calendar calendar=Calendar.getInstance();
	 * 	Date date=new Date();
	 * 	calendar.setTime(date);
	 * 	date=calendar.getTime();
	 * 
	 * 
	 * SimpleDateFormat对象所接受的形参就是Date类型，不接受Calendar类型
	 * 
	 */
	
	/*
	 * 需求四个：
	 * 			1、续签日期提前一周提醒
	 * 			2、如果续签日期是周日则以移至前一星期周五
	 * 			3、提醒续签日期
	 * 			4、
	 */
	
	/**
	 * 合同续签时间
	 */
	//@Test
	public void contractTest(){
		String hireDate="2014-4-29";//入职时间
		//只要是日期格式的转换就要使用SimpleDateFormat对象
		SimpleDateFormat sdf=new SimpleDateFormat("y-M-d");
		//获得将获得的时间转为计算机可用时间
		try {
			Date d=sdf.parse(hireDate);
			//只要是进行复杂的时间计算，就要使用Calendar 类型的对象
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(d);
			//step1:计算合同结束的时间+3
			calendar.add(Calendar.YEAR, 3);
			//System.out.println(calendar.getTime());
			
			//将calendar类型的对象，转换为Date类型的对象。因为ForDate f方法，只认Date类型对象
			String str=sdf.format(calendar.getTime());
			//System.out.println(str);输出：2015-4-29
			//step2:计算续签时间：结束时间-1月
			calendar.add(Calendar.MONTH,-1);
			//获得续签日期的星期
			int week=calendar.get(Calendar.DAY_OF_WEEK);
			if(week==1){//周日，倒退两天
				calendar.add(Calendar.DATE, -2);				
			}else if(week==7){//周六，倒退一天
				calendar.add(Calendar.DATE, -1);				
			}
			str=sdf.format(calendar.getTime());
			System.out.println(str);
			//step3：计算提醒续签时间：续签时间-7
			calendar.add(Calendar.DATE, -7);//等效语句：calendar.get(Calendar.WEEK_OF_MONTH,-1);
			str=sdf.format(calendar.getTime());
			System.out.println("准备续签时间："+str);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 计算1000天后的今天是哪天？
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
