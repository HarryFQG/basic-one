package DateTest;

import org.junit.Test;

/**
 * 字符串基本操作API的测试类
 * @author Feng
 */
public class startWithAndValueOfAndDate {
	//@Test
	/**
	 * 创建字符串的方法
	 */
	public void creatString(){
		String str="羊肉串";//字符串的字面量要用双引号包裹
		//程序中，一切字符串的字面常量，都是String类型的对象实例
		//等效于：
		char[] chs={'羊','肉','串'};//定义一个字符数组，存储字符串中的每个字符
		str=new String(chs);
		System.out.println(str);
	}
	/**
	 * 字符串对象的测试方法
	 */
	//@Test
	public void StringObjTest(){
		//特点1:字符串对象一旦创建，内容就不可改变，只能替换新字符串
		String  i="小王";//i变量指向字符串对象"小王"
		i="小王的儿子";//如果垃圾回收器没来得及回收
		//此时内存中有两个字符串对象
		//特点2：两个字符串的拼接，都会创建第三个字符串。原字符串不变
		i=i+"和小王儿子的女友";
	//现在内存中有三个字符串
		System.out.println(i);
	}
	//凡是在编译期就能确定值的字符串（字面量、常量、常量连接的结果）都是在常量池中创建
	/**
	 * 字符串常量池的测试
	 */
	//@Test
	public void StringPooTest(){
		//第一场会议：
		String meeting1 ="小明的杯子";//字符串字面量，保存在常量池中
		//第二场会议
		String meeting2="小明的杯子";//先到常量池中查找是否有相同的字面量
		//现在小明要求必须换杯子
		String  meeting3=new String("小明的杯子");
		//情况三：字面量做拼接
		meeting3="小明的"+"杯子";//编译期：java会将拼接的结果，保存到常量池中
		//情况四：普通变量和字面量之间拼接
		String whose="小明的";
		meeting3=whose+"杯子 ";
		//如果有：就直接使用常量池中的字符串常量，不会新建
		//判断两个变量是否指向同一个对象，用==
		System.out.println(meeting1==meeting2?"同一个杯子":"不同的杯子");
		System.out.println(meeting1==meeting3?"同一个杯子":"不同的杯子");//new出来的对象在堆中，不同的对象
	}
	
	//字符串的长度，就是字符串中字符数组的元素个数，也就是字符串中的字符个数。无论中英文，都是1个字节
	//字符串所占用的存储空间：字符串的长度*2字节
	/**
	 * 获得字符串的长度（字符个数）
	 */
	//@Test
	public void lengthTest(){
		String str="hellow,马里奥";//汉字和字母都是一个字符
		System.out.println(str.length());
		/*比较：数组长度，数组对象.length 属性，不加（）
		 * 字符串长度：字符串对象.length（） 方法，必须加（）
		 */
		
	}
	/**
	 * 分割字符串为多段字符串：split
	 */
	@Test
	public void splitTest(){
		String str="you can you up !";
		//只要对字符串分段处理：
		// 先用split将字符串分段，再遍历 分段后的子字符串
		String[] str1=str.split("\\s");
		for(int i=0;i<str1.length;i++){
			char first=str1[i].charAt(0);//获得每个字符串的第一个元素的字母
			if(first>='a'&&first<='z'){//判断是否小写
				first-=32;//小写变大写
				//System.out.println("First---->>"+first+",length--->>"+str1.length);
				//将大写字母拼回原字符串
				str1[i]=first+str1[i].substring(1,str1[i].length());
			}
			System.out.println(str1[ i]);
		}
		//遍历数组中每个单词，拼接回原字符串
		str=" ";
		for(int i=0;i<str1.length;i++){
			str+=str1[i]+" ";
		}
		str=str.trim();
		System.out.println(str);
	}
	
	
	
	/**模拟客服端
	 * startswith();和endswith()方法
	 */
	@Test
	public void client(){
		server("login:zhongdong");
		server("file:QQ.exe");
		server("file:qq.rar");
		server("logout:zhongdong");
	}
	/**
	 * 模拟服务器端
	 * 根据客服端的命令开头不同，执行不同的操作
	 */
	public void server(String str){
		if(str.startsWith("login:")){//说明 用户想登录
			System.out.println("server:欢迎"+str.substring(6));//substring(int beginIndex):截取字符串到末尾；substring（int beginIndex ,int endIndex）:截取中间的字符串
			}else if(str.startsWith("logout:")){//说明用户想退出
				System.out.println("server:再见！"+str.substring(7));
			}else if(str.startsWith("file:")){//说明用户想传递文件
				if(str.endsWith(".exe")){//如果文件的扩展明位exe则不可以传输
					System.out.println("server:禁止传输可执行文件");
				}else{
					System.out.println("server:正在传输文件···"+str.substring(5));
				}
			}
		
	}
	
	
	/**
	 * valueOf();方法将其他类型转换为字符串类型 
	 */
	@Test
	public void valueOfTest(){
		double pi=3.1415926;
		int i=1233;
		boolean flag=false;
		char[]  charArr={'a','b','c'};
		String str=String.valueOf(pi);
		String str1=String.valueOf(i);
		String str2=String.valueOf(flag);
		//valueOf()方法将char 类型的数组，拼接为一个字符串
		String str3=String.valueOf(charArr);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		//默认的toString（）；方法输出对象的类型和对像的hashCode
		System.out.println(charArr.toString());
		//XX对象.toString();必须先创建，在调用该方法
		//valueOf(XX对象);静态方法，不必创建任何对象，就可以使用
		//大多数valueOf();方法都是调用toString ();方法
		//建议：使用valueOf();方法。
		//因为valueOf();方法在没有对象时也可以调用，避免了空指针异常
		//vakueOf()比toString()要健壮
	}
	
}
