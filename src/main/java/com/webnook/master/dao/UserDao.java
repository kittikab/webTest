package com.webnook.master.dao;

import com.webnook.master.entity.Users;

public interface UserDao {
	
	int createUser(Users user);
	
	int editUser(Users user);
	
	Users getUserByPasswordAndLogin(String password, String login);

}
