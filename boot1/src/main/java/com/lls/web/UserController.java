package com.lls.web;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lls.dao.UserDAO;
import com.lls.entity.User;
import com.lls.service.UserService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private JavaMailSender sender;

	@RequestMapping("do1")
	@ResponseBody
	@ApiOperation(value="显示信息",notes="第一次swagger")
	//@ApiImplicitParam()
	public String do1() {
		return "hello spring boot!";
	}

	@RequestMapping("hello")
	public String do2() {
		return "hello";
	}

	@RequestMapping("showUser")
	public String getUses(Model model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "hello";
	}

	@RequestMapping("html")
	public String getUsers(Model model) throws MessagingException {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true,"UTF-8");
		helper.setFrom("1412837463@qq.com");
		helper.setTo("1412837463@qq.com");
		helper.setSubject("来自林森网的激活邮件");
		helper.setText("hello 老哥！<br>欢迎来到林森的ERP<br>"+"<img src=''>请点击下面的超链接，<a href='http://localhost:8080/user/active?'>激活</a>",true);
		sender.send(message);
		return "templates/hello";
	}
	@RequestMapping("wei")
	@ResponseBody
	public String wei() {
		return "Tom";
	}
}
