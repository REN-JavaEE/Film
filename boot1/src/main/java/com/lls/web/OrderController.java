package com.lls.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lls.entity.OrderA;
import com.lls.erpweb.derive.MyPdf;
import com.lls.service.OrderService;

@Controller
@RequestMapping("orderinfo")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@RequestMapping("addorder")
	public void addOrder(OrderA orderInfo,HttpSession session,HttpServletResponse response) throws IOException {
		
		System.out.println(orderInfo);
		session.setAttribute("qq", orderInfo.getUserqq());
		orderService.addOrderInfo(orderInfo);
		response.sendRedirect("http://localhost:8088/index.jsp");
	}
}
