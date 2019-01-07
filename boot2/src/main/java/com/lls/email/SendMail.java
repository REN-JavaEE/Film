package com.lls.email;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class SendMail {
@Bean
public JavaMailSender getJavaMailSender() {
	JavaMailSenderImpl sender = new JavaMailSenderImpl();
	Properties prop = new Properties();
	// 开启debug调试，以便在控制台查看
	prop.setProperty("mail.debug", "true");
	// 设置邮件服务器主机名
	prop.setProperty("mail.host", "smtp.qq.com");
	// 发送服务器需要身份验证
	prop.setProperty("mail.smtp.auth", "true");
	// 发送邮件协议名称
	prop.setProperty("mail.transport.protocol", "smtp");
	sender.setJavaMailProperties(prop);
	
	sender.setUsername("1412837463@qq.com");
	sender.setPassword("hxqvmgqzoquzfhei");
	return sender;
}

}
