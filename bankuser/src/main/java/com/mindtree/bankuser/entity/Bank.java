package com.mindtree.bankuser.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bankId;
	private String bankName;
	private String bankLocation;
	@Column (columnDefinition = "double default 0")
	private double bankBalance;
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankId")
	private List<User> users;
	public Bank() {
		super();
	}
	public Bank(int bankId, String bankName, String bankLocation, double bankBalance, List<User> users) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankLocation = bankLocation;
		this.bankBalance = bankBalance;
		this.users = users;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", bankLocation=" + bankLocation + ", bankBalance="
				+ bankBalance + ", users=" + users + "]";
	}
	
	
}
