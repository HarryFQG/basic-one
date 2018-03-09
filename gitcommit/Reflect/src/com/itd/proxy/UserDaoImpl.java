package com.itd.proxy;

public class UserDaoImpl implements UserDao{

	@Override
	public int add(int id) {
		System.out.println("添加方法"+id);
		return 1;
	}

	@Override
	public int update(int id) {
		System.out.println("更新方法");
		return 3;
	}

	@Override
	public int delete(int id) {
		System.out.println("删除方法");
		return 2;
	}

}
