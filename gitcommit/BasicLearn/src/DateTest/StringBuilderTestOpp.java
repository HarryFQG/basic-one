package DateTest;

import org.junit.Test;
/**
 * ֻҪ���ַ���Ƶ�����в����Ϳ�����StringBuilder����
 * Stringbuilder��API
 * Ч�������ַ�������ƴ��
 * @author Feng
 *���ۣ�Ƶ��+=Ч����ͣ� //�����˼����Ӵ����ַ���
 *���ַ�������+�����ܺ�StringBuilder��Ч
 */
public class StringBuilderTestOpp {
	@Test
	public void StringBuilderTest(){
		//ֻ���޸��ַ�������ʱ��StringBuilder�ű���ͨ�ַ���������
	String str1="Java";
	String str2= "OrgSunIBMBBC";
	String str3="apply";
	//3���ַ���������ָ�������е�3���ַ�������
	//Step1:ʹ��StringBuilderǰ����Ҫʵ����StringBuilder����
	StringBuilder bui=new StringBuilder();
	//�����У�����һ��StringBuilder���͵Ķ���
	//bui�����а���1��16���ַ����ȵ�char[16]����
	//��ǰ�ַ�������������bui.capacty();
	//��ǰ�ַ������ʵ�ʳ��ȣ�builength();.
	System.out.println("δ��֮ǰ��������"+bui.capacity()+";ʵ��ռ�ã�"+bui.length());//���:������16��ʵ��ռ�ã�0
	bui.append(str1);//���ᴴ���ַ�����������String��ƴ�Ӳ�ͬ
	System.out.println("�ڶ�����������"+bui.capacity()+";ʵ��ռ�ã�"+bui.length());//��Ϊ�޸������û�г������������Բ���Ҫ����
	bui.append(str2);
	System.out.println("��������������"+bui.capacity()+";ʵ��ռ�ã�"+bui.length());//��Ȼմ������û�г���������û�д����µĶ���
	bui.append(str3);
	System.out.println("���Ĵ���������"+bui.capacity()+";ʵ��ռ�ã�"+bui.length());//����16���ַ�������������Ϊ(��ǰԪ�ظ���*2+2)���ַ�����
	System.out.println(bui);
	System.out.println("����֮��"+bui.insert(2, 1111));
	}	
	
	/**
	 * +=    �Ա�StringBuilder
	 */
	@Test
	public void StringBuilderTest1(){
		//����һ����ʼ�ַ���
		String s="������";
		Runtime r=Runtime.getRuntime();
		//��ó�������ʱ���ĵ��ڴ�
		long usedStart=r.totalMemory()-r.freeMemory();
		//����ʱ��ʱ�������ֵ
		long timeStart=System.nanoTime();
		for(int i=0;i<10000;i++){
			s+="������";
		}
		/*StringBuilder*/
		/*StringBuilder bui=new StringBuilder(s);
		for(int i=0;i<10000;i++){
			bui.append("������");
		}*/
		//��ó������ʱ�ڴ�����ģ�total-free
		long usedEnd=r.totalMemory();
		//����ʱ��ʱ�������ֵ
		long timeEnd=System.nanoTime();
		System.out.println("ʱ���ϵ����ģ�Time:"+(timeEnd-timeStart)/1000+"΢��");
		System.out.println("�ڴ��ϵ����ģ�Memory:"+(usedEnd-usedStart)/1024+"Kb");
	}
	/**
	 * String:
	 * 
	 * 		ʱ���ϵ����ģ�Time:268458΢��
	*		�ڴ��ϵ����ģ�Memory:250895Kb
	*StringBuilder��
	*		ʱ���ϵ����ģ�Time:2314
	*		�ڴ��ϵ����ģ�Memory:57359Kb
	 */
}
/**
 * Stringbuilder�ೣ�÷���(5��)											����
 * StringBuilder append(String str)   								׷���ַ���
 * StringBuilder insert(int dstOffset ,  String s)				�����ַ���
 * StringBuilder delete(int start ,  int end) 						ɾ���ַ���
 *  StringBuilder replace(int start , int end, String str)  �滻�ַ���
 *  StringBuilder reverse();												�ַ�����ת
 */

/**
 * ���ʺ�StringBuilder���͵ĳ�����
 *   1��String s ="a"+"b"+������������������������ʱ������ɣ�����ʱֱ����
 * ��StringBuilder������ʱ�Ŵ������󣬶�̬�޸��ַ���������ݡ������ʱ���⣬�ͻ�Ч���������ִ��ڳ������У���ȡ���������ã�
 *2��StringBuffer��StringBuilder
 *		StringBuffer���̰߳�ȫ��ͬ��������������
 * 		StringBuilder�Ƿ��̰߳�ȫ���������������Կ�
 * 		����StringBuilder�ĵط�������StringBuffer
 */
