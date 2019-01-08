package com.lls.web;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lls.entity.UserA;
import com.lls.erpweb.exception.MyException;
import com.lls.service.UserAService;

@Controller
@RequestMapping("usera")
@SessionAttributes({ "vaildCode", "qq" })
public class UserAController {
	@Resource
	private UserAService userAService;
	@Resource
	private JavaMailSender sender;

	@RequestMapping("login")
	public String loginUser(@Param("qq") String qq, @Param("password") String password, Model model,
			HttpSession session) {
		
		  /*UserA userA = userAService.getUserByQQAndPassword(qq, password); if (userA !=
		  null) { model.addAttribute("message", "Logon!");
		  session.setAttribute("userName", userA.getUserName()); return "index"; } else
		  { model.addAttribute("message", "用户名和密码不正确"); ; }
*/		 
		return "index";
	}

	@RequestMapping("register")
	public String registerUser(UserA userA, Model model, HttpSession session) {
		System.out.println(userA);
		String qq = userA.getQq().replaceAll("@qq.com", "");
		userA.setQq(qq);
		UserA userA2 = userAService.getUserByQQ(qq);
		System.out.println(userA2 == null);
		System.out.println(session.getAttribute("vaildCode"));
		System.out.println(userA.getVaildCode());
		if (userA2 == null && session.getAttribute("vaildCode") == userA.getVaildCode()) {
			userAService.setUserA(userA);
			model.addAttribute("message", "注册成功！");
			System.out.println(userA);
			model.addAttribute("message2", "Registed!");
		}
		return "index";

	}

	@RequestMapping("getvaildcode")
	public void SendVaildCode(String qq, HttpSession session) {
		String vaildCode = "";
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 10);
			vaildCode += num;
		}
		MimeMessage message = sender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
			helper.setFrom("1412837463@qq.com");
			helper.setTo(qq);
			helper.setSubject("来自JavaEE专周网的激活邮件");
			helper.setText("hello ！<br>欢迎来到JavaEE的电影购票系统<br>" + "你的验证码是：<br>" + vaildCode, true);
		} catch (Exception e) {
			MyException exception = new MyException("邮箱有错！");
		}
		sender.send(message);
		session.setAttribute("vaildCode", vaildCode);
		System.out.println(vaildCode);
		return;
	}
}
