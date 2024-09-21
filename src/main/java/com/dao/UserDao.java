package com.dao;

public class UserDao {

	static UserDao userDao = null;// 1 time
	// 1 disable ->

	private UserDao() {

	}

	public void add() {
		System.out.println("add");
	}

	public static UserDao getUserDao() {
		if (userDao == null)
			userDao = new UserDao();
		return userDao;
	}
}
