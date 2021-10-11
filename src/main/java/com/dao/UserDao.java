package com.dao;

import com.dto.UserAdmin;

public interface UserDao {
	public boolean validateUser(UserAdmin user) ;
	public int insertUser(UserAdmin user);
	public boolean changePwd(UserAdmin user, String newPwd) ;


}
