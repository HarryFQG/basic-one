package com.it.inner;

public class Test01 {
	
	
	public static void main(String[] args) {
		Son son=new Son();
		/**
		 * �����ڲ�����Լ̳г����࣬��Ҫʵ������ĳ��󷽷��������������ر��ص�
		 */
		son.getInc(new FatherClass(10){

			@Override
			public int getId(int id) {
				
				return id;
			}});
		/**
		 * �ӿ�Ҳ���Խ��������ڲ��࣬����ҲҪʵ�������δʵ�ֵķ���
		 */
		son.getSex(new Interface1(){
			
			@Override
			public void getSex(FatherClass f) {
				System.out.println("If:"+f.id);
				f.getId(f.id);
				
			}}, new FatherClass(1000) {//�����̳г����࣬
				
				@Override
				public int getId(int id) {
					System.out.println("IgetSex:");
					return id;
				}
			});
		
		/**
		 * ʵ����Ҳ���Խ�������
		 */
		son.getname(new FatherEntry());
		
	}
}
