package com.it.closure;
/**
 * Closure:�հ��ص�
 * @author Feng
 *
 */
public class Programmer {

	private String name;
	private Integer pid;
	public Programmer(){
		System.out.println("P���޲ι���");
	}
	public Programmer(String name, Integer pid) {
		super();
		this.name = name;
		this.pid = pid;
		System.out.println("P���вι���"+name+","+pid);
	}
	
	public  final void work(){
		System.out.println("�ҵ�����������롤����");
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
