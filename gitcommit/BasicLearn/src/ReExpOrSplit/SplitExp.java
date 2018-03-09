package ReExpOrSplit;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class SplitExp {
	
	/**
	 * 正则表达式：要求要会：
	 * 					1：java中要会做文本格式的验证（使用字符串的matches（）方法）
	 * 					2：关键词的检索（matcher类的find方法）
	 * 					3：关键字的替换方法replaceAll（）方法
	 */
	
	/**
	 * String的split()方法可以将字符串按照特定的分隔符拆分字符串数组
	 * String[] split(String regex);
	 */
	/*
	 * 例如：从服务器下载文件命令：get:文件名1|文件名2|文件名3
	 * 服务器程序通过分割字符串，获得要下载的每个文件名列表
	 * 实现：1：get命令与后续文件名之间用冒号分割，冒号前后不一定有没有空格
	 * 			2：文件名之间用竖划线分割，竖划线前后不一定有没有空格
	 */
	/**
	 * 支持正则表达式的分割方法
	 */
	//@Test
	public void splitTest(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入下载文件列表：");
		String input=sc.nextLine();
		String[] str=input.trim().split("\\s*:\\s*");//trim():去掉字符串前后的空格
		if(str[0].equals("get")){
			System.out.println("开始下载！");
			String[] files=str[1].split("\\s*\\|\\s*");
			//System.out.println(Arrays.toString(files));
			for(String i : files){
				System.out.println(i);
			}
		}else{
			System.out.println("未知命令！！");
			
		}
	}
	
	/**replaecAll()方法
	 * 强调：replaceAll方法只会返回新字符串对象，不会修改原字符串。所以必须使用字符串变量，接住replaceAll
	 * 方法返回的结果，才可以得到替换的结果。 
	 */
	
	/**
	 * 批量替换关键字
	 */
	@Test
	public void replaceTest(){
		System.out.println("请输入文本：");
		Scanner sc =new Scanner(System.in);
		String input=sc.nextLine();
		/**
		 * replaceAll()方法只返回新字符串对象，不修改原字符串
		 * 必须使用变量接住replaceAll（）的返回结果
		 */
		input=input.replaceAll("我[去草]", "**");
		System.out.println(input);
	}
}
