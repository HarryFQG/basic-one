package ObjectTest;

import java.util.Scanner;

import org.junit.Test;

/**
 *Ⅰ:帮小学生做加法
 *API:1:正则表达式：matches（匹配，比赛，火柴）(regex)方法
 *	  2：拆分		：split（拆分，分离）(regex);
 *
 *Ⅱ:自动装箱拆箱操作的测试
 */
public class AddWay {
	/**
	 * 帮小学生做加法
	 */
	//@Test
	public void addTest(){
		//Step1:实例化scanner对象
		Scanner sc=new Scanner(System.in);
		//Step2:要想反复输入就得用死循环
		while(true){
			//Step2:提示输入并且获得输入字符串
			System.out.println("请输入加法公式：");
			String input=sc.next();
			//Step4:判断是否退出
			if(input.equals("exit")){
				System.out.println("小朋友再见！！！");
				break;
			}else{ 
				//Step5:验证输入的字符串格式   （只要验证输入的字符串的格式一般都用正则表达式）
				//正则表达式(regex)：\d+（\+\d+）+[第四个加号表示圆括号至少出现一次。"\+"转义为普通字符]
				if(input.matches("\\d+(\\+\\d+)+")){
					//Step6：以加号为分隔符拆分字符串
					String[] nums=input.split("\\+");
					//坑：运行异常
					//原因：split方法的参数是一个正则表达式。
					//    "+"正则表达式中有特殊含义
					//	   要以“+”原文作为分割，必须使用“\”转义
					//Step7:遍历数组中所有整数“字符串”，累加到整数变量sum中
					int sum=0;
					for(String f:nums ){
						/*整数字符串计算前，必须用到类型转换*/
						sum +=Integer.parseInt(f);
					}
					//Step8:输出计算结果
					System.out.println("="+sum);
					
				}else{
					System.out.println("你输入的公式格式错误！");
				}
			}
			
			
		}
	}
	
	
	/**
	 * 自动装箱拆箱操作的测试
	 */
	@Test
	public void autoboxTest(){
		Integer a=100;//装箱
		//等效于
		a=new Integer(100);
		Integer b=200;//装箱操作
		//等效于
		b=new Integer(200);
		Integer c=a+b;//先拆箱，在装箱。
		//‘+’左右两边实际对象都在进行数值计算。
		//拆箱： a.intValue() ；从对象中取出数值
		//	   b.intValue();从对象中取出数值
		//	   a的数值+b的数值=数值
		//装箱：new Intgeter(a的数值+b的数值=数值) 将数值 封装到包装类中
		System.out.println(c);
		double d=c;//拆箱   		左边：基本类变量		右边:对象
		//等效于
		d=c.doubleValue();//从对象c 取出数值，转换为double基本类型
		System.out.println(d);//装箱   d是基本类型，println（object）的参数是object类型
		//new Double（d）-->object 
	}
	
	
}
