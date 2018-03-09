package com.it;

public class Demo3 extends Demo1{

	public Demo3(){
		
	}
	public Demo3(Interface1 demo2){
		super(demo2);
	}
	@Override
	public void draw(int x,int y){
		//demo12.draw(x, y);
		draw2(x,y);
	}
	/**
	 * ÉÏÆÂÐÍ
	 * @param x
	 * @param y
	 */
	private  void draw2(int x,int y){
		int n=x,m=y;
		for(int i=0;i<n;i++){				
			for(int t=m-i-1;t>0;t--){
				System.out.print("#");
			}
			for(int t=i;t>=0;t--){
				System.out.print("$");				
			}			
			System.out.println();
			
		}
		
		
		
	}
	
	
}
