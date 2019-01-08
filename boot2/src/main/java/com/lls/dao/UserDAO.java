package com.lls.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.lls.entity.User;

public interface UserDAO {
	@Select("select * from erp_user")
	public List<User> getUsers();
	
}
