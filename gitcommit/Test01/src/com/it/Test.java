package com.it;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random random=new Random();//传参数就是给了时间种子，每次运行都是一样。不给就是以系统时间做时间种子
		for(int i=0;i<5;i++){
			int n=random.nextInt(1000)+1000;
			System.out.println(n);
		}
	}
	
}
