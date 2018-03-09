package dateTest17_3_31;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class DateTest {
	/**
	 * date类型的测试方法
	 */
	//@Test
	public void datetest(){
		Date d=new Date();
		/*实例化此对象完成了两件事：
		 * 		1：实例化一个日期类型的对象，使用前都要实例化日期类型的对象
		 * 		2：获得当前系统时间距离1970年元旦的毫秒数。获得当前系统时间 
		 */
		
		/*getTime()方法可以获得date对象中封装的距离当前系统距离1970年元旦的毫秒数*/
		System.out.println(d.getTime());
		
		
		/*
		 * 需求1：利用时间进制，换算出当前的年份
		 * 			step1:毫秒数/1000/60/60/24/365       年？
		 *									秒		分	  时   天   年
		 *强调：上面所得的商不是年份2017，得到的仅是和1970年的年份差
		 * 
		 */
		long years=d.getTime()/1000/60/60/24/365;//值为距离1970年的年份差
		System.out.println(years);
		System.out.println("今年是："+(years+1970)+"年。");
		
		/*
		 * 需求2：计算long类型能够保存时间的上限
		 * 			step1:获得long类型的最大值---》Long.MAX_VALUE
		 * 			step2:根据进制获得年分数
		 * 			step3：用1970+年分差
		 */
		long max=Long.MAX_VALUE;
		years=max/1000/60/60/24/365;
		System.out.println("今年是："+(years+1970)+"年。");
		
		/*需求3：设置date对象中的毫秒数为0
		 * 			step1:
		 *
		 *强调：因为日期对象中的毫秒数不是final类型的
		 *			setTime()方法直接修改对象中的毫秒数，不必返回新的日期对象
		 */
		d.setTime(0);
		System.out.println(d);//以默认的格式输出时间格式
		//Thu   Jan   01   08:00:00    CST   1970
		//星期   月份  日    时  分  秒    时区
		
		/**
		 * 需求4：今天领了一张优惠券，8天以内有效（含第八天）求有效期的最后一天？
		 * 			日期计算的固定模式：
		 * 					step1：获得当前时间的毫秒数
		 * 					step2:计算时间间隔的毫秒数。用毫秒数加减		
		 * 					step3：将计算结果的毫秒数setTime（）回日期对象中
		 */
		d=new Date();
		long time =d.getTime()+(8*24*60*60*1000);//考虑加减一的修正
		d.setTime(time);
		System.out.println(d);
		
		
		/**需求5
		 * 两个日期对象比较相等
		 */
		Date d1=new Date();
		Date d2=new Date();
		System.out.println(d1.getTime()==d2.getTime()?"毫秒数相等":"不相等");
		System.out.println(d1.equals(d2)?"日期相等":"日期不相等");
		//日期的比较不能用两等号，要用equals方法。
		
	}
	
	
	/**
	 * 计算机的时间给人看。就是将计算机时间转换为字符串
	 */
	//@Test
	public void formatTest(){
		/*只要转换日期的格式，就要用simpleDateFormat类
		 * 			根据用户定义输出的时间格式
		 * 		 */
		SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		Date d=new Date();
		String str=sdf.format(d);//返回的是一个格式化够的字符串
		System.out.println(str);
		String format="yyyy年MM月dd日 E a hh:mm:ss";//也可简化写成："y年M月d日 E a h:m:s"
		SimpleDateFormat  sdf1=new SimpleDateFormat(format);
		str=sdf1.format(d);//返回的是一个格式化够的字符串
		System.out.println(str);
	}
	
	
	
	/**
	 * 将字符串转换为计算机时间格式，就要用parse
	 * @throws ParseException 
	 */
	@Test
	public void parseTest() throws ParseException{
		Scanner sc=new Scanner(System.in);
		String inputStr= sc.nextLine();
		//Date d=new Date();
		/**
		 * 人输入的时间转换为计算机时间
		 * 			step1：实例化一个simpleDateFormat对象，规定输入的时间格式
		 * 			step2：使用parse()方法，将输入的字符串转换为一个Date类型的对象
		 * 强调：如果输入的字符串与规定的模式不匹配，就会抛出异常
		 */
		//String format="yyyy年MM月dd日 E a hh:mm:ss";
		//提示，让用户输入时间是，越简单越好
		String format="y/M/d";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
	
			Date d=sdf.parse(inputStr);
		
		
		System.out.println(d.getTime());
		System.out.println(sdf.format(d));
	}

}
