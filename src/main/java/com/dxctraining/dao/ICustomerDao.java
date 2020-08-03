package com.dxctraining.dao;

import java.util.List;

import com.dxctraining.entities.*;

public interface ICustomerDao {
	Customer findById(int id);

	List<Customer> findAll() ;
	
	Customer updateName(int id, String newName);

	void add(Customer student);
	
	Customer update(Customer student);
	
	void delete(int id);

}