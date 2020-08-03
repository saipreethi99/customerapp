package com.dxctraining.entities;

public class Account {
	private double balance;
	private String pancard;
	public Account(double balance,String pancard)
	{
		this.balance=balance;
		this.pancard=pancard;
		
	}
	public Account(){
		this(0,"");
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	
}
