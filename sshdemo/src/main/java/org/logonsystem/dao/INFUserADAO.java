package org.logonsystem.dao;

import org.logonsystem.model.vo.UserA;

public interface INFUserADAO {
	public UserA validateUser(String qq, String password);
}
