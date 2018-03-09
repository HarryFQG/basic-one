package com.it;

public class Demo2 implements Interface1{

	@Override
	public void draw(int x, int y) {
		int n=x;int m=y;
		for(int i=0,l=1;i<n&&l<m+1;i++,l++){
			for(int  j=0;j<l;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}


	
	
}
