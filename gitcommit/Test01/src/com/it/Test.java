package com.it;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random random=new Random();//���������Ǹ���ʱ�����ӣ�ÿ�����ж���һ��������������ϵͳʱ����ʱ������
		for(int i=0;i<5;i++){
			int n=random.nextInt(1000)+1000;
			System.out.println(n);
		}
	}
	
}
