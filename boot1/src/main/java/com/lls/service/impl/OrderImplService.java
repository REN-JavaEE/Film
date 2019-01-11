package com.lls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lls.dao.OrderDAO;
import com.lls.entity.OrderA;
import com.lls.service.OrderService;
@Service
public class OrderImplService implements OrderService{
	@Autowired
	private OrderDAO orderDAO;
	@Override
	public List<OrderA> getOrderInfos() {
		return orderDAO.getOrderInfos();
	}
	@Override
	public void addOrderInfo(OrderA orderInfo) {
		orderDAO.addOrderInfo(orderInfo);
	}

}
