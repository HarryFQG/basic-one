package com.it2.am.a5;
/**
 * 定义资源类，有两个成员变量
 * @author Feng
 *字段：name,sex
 *		同时有两个线程，对资源中的变量操作
 *		1个对name,sex赋值
 *		另外一个对name,sex取值
 */
public class Resource {
	public String name;
	public String sex;
	public boolean flag=false;
	
}
