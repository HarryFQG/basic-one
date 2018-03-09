package DateTest;

import org.junit.Test;
/**
 * 只要对字符串频繁进行操作就可以用StringBuilder类型
 * Stringbuilder的API
 * 效果：将字符串进行拼接
 * @author Feng
 *结论：频繁+=效率最低！ //创建了几个加创建字符串
 *但字符串变量+，性能和StringBuilder等效
 */
public class StringBuilderTestOpp {
	@Test
	public void StringBuilderTest(){
		//只有修改字符串常量时，StringBuilder才比普通字符串有优势
	String str1="Java";
	String str2= "OrgSunIBMBBC";
	String str3="apply";
	//3个字符串变量，指向常量池中的3个字符串常量
	//Step1:使用StringBuilder前，都要实例化StringBuilder对象
	StringBuilder bui=new StringBuilder();
	//程序中，多了一个StringBuilder类型的对象
	//bui对象中包含1个16个字符长度的char[16]对象
	//当前字符数组总容量：bui.capacty();
	//当前字符数组的实际长度：builength();.
	System.out.println("未用之前总容量："+bui.capacity()+";实际占用："+bui.length());//输出:容量：16，实际占用：0
	bui.append(str1);//不会创建字符串，与两个String向拼接不同
	System.out.println("第二次总容量："+bui.capacity()+";实际占用："+bui.length());//因为修给结果，没有超出容量，所以不需要扩容
	bui.append(str2);
	System.out.println("第三次总容量："+bui.capacity()+";实际占用："+bui.length());//虽然沾满但是没有超出，所以没有创建新的对象
	bui.append(str3);
	System.out.println("第四次总容量："+bui.capacity()+";实际占用："+bui.length());//超过16个字符串，所以扩容为(当前元素个数*2+2)个字符数组
	System.out.println(bui);
	System.out.println("插入之后："+bui.insert(2, 1111));
	}	
	
	/**
	 * +=    对比StringBuilder
	 */
	@Test
	public void StringBuilderTest1(){
		//定义一个初始字符串
		String s="讨厌你";
		Runtime r=Runtime.getRuntime();
		//获得程序启动时消耗的内存
		long usedStart=r.totalMemory()-r.freeMemory();
		//启动时，时间的纳秒值
		long timeStart=System.nanoTime();
		for(int i=0;i<10000;i++){
			s+="讨厌你";
		}
		/*StringBuilder*/
		/*StringBuilder bui=new StringBuilder(s);
		for(int i=0;i<10000;i++){
			bui.append("讨燕妮");
		}*/
		//获得程序结束时内存的消耗：total-free
		long usedEnd=r.totalMemory();
		//启动时，时间的纳秒值
		long timeEnd=System.nanoTime();
		System.out.println("时间上的消耗：Time:"+(timeEnd-timeStart)/1000+"微妙");
		System.out.println("内存上的消耗：Memory:"+(usedEnd-usedStart)/1024+"Kb");
	}
	/**
	 * String:
	 * 
	 * 		时间上的消耗：Time:268458微妙
	*		内存上的消耗：Memory:250895Kb
	*StringBuilder：
	*		时间上的消耗：Time:2314
	*		内存上的消耗：Memory:57359Kb
	 */
}
/**
 * Stringbuilder类常用方法(5个)											功能
 * StringBuilder append(String str)   								追加字符串
 * StringBuilder insert(int dstOffset ,  String s)				插入字符串
 * StringBuilder delete(int start ,  int end) 						删除字符串
 *  StringBuilder replace(int start , int end, String str)  替换字符串
 *  StringBuilder reverse();												字符串反转
 */

/**
 * 不适合StringBuilder类型的场景：
 *   1、String s ="a"+"b"+···都是字面量——编译时就能完成，运行时直接用
 * 而StringBuilder在运行时才创建对象，动态修改字符数组的内容。如果此时用这，就会效率慢。（现存在常量池中，再取出来，再用）
 *2、StringBuffer和StringBuilder
 *		StringBuffer是线程安全，同步处理，性能稍慢
 * 		StringBuilder是非线程安全，并发处理，性能稍快
 * 		能用StringBuilder的地方都能用StringBuffer
 */
