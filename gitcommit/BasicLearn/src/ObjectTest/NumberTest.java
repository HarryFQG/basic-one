package ObjectTest;

import org.junit.Test;

/**
 * 包装类的测试类
 *  	Ⅰ：包装类的主要作用有两个：
 *    		①：便与数据类型转换
 *    		②：便于方法的对象类型参数传递和返回值
 * 		Ⅱ：方法的参数；例如：参数类型为八大类型的父类object
 * 			
 *
 */
public class NumberTest {
	/**
	 * 包装类的测试方法
	 */
	//@Test
	public void wrapperTest(){
		//实例化一个integer类型的整数对象
		Integer i=new Integer(100);
	}
	
	
	/**
	 * NUmber类的测试方法
	 */
	//@Test
	public void NumberTest(){
		//使用Number父类型变量，引用子类型对象
		Number d=123.45;
		Number i=123;
		//等效于下面两句话
		d=new Double(123.45);
		i=new Integer(123);
		/*如何获得数值对象的原始类型
		 * 方法：对象.getClass().getName()*/
		System.out.println(d.getClass().getName());
		System.out.println(i.getClass().getName());
		/*将封装在基本类型中的数据，转换为基本类型使用*/
		double doubleValue=d.doubleValue();
		int intValue=i.intValue();
		System.out.println("\n应收："+doubleValue+";实际收："+intValue);
		
		doubleValue=i.doubleValue();
		intValue=i.intValue();
		System.out.println(doubleValue+","+intValue);
		
	}
	
	
	
	/**
	 * Integer类测试方法
	 *    Integer的方法：可以用(Integer.***）自动引出
	 *    其余的类型雷同
	 */
	@Test
	public void IntegerTest(){
		/*获取int类型整数的方法*/
		System.out.println("\nint 类型最大范围："+Integer.MAX_VALUE);
		System.out.println("int 类型最小范围："+Integer.MIN_VALUE);
		
		/*Integer进制转换方法*/
		int i=8;
		System.out.println("\n转换为二进制:"+Integer.toBinaryString(i));
		System.out.println("转换为八进制:"+Integer.toOctalString(i));
		
		/*将字符串类型转换为整数类型(parseInt(某某);)
		 *   要求：字符串必须符合整型数字面量的要求，才可以转换*/
		String input="123.0";//正面例子，不会抛出异常
		//String input="123.00";//反面例子
		//String input ="180cm";//反面例子，
		/*倘若不符合正数字面量的要求，不但不能转换而且会抛出异常
		 *  异常为：NumberFormat
		 */
		double n=Double.parseDouble(input );
		n+=1;
		System.out.println("\n字符串转换为int类型："+n);
		
		String input1="123.00";
		double d=Double.parseDouble(input1);
		System.out.println("将字符串类型转换为double类型："+d);
		
	}
	
	/**
	 * 模拟快递员打包发送货物
	 * @param obj要发出的货物，可以是任意类型
	 * @return返回发送的货物，可以是任意类型
	 * 体现：便于方法的对象类型参数传递和返回值
	 */
	public Object deliver(Object obj){
		System.out.println("货物已发送！！");
		return obj;
	}
	
	/**
	 * 模拟基本数据类型和对象作为参数
	 */
	@Test
	public void boxingTest(){
		int money=300;
		Object o=deliver(money);//先装箱
		//等效于
		o=deliver((Integer.valueOf(money)));
		//等到一个object类型对象，都要手动转换为具体类型
		//
		System.out.println((int)o+300);
	}
}
