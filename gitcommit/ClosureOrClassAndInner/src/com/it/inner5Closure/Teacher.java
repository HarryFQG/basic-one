package com.it.inner5Closure;

public class Teacher {
	private Integer a=0;
	private Integer b=0;
	public Teacher(){		
	}
	/**
	 * 老师要做的事儿：
	 * @param stu
	 * @param a
	 * @param b
	 * @return
	 */
	public int  waiting(Student stu,int a,int b){		
		this.a=a;
		this.b=b;
		int sum=stu.doingThing(this);		
		return sum;
	}
	/**
	 * 老师要做的事儿的具体实现。
	 * @param stu
	 * @param fun
	 * @return
	 */
	public int   waitThing(Student stu,FunctionInterface fun){
		Integer a=this.a;
		Integer b=this.b;	
		int a1=0;
		if(a!=null&&b!=null){			
			System.out.println("老师布置的题目：");
			System.out.println(fun.add(a, b));			
			a1=fun.add(a,b);
		}
		return 	a;		
	}
	
}
