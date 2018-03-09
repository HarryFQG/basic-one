package DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTestOpp {
	
	
	//@Test
	public void dateTest(){
		
		/*Date 重写了toString()方法，用一个字符串来描叙当前Date对象所表示的时间
		 * Date重写了equals()方法。用于比较两个时间是否相等。其实比较的时距离1970元旦的毫秒数是否相等
		 * */
		Date d=new Date();
		
						/**getTime方法专门获得Date对象中的从1970年元月份到现在的封装的毫秒数*/
		System.out.println(d.getTime());
		/*将其换算为年，当前为毫秒，1秒=1000毫秒，不考虑闰年*/
		long years=d.getTime()/1000/60/60/24/365;//getTime返回的是long类型
		System.out.println("从1970年到现在相隔："+years+"年！");
		
		        	/**setTime方法专门用于设置Date对相中的毫秒数*/
		//设置date对象中的毫秒数为零
		d.setTime(0);//强调：因为日期对象中的毫秒数不是final类型的
		//所以setTime()方法直接修改对象中的毫秒数，不必返回新的日期对象
		
								/** 重写toString()方法 **/
		//Date重写了toString()方法，用一个字符串来描述当前date对象所表示的时间
		System.out.println(d);//如果直接打印d,就以默认的格式输出日期对象中的时间点
		//输出：Thu Jan 01 08:00:00 CST 1970
		//		星期    月   日  时 分  秒  时区  年  
	
		
		
	//需求：领了一张优惠券，8天内有效（好第八天），求有效的最后一天
	/**
	 * 日起计算固定套路：
	 * 		Step1:获得当前时间的毫秒数
	 * 		Step2：计算时间间隔的毫秒数，用毫秒数做加减
	 * 		Step3:将计算的结果毫秒数setTime回归到对象中
	 */
		d=new Date();//获得当前系统的时间
		System.out.println(d);
		long time=d.getTime()+(8-1)*24*60*60*1000;//注意对时间的修正
		d.setTime(time);
		System.out.println(d);
	
	
	
	
								/**重写equals()方法*/
	//用于比较两个日期是否相等只能用equals方法，实质比较距离1970年的毫秒数是否相等。不能使用‘==’，因为使用时引用类型，里面存的是地址。不能直接‘==’
	Date d1=new Date();
	Date d2=new Date(System.currentTimeMillis());
	System.out.println(d1.getTime()==d2.getTime()?"毫秒数相等":"毫秒数不相等");
	//System.out.println(d1==d2?"日期相等":"日期不相等");
	System.out.println(d1.equals(d2)?"日期相等":"日期不相等");
	}
	
	
	
	// 将计算机的时间输出用SimpleDateFormat方法；读入键盘输入的时间用prase()方法
	
	/**
	 * 计算机的时间给人看
	 */
	@Test
	public void formatTest(){
		Date d=new Date();
		/*只要转换日期的格式，就要用SimpleDateFormat对象
		 * 1：导入java.text.SimpleDateFormat对象
		 * 2：根据用户的需求定义日期字符串的模式
		 * */
		//要求：4位年2位月2位日 星期 上/下 12小时制时：分：秒
		//String format="yyyy年MM月dd日 E a hh:mm:ss";
		//等效于：（简化版） 差别：如果某个分量上为个位数，就会去掉多余的零
		String format="y年M月d日 E a h:m:s";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		/*日期对象给人看：sdf.format(date)
		 * 返回格式化后的字符串
		 * */
		System.out.println(sdf.format(d));
	}
}
