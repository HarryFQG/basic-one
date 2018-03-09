package com.it.inner;

public class Test01 {
	
	
	public static void main(String[] args) {
		Son son=new Son();
		/**
		 * 匿名内部类可以继承抽象类，但要实现里面的抽象方法。可以拿来做必报回调
		 */
		son.getInc(new FatherClass(10){

			@Override
			public int getId(int id) {
				
				return id;
			}});
		/**
		 * 接口也可以进行匿名内部类，但是也要实现里面的未实现的方法
		 */
		son.getSex(new Interface1(){
			
			@Override
			public void getSex(FatherClass f) {
				System.out.println("If:"+f.id);
				f.getId(f.id);
				
			}}, new FatherClass(1000) {//匿名继承抽象类，
				
				@Override
				public int getId(int id) {
					System.out.println("IgetSex:");
					return id;
				}
			});
		
		/**
		 * 实体类也可以进行匿名
		 */
		son.getname(new FatherEntry());
		
	}
}
