package com.dxctraining.service;

import java.util.List;

import com.dxctraining.entities.Customer;

public interface ICustomerService {
	Customer findById(int id);

	List<Customer> findAll();

	Customer updateName(int id, String newName);

	void add(Customer student);

	Customer update(Customer student);

	void delete(int id);

}