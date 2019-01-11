package org.logonsystem.action;

import java.util.Map;

import org.logonsystem.dao.INFUserADAO;
import org.logonsystem.model.vo.UserA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	private UserA userA;
	//处理用户请求的 execute 方法
	public String execute() throws Exception{
		String qq = userA.getQq();
		String password = userA.getPassword();
		ApplicationContext sp_context=new FileSystemXmlApplicationContext(this.getClass().getResource("/")+"/applicationContext.xml");
		ActionContext context=ActionContext.getContext();
		Map<String,Object> session=context.getSession();
		INFUserADAO logonTableDAO=(INFUserADAO)sp_context.getBean("userADAO");
		userA=logonTableDAO.validateUser(qq, password);
		if (userA != null) {
			session.put("userName", userA.getUserName());
			session.put("qq", userA.getQq());
		} else {
			session.put("message", "用户名和密码不正确");
		}

		return "success";
	}
	public UserA getUserA() {
		return userA;
	}
	public void setUserA(UserA userA) {
		this.userA = userA;
	}
}
