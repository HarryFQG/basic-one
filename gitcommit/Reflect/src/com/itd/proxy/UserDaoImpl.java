package com.itd.proxy;

public class UserDaoImpl implements UserDao{

	@Override
	public int add(int id) {
		System.out.println("��ӷ���"+id);
		return 1;
	}

	@Override
	public int update(int id) {
		System.out.println("���·���");
		return 3;
	}

	@Override
	public int delete(int id) {
		System.out.println("ɾ������");
		return 2;
	}

}
