package com.it.closure;

/**
 * 
 * @author Feng
 *
 */
/*
 * 这里没有让我们写接口未实现的方法，是因为在集成的类中已经写了一个方法签名一样的方法。其实用的是继承中的方法
 */
public class TeachableProgramer  extends Programmer implements Teachable1{
	/*
	 * 在这里实现不了既可以做老师的事儿（worker方法）又可以做程序员的事儿（worker）方法
	 * 解决：看TeachableProgramer1.java
	 */
	
	
}
