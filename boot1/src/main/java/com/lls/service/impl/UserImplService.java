package com.lls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lls.dao.UserDAO;
import com.lls.entity.User;
import com.lls.service.UserService;

@Transactional()
@Service
public class UserImplService implements UserService{
	@Autowired
	private UserDAO userDAO;
	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

}
