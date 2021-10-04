package com.dao;

import com.dto.User;

public interface UserDao {
	public boolean validateUser(User user) ;
	public int insertUser(User user);
	public boolean changePwd(User user, String newPwd) ;


}
