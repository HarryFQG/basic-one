package ReExpOrSplit;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class SplitExp {
	
	/**
	 * ������ʽ��Ҫ��Ҫ�᣺
	 * 					1��java��Ҫ�����ı���ʽ����֤��ʹ���ַ�����matches����������
	 * 					2���ؼ��ʵļ�����matcher���find������
	 * 					3���ؼ��ֵ��滻����replaceAll��������
	 */
	
	/**
	 * String��split()�������Խ��ַ��������ض��ķָ�������ַ�������
	 * String[] split(String regex);
	 */
	/*
	 * ���磺�ӷ����������ļ����get:�ļ���1|�ļ���2|�ļ���3
	 * ����������ͨ���ָ��ַ��������Ҫ���ص�ÿ���ļ����б�
	 * ʵ�֣�1��get����������ļ���֮����ð�ŷָð��ǰ��һ����û�пո�
	 * 			2���ļ���֮���������߷ָ������ǰ��һ����û�пո�
	 */
	/**
	 * ֧��������ʽ�ķָ��
	 */
	//@Test
	public void splitTest(){
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������ļ��б�");
		String input=sc.nextLine();
		String[] str=input.trim().split("\\s*:\\s*");//trim():ȥ���ַ���ǰ��Ŀո�
		if(str[0].equals("get")){
			System.out.println("��ʼ���أ�");
			String[] files=str[1].split("\\s*\\|\\s*");
			//System.out.println(Arrays.toString(files));
			for(String i : files){
				System.out.println(i);
			}
		}else{
			System.out.println("δ֪�����");
			
		}
	}
	
	/**replaecAll()����
	 * ǿ����replaceAll����ֻ�᷵�����ַ������󣬲����޸�ԭ�ַ��������Ա���ʹ���ַ�����������סreplaceAll
	 * �������صĽ�����ſ��Եõ��滻�Ľ���� 
	 */
	
	/**
	 * �����滻�ؼ���
	 */
	@Test
	public void replaceTest(){
		System.out.println("�������ı���");
		Scanner sc =new Scanner(System.in);
		String input=sc.nextLine();
		/**
		 * replaceAll()����ֻ�������ַ������󣬲��޸�ԭ�ַ���
		 * ����ʹ�ñ�����סreplaceAll�����ķ��ؽ��
		 */
		input=input.replaceAll("��[ȥ��]", "**");
		System.out.println(input);
	}
}
