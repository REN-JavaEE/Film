package org.logonsystem.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.logonsystem.dao.BaseDAO;
import org.logonsystem.dao.INFUserADAO;
import org.logonsystem.model.vo.UserA;

public class UserADAO extends BaseDAO implements INFUserADAO {

	public UserA validateUser(String qq, String password) {
		// TODO Auto-generated method stub
		String hql="from UserA where qq=? and password=?";
		Session session=getSession();
		Query query=session.createQuery(hql);
		query.setParameter(0, qq);
		query.setParameter(1, password);
		List users=query.list();
		Iterator it=users.iterator();
		while(it.hasNext())
		{
			if(users.size()!=0){
				UserA logon=(UserA)it.next();	
				return logon;
			}
		}
		session.close();
		return null;
	}
}
