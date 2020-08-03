package com.dxctraining.entities;

public class RegularCustomer extends Customer{
 private String houseAddress;
 public RegularCustomer(int pinno,String name,Account account,String houseAddress)
 {
	 super(pinno,name,account);
	 this.houseAddress=houseAddress;
 }
 public String getHouseAddress() {
	 return houseAddress;
 }
 public void setHouseAddress(String houseAddress) {
	 this.houseAddress=houseAddress;
 }
 
}