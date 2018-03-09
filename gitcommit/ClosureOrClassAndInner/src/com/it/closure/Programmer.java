package com.it.closure;
/**
 * Closure:闭包回调
 * @author Feng
 *
 */
public class Programmer {

	private String name;
	private Integer pid;
	public Programmer(){
		System.out.println("P的无参构造");
	}
	public Programmer(String name, Integer pid) {
		super();
		this.name = name;
		this.pid = pid;
		System.out.println("P的有参构造"+name+","+pid);
	}
	
	public  final void work(){
		System.out.println("我的任务是码代码···");
	}
	public String getName() {
		return name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}	
	
}
