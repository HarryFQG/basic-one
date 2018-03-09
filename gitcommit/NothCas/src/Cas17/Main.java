package Cas17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());			
		}
		
		int sum=0,sum1=0;//总费用
		boolean flag=true;
		while(flag){
			Collections.sort(list);//升序排列
			sum=(int) list.get(0)+(int) list.get(1);
			sum1+=sum;
			list.remove(0);list.remove(0);
			list.add(sum);
			if(list.size()==1){				
				System.out.println(sum1);
				flag=false;
			}
		}
	}
	
}
	/**
	 * 
	 * @param x:要求的字符
	 * @return	:将整数按位数取出存在对应的数组中
	 */
	/*public static int[] chang(int x){
		int j=0;
		int n=x;
		//确定数组的长度
		while(n%10!=0){
			n=n/10;j++;
		}
		
		int[] y=new int[j];
		n=x;
		for(int i=0;i<j;i++){
			y[i]=n%10;
			n=n/10;
		}		
		return y;
	}*/
	


/**
 * int y=1,all=0,continu=1;
		array[0]=1;
		boolean flag=false;
		for(int i=1;i<n;i++){
			array[1]=1;
			for(int j=0;j<=n;j++){				
				y=array[j]*(i+1);
				if(continu==1&&flag){
					continu--;
				}else if(continu==0){
					array[j]+=all;continu=1;flag=false;
				}
					
				
				if(y<10){
					array[j]=y;
					}else{
						all=y/10;y=y%10;
						flag=true;
					}
				
			}			
		}
 */
