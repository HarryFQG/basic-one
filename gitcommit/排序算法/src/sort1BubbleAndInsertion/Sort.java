package sort1BubbleAndInsertion;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

import org.junit.Test;

/**
 * 排序算法有基本的8种：
 * 稳定的算法有：冒泡、插入、归并、基数
 * 不稳定的算法：选择、快速、希尔、堆排
 * 排序算法					时间复杂度				基本思路
 * 冒泡排序				  	 O(n2)      -		两个数比较大小，较大的数下沉，较小的数冒起来。
 * 选择排序					 O(n2)		-		在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
												第二次遍历n-2个数，找到最小的数值与第二个元素交换；
												。。。
												第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成。
 * 插入排序(Insertion Sort)	 O(n2)				在要排序的一组数中，假定前n-1个数已经排好序，现在将第n个数插到前面的有序数列中，使得这n个数也是排好顺序的。如此反复循环，直到全部排好顺序。
 * 
 * @author Administrator
 *
 */
public class Sort {

	public int[] array={3,2,9,4,3,8,7,5,4,11,17,14};
	
	/**
	 * 冒牌排序未优化
	 */
	@Test
	public void sortBubble1(){
		
		for(int i=0;i<array.length-1;i++){
			for(int j=array.length-1;j>i;j--){
				
				if(array[j]<array[j-1]){
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
				
			}			
		}
		System.out.println("冒泡排序未优化：");
		for(int  i:array){
			System.out.print(i+",");
		}
		
	}
	
	
	
	/**
	 * 冒泡排序:优化
	 */
	@Test
	public void sortBubble2(){
		int temp;//临时变量
		boolean  flag;//镖旗是否交换的标志
		for(int i=0;i<array.length-1;i++){
			flag=false;
			for(int j=array.length-1;j>i;j--){
				if(array[j]<array[j-1]){
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					flag=true;
				}
				if(!flag)break;				
			}		
		}
		
		for(int i:array){
			System.out.print(i+",");
		}
		
		
	}
	/**
	 * 选择排序
	 */
	@Test
	public void sortSelction(){
		for(int i=0;i<array.length-1;i++){
			int index_min=i;//记录索引的位置,和本轮最小的数的位置
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[index_min]){					
					index_min=j;
				}
			}
			
			if(i!=index_min){
				int temp=array[i];
				array[i]=array[index_min];
				array[index_min]=temp;
				
			}
			
		}
		System.out.println("选择排序：");
		for(int i:array){
			System.out.print(i+",");
		}
		
	}
	
	/**
	 * 插入排序
	 */
	@Test
	public void sortInsert(){
		
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(array[j-1]>array[j]){					
					 int temp= array[j-1];
				     array[j-1] = array[j];
				     array[j] = temp;

				}
				
			}
					
		}
		System.out.println("插入排序：");
		for(int i:array){
			System.out.print(i+",");
		}
		
	}
	/**
	 * 快速排序
	 */
	@Test
	public void sortQuick(){
		sortquick(array,0,array.length-1);
		System.out.println("快速排序：");
		for(int i:array){
			System.out.print(i+",");
		}
	}

	public void sortquick(int[] a,int start,int end){
		
		int l=start;
		int r=end;
		if(l>=r)
			return;

		int i = l; int j = r; int key = array[l];//选择第一个数为key

		 while(i<j){
			
			 while(i<j && array[j]<=key)//从右向左找第一个小于key的值
		       j--;
		    if(i<j){
		      	 array[i] = array[j];
		         i++;
		     }

		    while(i<j && array[i]>key)//从左向右找第一个大于key的值
		       i++;

		    if(i<j){
		      	 array[j] = array[i];
		         j--;
		    }
		 }
		     
		 array[i] = key;
		 sortquick(array, l, i-1);//递归调用
		 sortquick(array, i+1, r);//递归调用		
	}
	
	/**
	 * 递归问题
	 */
	@Test
	public void test(){
		int i=computeAge(3);
		System.out.println(i);
		
	}
	
	public int computeAge(int i){
		
		if(i==1){
			
			return 10;
			
		}else{
			
			int z=(computeAge(--i)+2);
			return z;
		}
		
	}
	
	/**
	 * 约瑟夫环
	 */
	@Test
	public void test2(){
		List<Integer> list=new LinkedList<>();
		for(int i=1;i<=6;i++){
			list.add(i);
		}
		int i=0;
		for(int n=1;n<100;n++){
			i=(i+3)%list.size();
			System.out.println("移除的元素"+list.remove(i));
			list.remove(i);
		}
		
		System.out.println("最后的元素："+list.get(0));
	}
	/**
	 * 约瑟夫环
	 * 
	 */
	@Test
	public void testYue(){
		//1.定义一个boolean的数组，将数组全部值为true；
		boolean[] array=new boolean[8];
		for(int i=0;i<8;i++){
			array[i]=true;
			
		}
		int total=array.length;
		int count=0;
		int i=0;
		while(total>1){
			if(array[i]==true){
				count++;
				
			}
			
			if(count ==3){
				count=0;
				total--;
				array[i]=false;
				
			}
			i++;
			if(i==array.length){
				i=0;
				
			}
			
			
		}
		
		
		
		
	}
	
	/**
	 * 约瑟夫环
	 * 
	 */
	@Test
	public void testYue1(){
		final int k=2;//从编号为1的人开始
		final int num=6;//总共有多少人
		final int m=4;//数到m时就出列		
		//1.定义一个boolean的数组，将数组全部值为true；
		boolean[] array=new boolean[num];
		for(int i=0;i<num;i++)			array[i]=true;			
		int total=array.length;
		int count=0;
		int i=0;				
		for(i=k;total>1;i++){
			if(i==num)i=0;			
			if(array[i]==true)count++;			
			if(count==m){
				count=0;
				array[i]=false;
				System.out.println(i+"被踢出");
				total--;
			}			
		}		
		for(i=0;i<array.length;i++){
			if(array[i]==true){
				System.out.println("----还剩："+i);				
			}
			
		}
		
	}
	/**
	 * 测试二叉树的翻转
	 * 		a
	 * 	b		c
	 * d e		f
	 */
	@Test
	public void testSolu(){
		
		
	}
	
}
	
	
	

