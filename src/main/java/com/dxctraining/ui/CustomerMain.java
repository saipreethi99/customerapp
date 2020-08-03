package com.dxctraining.ui;

import java.util.*;

import com.dxctraining.entities.*;
import com.dxctraining.exceptions.CustomerNotFoundException;
import com.dxctraining.exceptions.InvalidArgumentException;
import com.dxctraining.service.ICustomerService;
import com.dxctraining.service.ICustomerServiceImpl;

public class CustomerMain {
	private ICustomerService service = new ICustomerServiceImpl();
	public static void main(String args[]) {
		CustomerMain obj1 = new CustomerMain();
		obj1.runapp();
	}

	public void runapp() {
		try {
		Account account1 = new Account(2000.0, "SU899I");
		Account account2 = new Account(7500.0, "YU925E");
		Account account3 = new Account(5000.0,"IO779L");
		RegularCustomer cust = new RegularCustomer(1082, "preethi",account1, "hyderabad");
		service.add(cust);
		int id1=cust.getId();
		BusinessCustomer cust2 = new BusinessCustomer(7871, "priya",account2, "srd");
		service.add(cust2);
		BusinessCustomer cust3 = new BusinessCustomer(9891,"isu",account3,"rangareddy");
		service.add(cust3);
		int id2=cust2.getId();
		service.delete(cust2.getId());
		service.updateName(cust.getId(),"chinnu" );
		Customer fetched=service.findById(3);
		display(fetched);		
		System.out.println("********display all students******");
		displayAll();
		}catch(InvalidArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		catch(CustomerNotFoundException e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
		 e.printStackTrace();
		 System.out.println("some thing went wrong");
		}
	}
public void displayAll() {
	List<Customer> list = service.findAll();
	for (Customer customer : list) {
		display(customer);
	}
}
public void display(Customer customer) {
	System.out.println("Customer " + customer.getPinNo() + " " + customer.getName());
	Account account = customer.getAccount();
	System.out.println("Account=" + account.getBalance() + " " + account.getPancard());
	if (customer instanceof RegularCustomer) {
		RegularCustomer rc = (RegularCustomer) customer;
		System.out.println("Customer address is " + rc.getHouseAddress());
	}

	if (customer instanceof BusinessCustomer) {
		BusinessCustomer bc= (BusinessCustomer) customer;
		System.out.println("Business Address is " + bc.getBusinessAddress());
	}

	}
	public void display(RegularCustomer rc) {
		int pinno=rc.getPinNo();
		String name=rc.getName();
		String address=rc.getHouseAddress();
		Account account=rc.getAccount();
		System.out.println("********REGULAR ACCOUNT******");
		System.out.println("name :"+pinno+"name"+name+"address"+address);
		System.out.println("balance :"+account.getBalance()+"pancard"+account.getPancard());
		
	}
	public void display(BusinessCustomer bc) {
		int pinno=bc.getPinNo();
		String name=bc.getName();
		String address=bc.getBusinessAddress();
		Account account=bc.getAccount();
		System.out.println("*******BUSINESS ACCOUNT*******");
		System.out.println("name :"+pinno+"name"+name+"address"+address);
		System.out.println("balance :"+account.getBalance()+"pancard"+account.getPancard());
	}
}