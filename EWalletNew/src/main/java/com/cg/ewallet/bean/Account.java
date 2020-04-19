package com.cg.ewallet.bean;

import java.time.LocalDate;

public class Account {
	long accNum;
	long tID;
	LocalDate date;
	double balance;
	String branch;
	String iFSC;
	Customer cust;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public long gettID() {
		return tID;
	}

	public void settID(long tID) {
		this.tID = tID;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getiFSC() {
		return iFSC;
	}

	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", tID=" + tID + ", date=" + date + ", balance=" + balance + ", branch="
				+ branch + ", iFSC=" + iFSC + ", cust=" + cust + "]";
	}

}
