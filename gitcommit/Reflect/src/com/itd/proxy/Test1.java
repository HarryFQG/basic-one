package com.itd.proxy;

public class Test1 {

	public static void main(String[] args) {
		UserDao userDao=ProxyFactory.createUserServiceProxy();
		userDao.add(1);
		userDao.update(20);
	}
	
}
