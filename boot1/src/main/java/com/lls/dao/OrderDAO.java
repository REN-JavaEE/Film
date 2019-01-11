package com.lls.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.lls.entity.OrderA;

public interface OrderDAO {
	@Select("select userqq,filminfo.name name,ticketNum,totalPrice from ordera,filminfo where ordera.filmid=filminfo.id")
	public List<OrderA> getOrderInfos();
	@Insert("insert into orderA(id,userqq,filmId,ticketNum,totalPrice) values(1,#{userqq},#{filmId},#{ticketNum},#{totalPrice})")
	public void addOrderInfo(OrderA orderInfo);
}
