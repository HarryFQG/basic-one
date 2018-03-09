package sort1BubbleAndInsertion;

import org.junit.Test;

public class testSort {

	int a[]={10,7,2,8,4,5,1,3,6,9};
	
	@Test
	public void sort1(){
		int temp;
		boolean flag=false;	
		for(int i=0;i<a.length-1;i++){
			for(int j=a.length-1;j>i;j--){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					flag=true;
				}
				if(!flag)break;
			}
			
		}
	
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
			
		}
		
	}
	
	
	
	@Test
	public void test2(){
		int temp;
		for(int i=0;i<a.length-1;i++){
			int minIndex=i;			
			for(int j=i+1;j<a.length;j++){
				if(a[minIndex]>a[j]){
					minIndex=j;
				}
				
			}
			if(i!=minIndex){
				temp=a[i];
				a[i]=a[minIndex];
				a[minIndex]=temp;
			}
			
			
		}
		

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
			
		}
		
	}
	
	
	@Test
	public void test3(){
		int temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j>0;j--){				
				if(a[j]<a[j-1]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;				
				}else break;
				
			}
			
		}

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
			
		}
		
	}
	@Test
	public void quickSort(){
		sort4(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
			
		}
	}	
	public void sort4(int[] array,int left,int right){
		
		if(left>=right)return ;
		int key=array[left],l=left,r=right;
		while(l<r){
			while(l<r&&array[r]<key){
				r--;				
			}
			if(l<r){
				array[l]=array[r];
				l++;
			}
			while(l<r&&array[l]>=key)l++;
			if(l<r){
				array[r]=array[l];
				r--;
			}
		}
		
		array[l]=key;
		sort4(array,left,l-1);
		sort4(array,l+1,right);
		
	}
	
	@Test
	public void testStr(){
		String str1="hello";
		String str2="hel"+new String("lo");
		String str3="hel"+"lo";
		System.out.println(str1+":"+str1.hashCode()+","+str2+":"+str2.hashCode());
		System.out.println(str1==str2);
		System.out.println("str1==str2"+":"+str1.equals(str2));
		System.out.println(str1==str3);
	}
	
}
