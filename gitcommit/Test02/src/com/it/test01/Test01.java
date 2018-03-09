package com.it.test01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;



public class Test01 {

	/*文本信息：
dDFasdGc1
FasdDdGc2
dasDGcFd3
dcDdGFas4
	 * */
	
	public static void main(String[] args) throws IOException {
		sortReader();
		
		
	}
	
	
	
	
	public static void sortReader() throws IOException{
		
		BufferedReader bf=new BufferedReader(new FileReader("E:\\Tomcat\\fileObject\\newFile\\txt.txt"));
		String str="";
		while((str=bf.readLine())!=null){
			System.out.println("源："+str);
			char[] charArray = str.toCharArray();
			sortMySelf(charArray);			
			
		}
		
		
		
	}
	
	public static void sortMySelf(char[] c){
		char[] a1={'D','2','F','c','G','d','a'};//根据题干指定自己的排序；（题目中顺序为：D<2<F<c<G<d<a）
		char[] c1=new char[c.length];
		c1[0]=c[c.length-1];
		
		for(int i=0;i<c.length-1;i++){
			c1[i+1]=c[i];			
		}
		String str=new String(a1);
		Arrays.sort(c1);//升序
		
		int temp;
		
		for(int i=1;i<c1.length-1;i++){			
			
			for(int j=c1.length-1;j>i;j--){
				
				if((str.indexOf(c1[i])!=-1)&&(str.indexOf(c1[j])!=-1)){
					int index1=str.indexOf(c1[i]);
					int index2=str.indexOf(c1[j]);
					
					if(index1>index2){
						temp=c1[i];
						c1[i]=c1[j];
						c1[j]=(char) temp;
						
					}
					
				}
				
				
			}
			
			
		}
		
		System.out.println("结果：");
		for(int i=0;i<c1.length;i++){			
			System.out.print(c1[i]);
		}
		System.out.println();
		
		
		
	}
	
	
	
}
