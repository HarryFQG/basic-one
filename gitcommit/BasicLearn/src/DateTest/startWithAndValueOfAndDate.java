package DateTest;

import org.junit.Test;

/**
 * �ַ�����������API�Ĳ�����
 * @author Feng
 */
public class startWithAndValueOfAndDate {
	//@Test
	/**
	 * �����ַ����ķ���
	 */
	public void creatString(){
		String str="���⴮";//�ַ�����������Ҫ��˫���Ű���
		//�����У�һ���ַ��������泣��������String���͵Ķ���ʵ��
		//��Ч�ڣ�
		char[] chs={'��','��','��'};//����һ���ַ����飬�洢�ַ����е�ÿ���ַ�
		str=new String(chs);
		System.out.println(str);
	}
	/**
	 * �ַ�������Ĳ��Է���
	 */
	//@Test
	public void StringObjTest(){
		//�ص�1:�ַ�������һ�����������ݾͲ��ɸı䣬ֻ���滻���ַ���
		String  i="С��";//i����ָ���ַ�������"С��"
		i="С���Ķ���";//�������������û���ü�����
		//��ʱ�ڴ����������ַ�������
		//�ص�2�������ַ�����ƴ�ӣ����ᴴ���������ַ�����ԭ�ַ�������
		i=i+"��С�����ӵ�Ů��";
	//�����ڴ����������ַ���
		System.out.println(i);
	}
	//�����ڱ����ھ���ȷ��ֵ���ַ��������������������������ӵĽ���������ڳ������д���
	/**
	 * �ַ��������صĲ���
	 */
	//@Test
	public void StringPooTest(){
		//��һ�����飺
		String meeting1 ="С���ı���";//�ַ����������������ڳ�������
		//�ڶ�������
		String meeting2="С���ı���";//�ȵ��������в����Ƿ�����ͬ��������
		//����С��Ҫ����뻻����
		String  meeting3=new String("С���ı���");
		//���������������ƴ��
		meeting3="С����"+"����";//�����ڣ�java�Ὣƴ�ӵĽ�������浽��������
		//����ģ���ͨ������������֮��ƴ��
		String whose="С����";
		meeting3=whose+"���� ";
		//����У���ֱ��ʹ�ó������е��ַ��������������½�
		//�ж����������Ƿ�ָ��ͬһ��������==
		System.out.println(meeting1==meeting2?"ͬһ������":"��ͬ�ı���");
		System.out.println(meeting1==meeting3?"ͬһ������":"��ͬ�ı���");//new�����Ķ����ڶ��У���ͬ�Ķ���
	}
	
	//�ַ����ĳ��ȣ������ַ������ַ������Ԫ�ظ�����Ҳ�����ַ����е��ַ�������������Ӣ�ģ�����1���ֽ�
	//�ַ�����ռ�õĴ洢�ռ䣺�ַ����ĳ���*2�ֽ�
	/**
	 * ����ַ����ĳ��ȣ��ַ�������
	 */
	//@Test
	public void lengthTest(){
		String str="hellow,�����";//���ֺ���ĸ����һ���ַ�
		System.out.println(str.length());
		/*�Ƚϣ����鳤�ȣ��������.length ���ԣ����ӣ���
		 * �ַ������ȣ��ַ�������.length���� ����������ӣ���
		 */
		
	}
	/**
	 * �ָ��ַ���Ϊ����ַ�����split
	 */
	@Test
	public void splitTest(){
		String str="you can you up !";
		//ֻҪ���ַ����ֶδ���
		// ����split���ַ����ֶΣ��ٱ��� �ֶκ�����ַ���
		String[] str1=str.split("\\s");
		for(int i=0;i<str1.length;i++){
			char first=str1[i].charAt(0);//���ÿ���ַ����ĵ�һ��Ԫ�ص���ĸ
			if(first>='a'&&first<='z'){//�ж��Ƿ�Сд
				first-=32;//Сд���д
				//System.out.println("First---->>"+first+",length--->>"+str1.length);
				//����д��ĸƴ��ԭ�ַ���
				str1[i]=first+str1[i].substring(1,str1[i].length());
			}
			System.out.println(str1[ i]);
		}
		//����������ÿ�����ʣ�ƴ�ӻ�ԭ�ַ���
		str=" ";
		for(int i=0;i<str1.length;i++){
			str+=str1[i]+" ";
		}
		str=str.trim();
		System.out.println(str);
	}
	
	
	
	/**ģ��ͷ���
	 * startswith();��endswith()����
	 */
	@Test
	public void client(){
		server("login:zhongdong");
		server("file:QQ.exe");
		server("file:qq.rar");
		server("logout:zhongdong");
	}
	/**
	 * ģ���������
	 * ���ݿͷ��˵����ͷ��ͬ��ִ�в�ͬ�Ĳ���
	 */
	public void server(String str){
		if(str.startsWith("login:")){//˵�� �û����¼
			System.out.println("server:��ӭ"+str.substring(6));//substring(int beginIndex):��ȡ�ַ�����ĩβ��substring��int beginIndex ,int endIndex��:��ȡ�м���ַ���
			}else if(str.startsWith("logout:")){//˵���û����˳�
				System.out.println("server:�ټ���"+str.substring(7));
			}else if(str.startsWith("file:")){//˵���û��봫���ļ�
				if(str.endsWith(".exe")){//����ļ�����չ��λexe�򲻿��Դ���
					System.out.println("server:��ֹ�����ִ���ļ�");
				}else{
					System.out.println("server:���ڴ����ļ�������"+str.substring(5));
				}
			}
		
	}
	
	
	/**
	 * valueOf();��������������ת��Ϊ�ַ������� 
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
		//valueOf()������char ���͵����飬ƴ��Ϊһ���ַ���
		String str3=String.valueOf(charArr);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		//Ĭ�ϵ�toString���������������������ͺͶ����hashCode
		System.out.println(charArr.toString());
		//XX����.toString();�����ȴ������ڵ��ø÷���
		//valueOf(XX����);��̬���������ش����κζ��󣬾Ϳ���ʹ��
		//�����valueOf();�������ǵ���toString ();����
		//���飺ʹ��valueOf();������
		//��ΪvalueOf();������û�ж���ʱҲ���Ե��ã������˿�ָ���쳣
		//vakueOf()��toString()Ҫ��׳
	}
	
}
