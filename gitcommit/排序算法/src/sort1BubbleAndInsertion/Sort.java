package sort1BubbleAndInsertion;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

import org.junit.Test;

/**
 * �����㷨�л�����8�֣�
 * �ȶ����㷨�У�ð�ݡ����롢�鲢������
 * ���ȶ����㷨��ѡ�񡢿��١�ϣ��������
 * �����㷨					ʱ�临�Ӷ�				����˼·
 * ð������				  	 O(n2)      -		�������Ƚϴ�С���ϴ�����³�����С����ð������
 * ѡ������					 O(n2)		-		�ڳ���ΪN�����������У���һ�α���n-1�������ҵ���С����ֵ���һ��Ԫ�ؽ�����
												�ڶ��α���n-2�������ҵ���С����ֵ��ڶ���Ԫ�ؽ�����
												������
												��n-1�α������ҵ���С����ֵ���n-1��Ԫ�ؽ�����������ɡ�
 * ��������(Insertion Sort)	 O(n2)				��Ҫ�����һ�����У��ٶ�ǰn-1�����Ѿ��ź������ڽ���n�����嵽ǰ������������У�ʹ����n����Ҳ���ź�˳��ġ���˷���ѭ����ֱ��ȫ���ź�˳��
 * 
 * @author Administrator
 *
 */
public class Sort {

	public int[] array={3,2,9,4,3,8,7,5,4,11,17,14};
	
	/**
	 * ð������δ�Ż�
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
		System.out.println("ð������δ�Ż���");
		for(int  i:array){
			System.out.print(i+",");
		}
		
	}
	
	
	
	/**
	 * ð������:�Ż�
	 */
	@Test
	public void sortBubble2(){
		int temp;//��ʱ����
		boolean  flag;//�����Ƿ񽻻��ı�־
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
	 * ѡ������
	 */
	@Test
	public void sortSelction(){
		for(int i=0;i<array.length-1;i++){
			int index_min=i;//��¼������λ��,�ͱ�����С������λ��
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
		System.out.println("ѡ������");
		for(int i:array){
			System.out.print(i+",");
		}
		
	}
	
	/**
	 * ��������
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
		System.out.println("��������");
		for(int i:array){
			System.out.print(i+",");
		}
		
	}
	/**
	 * ��������
	 */
	@Test
	public void sortQuick(){
		sortquick(array,0,array.length-1);
		System.out.println("��������");
		for(int i:array){
			System.out.print(i+",");
		}
	}

	public void sortquick(int[] a,int start,int end){
		
		int l=start;
		int r=end;
		if(l>=r)
			return;

		int i = l; int j = r; int key = array[l];//ѡ���һ����Ϊkey

		 while(i<j){
			
			 while(i<j && array[j]<=key)//���������ҵ�һ��С��key��ֵ
		       j--;
		    if(i<j){
		      	 array[i] = array[j];
		         i++;
		     }

		    while(i<j && array[i]>key)//���������ҵ�һ������key��ֵ
		       i++;

		    if(i<j){
		      	 array[j] = array[i];
		         j--;
		    }
		 }
		     
		 array[i] = key;
		 sortquick(array, l, i-1);//�ݹ����
		 sortquick(array, i+1, r);//�ݹ����		
	}
	
	/**
	 * �ݹ�����
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
	 * Լɪ��
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
			System.out.println("�Ƴ���Ԫ��"+list.remove(i));
			list.remove(i);
		}
		
		System.out.println("����Ԫ�أ�"+list.get(0));
	}
	/**
	 * Լɪ��
	 * 
	 */
	@Test
	public void testYue(){
		//1.����һ��boolean�����飬������ȫ��ֵΪtrue��
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
	 * Լɪ��
	 * 
	 */
	@Test
	public void testYue1(){
		final int k=2;//�ӱ��Ϊ1���˿�ʼ
		final int num=6;//�ܹ��ж�����
		final int m=4;//����mʱ�ͳ���		
		//1.����һ��boolean�����飬������ȫ��ֵΪtrue��
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
				System.out.println(i+"���߳�");
				total--;
			}			
		}		
		for(i=0;i<array.length;i++){
			if(array[i]==true){
				System.out.println("----��ʣ��"+i);				
			}
			
		}
		
	}
	/**
	 * ���Զ������ķ�ת
	 * 		a
	 * 	b		c
	 * d e		f
	 */
	@Test
	public void testSolu(){
		
		
	}
	
}
	
	
	

