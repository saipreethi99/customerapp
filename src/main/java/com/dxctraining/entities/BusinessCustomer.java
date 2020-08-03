package com.dxctraining.entities;

public class BusinessCustomer extends Customer{
	private String businessAddress;
	 public BusinessCustomer(int pinno,String name,Account account,String businessAddress)
	 {
		 super(pinno,name,account);
		 this.businessAddress=businessAddress;
	 }
	 public String getBusinessAddress() {
		 return businessAddress;
	 }
	 public void setBusinessAddress(String businessAddress) {
		 this.businessAddress=businessAddress;
	 }

}