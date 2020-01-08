package com.mindtree.bankuser.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private double openingBalance;
	public User() {
		super();
	}
	public User(int userId, String userName, double openingBalance) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.openingBalance = openingBalance;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", openingBalance=" + openingBalance + "]";
	}
	

}
