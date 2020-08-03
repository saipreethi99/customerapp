package com.dxctraining.entities;

public class Customer {
	private int id;
	private int pinno;
	private String name;
	private Account account;
	public Customer(int pinno,String name,Account account){
		this.pinno=pinno;
		this.name=name;
		this.account=account;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPinNo() {
		return pinno;
	}
	public void setPinNo(int pinno) {
		this.pinno=pinno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Customer) ) {
			return false;
	   }
		
	    Customer that=(Customer)arg;	
		boolean isequal=this.id==that.id;
		return isequal;
	}
	
}