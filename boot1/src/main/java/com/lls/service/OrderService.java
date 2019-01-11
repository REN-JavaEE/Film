package com.lls.service;

import java.util.List;

import com.lls.entity.OrderA;

public interface OrderService {
	public List<OrderA> getOrderInfos();
	public void addOrderInfo(OrderA orderInfo);
}
