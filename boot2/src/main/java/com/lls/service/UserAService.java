package com.lls.service;

import com.lls.entity.UserA;

public interface UserAService {
	public void setUserA(UserA userA);
	public UserA getUserByQQAndPassword(String qq,String password);
	public UserA getUserByQQ(String qq);

}
