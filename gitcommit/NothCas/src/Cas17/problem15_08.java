package Cas17;

import java.util.Scanner;

public class problem15_08 {
	//static int count=0;//用于计数
	public static void main(String[] args) {
		int x=-100;
		for(int i=0;i<3;i++){
			int y=x%10;
			x=x/10;
			System.out.print(y+" ");		
			}
	}
		
}
	/*//public static int arrayProducer(){}/**
	//第一条线路计算array[0][0]、array[1][1]、array[2][0]、array[4][0]
	public static int first(int[][]x){
		int y=x[0][0]+x[1][1]+x[2][0]+x[4][0];
		return y;
	}
	//第er条线路计算array[0][0]、array[1][2]、array[2][1]、array[4][1]
	public static int second(int[][]x){
		int y=x[0][0]+x[1][2]+x[2][1]+x[4][1];
		return y;
	}
	////第三条线路计算array[1][0]、array[1][1]、array[1][2]、array[1][3]
	public static int thired(int[][]x){
		int y=x[1][0]+x[1][1]+x[1][2]+x[1][3];
		return y;
	}
	//第si条线路计算array[1][0]、array[2][0]、array[3][0]、array[4][1]
	public static int fourth(int[][]x){
		int y=x[1][0]+x[2][0]+x[3][0]+x[4][1];
		return y;
	}
	//第五条线路计算array[4][0]、array[2][1]、array[3][0]、array[1][3]
	public static int fifth(int[][]x){
		int y=x[4][0]+x[2][1]+x[3][0]+x[1][3];
		return y;
	}**/
	

