package ReExpOrSplit;

import java.util.Scanner;

import org.junit.Test;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * regex包中包好两个类：Pattern类和Matcher类,Matcher类中有两个方法，matches和find方法
 * @author Feng
 *
 */
public class regulaeExpression {
/**
 * 正则表达式：是一串特定字符，组成一个“规则字符串”，这个“规则字符串”是描述文本规则的工具。
 * 						正则表达式就是记录文本规则的代码。
 * 例如：密码设定是否符合规定，网站文章内容的关键
 * 作用：经常需要对字符串数据进行一些复杂的匹配、查找、替换等操作时
 * 最简单的正则表达式，就是关键本身，如“和谐”、“政府”
 */
	/**************字符集合**************/
	/*正则表达式					说明
	 * [abc]						a、b、c中的任意一个字符					
	 * [^abc]					除了a、b、c的任意字符									注意：^号：必须放在开头，前面不能有着字符
	 * [a-z]						a、b、c、d···中的任意一个字符						  "-"：一是部分匹配；二是“至”
	 *[a-zA-Z0-9]			a~z 、A~Z、0~9中的任意字符
	 *[0-9&&[^47]]			0~9中除了4和7以外的数字任意一个字符，其中&&表示“与”的关系
	 */
	/************预定义字符集**************/
	/*正则表达式						说明
	 *		 .							任意一个字符			
	 * \d								任意一个数字字符，相当于[0-9]
	 * \w							单词字符，相当于[a-zA-Z0- 9]
	 * \s								空白字符，相当于[\t\n\x0B\f\r]
	 * \D							非数字字符
	 * \W							非单词字符
	 * \S								非空白字符
	 */
	/******************数量词*********************/
	/*
	 *  作用：简化写法，避免重复书写；
	 *  \d{6}:表示重复6次"\d"		相当于：\d\d\d\d\d\d
	 *  正则表达式						说明
	 *  X?							表达0个或1个X，如：我了？去
	 *  X*							表示0个或任意多个X，如：我[了个]*去
	 *  X{n}							表示n个X
	 *  X+							表示1个到任意多个X（大于等于1个X）
	 *X{n,}							表示n个到任意多个X（大于或等于n个X）
	 *X{n,m}						表示n到m个X（包含头尾）
	 */
	
	
	
	/*
	 *     +---->1个以上
	 *     ?---->0个或1个
	 *     *----->0个或多个
	 * 
	 */
	/*******分组*******/
	/*
	 * 分组:（）圆括号表示分组，可以将一系列正则表达式看做一个整体
	 * （		\+		86		）?		\s		*		\d		{11}
	 * （）：代表一组		\+:字符转义，匹配+号		？：前面组可有可无
	 *   \s :空白字符		*：前面的字符数量>=0		\d:数字字符		{11}:前面的字符数量为11位
	 */
	
	
	
	
	/***应用***/
	/*
	 * matches(正则表达式)方法：将一个字符串与正则表达式进行匹配
	 * 如果匹配成功就返回true，否则返回false
	 * 语法：str.matches(RegExp)
	 * 应用场景：只要对字符串的格式进行验证就要用matches()方法
	 *结论：要求str中的格式必须与matches中的正则表达式从前到后一模一样，所以matches()方法是完整匹配；而find()是部分匹配，只要出现正则表达式的内容即可
	 */
	/**
	 * 用户要求：
	 * 1.必须以字母开头：[a-zA-Z]
	 * 2.之后可以是字母，数字，下划线
	 * 3.位数：{5,16}
	 * [a-zA-Z]\w{4,15}
	 * 例子：eric,smith,1234546,1a2s12345,a1213sd3521
	 */
	/**
	 * 完整验证字符串格式方法：
	 * 		str.matchs("正则表达式")
	 * 		返回true则通过，否则失败
	 */
	@Test
	public  void matchsTest(){
		/*
		 * 验证流程：
		 * 1.请用户输入用户名
		 * 2.获取用户输入的用户户名，调用字符串对象的matchs方法
		 * 3.判断验证结果：返回true，说明用户名可用，否则不可用
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名：（5—6位，必须以字母开头，有下划线，数字，字母组成）");
		String input=sc.nextLine();
		//if(input.matches("[a-zA-Z]\\w{4,15}")){				//与下一行效果一样，用的多
		//if(Pattern.matches("[a-zA-Z]\\w{4,15}", input)){	
		/*
			 * 编译错误：不可用的转义字符
			 * 原因:斜线（\）在正则表达式中表示预定义字符集
			 * 			\在字符串中，同时又表示转义字符。
			 * 			在字符中找不到转义字符\w，所有的\都要改为\\
			 * 解决：只要使用字符串格式，所有的\都要改为\\
			 */
			 
			
		
		//Step1:编译正则表达式
		Pattern p=Pattern.compile("[a-zA-Z]\\w{4,15}");
		Matcher m=p.matcher(input);
		if(m.matches()){
			System.out.println("用户名可用！");//step1:
		}else{
			System.out.println("格式不符合要求！");
		}
	
	
	/***部分匹配Pattern****/
	/*pattern类：专门封装编译好的正则表达式
	 * 					应用地方：只要使用就要先编译正则表达式，在使用。
	 * Mather:使用pattern类对对象进行查找匹配的类
	 * 				应用地方：只要使用正则表达式对字符串进行任何的匹配超找操作，就会使用matcher类
	 *结论：matches方法要求字符串与正则表达式从头到尾一摸一样
	 */
	}
	
	/**
	 * 实现查找关键字、敏感词：只能使用Matcher类的find 方法
	 */
	//@Test
	public void matcher_findTest(){
		/*需求：1.请求用户输入评论
		 * 			2.获得用户输入的评论，放入Matcher对象中
		 * 			3.使用matcher对象的find方法查找评论中是否有敏感词汇
		 * 
		 */
		Scanner sc=new Scanner(System.in );
		System.out.println("评论：");
		String input=sc.nextLine();
		//step1:编译正则表达式：
		Pattern p=Pattern.compile("我[\\W]*[去草]");
		//step2：使用正则表达式，创建比较器对象
		Matcher m=p.matcher(input);
		if(m.find()){
			System.out.println("包含敏感词，被和谐掉！");
		}else{System.out.print("评论发布成功！！");}
		
	}
	
	/*
	 * 边界匹配：
	 * 				^:代表字符串开始
	 * 				$:代表字符串结束匹配
	 * 例如：验证网址必须以http://或https://或ftp://开头
	 * 					 ^(http|heeps|ftp)://
	 * 			 验证图片文件扩展名只能用.jpg/.png/.gif/.bmp结束
	 * 					\.(jpg|gif|bmp|png)$
	 * 应用情况：只要用到验证字符串开头时就要在正则表达式开头加'^'号；
	 * 					只要用到验证字符串结尾时就要在正则表达式末尾加'$'号。
	 * 注意强调：边界匹配仅在matcher类的find方法中才有效。用在任何matches方法中无效。因为所有matches方法只能进行完整匹配，无法部分匹配
	 *正则表达式标准要求：只要完整匹配，必须前加^,后加$
	 */
	/**
	 * 在正则表达式中实现使用^和$实现边界匹配
	 */
	//@Test
	public void starts_endsTest(){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		/*使用上^匹配字符串开头格式*/
		Pattern p=Pattern.compile("^(http|https|ftp)://");
		Matcher m=p.matcher(input);
		System.out.println(m.find()?"格式正确":"格式错误");
		
		Pattern P=Pattern.compile("\\.(png|jpg|gif|bmp)$");
		Matcher M=P.matcher(input);
		System.out.println(M.find()?"格式正确!!":"格式错误!!!");
	}
}
