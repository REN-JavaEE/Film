package com.lls.entity;

public class OrderA {
	private int id;
	private String userqq;
	private int filmId;
	private int ticketNum;
	private float totalPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public int getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getUserqq() {
		return userqq;
	}
	public void setUserqq(String userqq) {
		this.userqq = userqq;
	}
	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", userqq=" + userqq + ", filmId=" + filmId + ", ticketNum=" + ticketNum
				+ ", totalPrice=" + totalPrice + "]";
	}
	
}
