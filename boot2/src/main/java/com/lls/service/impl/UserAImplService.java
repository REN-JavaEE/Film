package com.lls.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lls.dao.UserADAO;
import com.lls.dao.UserDAO;
import com.lls.entity.UserA;
import com.lls.service.UserAService;
@Transactional
@Service
public class UserAImplService implements UserAService {
	@Resource
	private UserADAO userADAO;
	@Override
	public void setUserA(UserA userA) {
		userADAO.setUserA(userA);
	}
	@Override
	public UserA getUserByQQAndPassword(String qq, String password) {
		return userADAO.getUserByQQAndPassword(qq, password);
	}
	@Override
	public UserA getUserByQQ(String qq) {
		return userADAO.getUserByQQ(qq);
	}

}
